package th.co.icc.tigerjob

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.IntentSender
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.os.Bundle
import android.os.Looper
import android.support.v4.app.ActivityCompat
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.animation.AnimationUtils
import android.view.inputmethod.InputMethodManager
import android.widget.*
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.*
import com.google.android.gms.location.places.GeoDataClient
import com.google.android.gms.location.places.Places
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.*
import kotlinx.android.synthetic.main.activity_searchmap.*
import sweetalert.SweetAlertDialog
import th.co.icc.tigerjob.config.Config
import java.io.IOException

class SearchMapActivity : BaseActivity(),OnMapReadyCallback {

    var googleMap: GoogleMap? = null
    lateinit var latLng: LatLng
    lateinit var mLocationRequest: LocationRequest
    lateinit var mFusedLocationClient: FusedLocationProviderClient
    lateinit var mLocationCallback: LocationCallback
    lateinit var mGeoDataClient: GeoDataClient
    lateinit var mSettingsClient: SettingsClient
    lateinit var mLocationSettingsRequest: LocationSettingsRequest
    private val REQUEST_CHECK_SETTINGS = 0x1
    var isAutoCompleteLocation = false
    lateinit var location: Location
    val REQUEST_LOCATION = 1011
    val BOUNDS_INDIA = LatLngBounds(LatLng(13.6887061, 100.5266476),LatLng(13.6887061, 100.5266476))

    var marker: Marker? = null
    lateinit var total : String
    var Lat1 : Double? = null
    var Long1 : Double? = null
    var GPS : LatLng? = null

    lateinit var enter_place : EditText
    lateinit var enter_place2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchmap)

        total = intent.getStringExtra(Config.CODE_ADD)

        getLocationFromAddress(this,total)

        MapsInitializer.initialize(this)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        enter_place = findViewById(R.id.enter_place)
        enter_place2 = findViewById(R.id.enter_place2)

        enter_place.setText(total, TextView.BufferType.EDITABLE)

        enter_place2.setOnClickListener {

            val layout = findViewById<ImageView>(R.id.enter_place2)
            val anim = AnimationUtils.loadAnimation(this, R.anim.hover)
            layout.startAnimation(anim)

            searchMapInMapFromAddress(this,enter_place.text.toString())

            hideKeyboard()
        }

//        mGeoDataClient = Places.getGeoDataClient(this, null);

        mLocationCallback = object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult?) {
//                val loc = locationResult!!.lastLocation
                if(!isAutoCompleteLocation) {
//                    location = loc
                    latLng = GPS!!
                    assignToMap()
                }
            }

        }

    }

    private fun searchMapInMapFromAddress(context:Context, strAddress:String):LatLng? {
        val coder = Geocoder(context)
        val address:List<Address>
        var p1: LatLng? = null
        try
        {
            // May throw an IOException
            address = coder.getFromLocationName(strAddress, 5)
            if (address == null)
            {
                return null
            }
            val location = address.get(0)
            p1 = LatLng(location.latitude, location.longitude)
            GPS = p1
            latLng = GPS!!
            assignToMap()

            setActionBarTitle(GPS!!.latitude.toString().substring(0,7)+" & "+GPS!!.longitude.toString().substring(0,7))

            Log.wtf("searchMapInMapFromAddress",GPS.toString())

        }
        catch (ex: IOException) {
            ex.printStackTrace()
        }
        return p1
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_map, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        // Handle item selection
        when (item?.itemId) {
            android.R.id.home -> {
                this.finish()
            }
            R.id.menu_map -> {

                if (GPS != null){

                    Lat1 = GPS!!.latitude
                    Long1 = GPS!!.longitude

                    val intent = Intent(applicationContext,CustomerActivity::class.java)
                    intent.putExtra(Config.CODE_Lat, Lat1!!)
                    intent.putExtra(Config.CODE_Long, Long1!!)
                    setResult(Activity.RESULT_OK,intent)
//                  startActivity(intent)
                    hideKeyboard()

                    this.finish()

                }else{

                    val authenStatusSwal = SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                    authenStatusSwal.titleText = "คำเตือน"
                    authenStatusSwal.showContentText(true)
                    authenStatusSwal.contentText = "กรุณาเลือกตำแหน่งในแผนที่"
                    authenStatusSwal.setConfirmClickListener {
                        authenStatusSwal.dismissWithAnimation()
                    }
                    authenStatusSwal.show()
                }

            }
        }
        return false
    }

    private fun getLocationFromAddress(context:Context, strAddress:String):LatLng? {
        val coder = Geocoder(context)
        val address:List<Address>
        var p1: LatLng? = null
        try
        {
            // May throw an IOException
            address = coder.getFromLocationName(strAddress, 5)
            if (address == null)
            {
                return null
            }
            val location = address.get(0)
            p1 = LatLng(location.latitude, location.longitude)
            GPS = p1

            setActionBarTitle(GPS!!.latitude.toString().substring(0,7)+" & "+GPS!!.longitude.toString().substring(0,7))

        }
        catch (ex: IOException) {
            ex.printStackTrace()
        }
        return p1
    }

    private fun assignToMap() {
        Log.wtf("assignToMap", "assignToMap")
        googleMap?.clear()

        googleMap?.setOnMapClickListener { latlng ->
            if (marker != null) {
                marker!!.remove()
            }
            marker = googleMap!!.addMarker(MarkerOptions()
                .position(latlng)
                .title(total)
                .icon(
                    BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_RED)))
            Log.wtf("location",latlng.toString())
            GPS = latlng
            Log.wtf("newlocation",GPS.toString())

            latLng = GPS!!
            assignToMap()

            try
            {
                setActionBarTitle(GPS!!.latitude.toString().substring(0,7)+" & "+GPS!!.longitude.toString().substring(0,7))

            } catch (e: PackageManager.NameNotFoundException) {
                e.printStackTrace()
                setActionBarTitle(getString(R.string.app_name))
            }
        }

        googleMap?.apply {
            Log.wtf("googleMap", "googleMap")
            marker = googleMap!!.addMarker(MarkerOptions()
                .position(latLng)
                .title(total)
                .icon(
                    BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_RED)))
            moveCamera(CameraUpdateFactory.newLatLng(latLng))
            animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 15f))
        }
    }

    private fun getLastLocation() {
        try {

            if (GPS != null){
                mFusedLocationClient.getLastLocation()?.addOnCompleteListener { task ->
                    if (task.isSuccessful && task.result != null) {
                        location = task.result!!
                        latLng = GPS!!
                        assignToMap()
                        Log.wtf("Location", "Complete to get location. Non null1")
                    } else {
                        Log.wtf("Location", "Complete to get location. Non null2")
                    }
                }
            }else{
                mFusedLocationClient.getLastLocation()?.addOnCompleteListener { task ->
                    if (task.isSuccessful && task.result != null) {
                        location = task.result!!
                        latLng = LatLng(location.latitude, location.longitude)
                        assignToMap()
                        Log.wtf("Location", "Failed to get location. Null1")
                    } else {
                        Log.wtf("Location", "Failed to get location. Null2")
                    }
                }
            }

        } catch (unlikely: SecurityException) {
            Log.e("Location", "Lost location permission." + unlikely)
        }

    }

    private fun initLocation() {
        try {
            mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this@SearchMapActivity)
            getLastLocation()
            try {

                mSettingsClient.checkLocationSettings(mLocationSettingsRequest)
                    .addOnSuccessListener(this) {
                        mFusedLocationClient.requestLocationUpdates(mLocationRequest,
                            mLocationCallback, Looper.myLooper());
                    }.addOnFailureListener(this) { p0 ->
                        val statusCode = (p0 as ApiException).getStatusCode();
                        when (statusCode) {
                            LocationSettingsStatusCodes.RESOLUTION_REQUIRED -> {
                                Log.i("Location", "Location settings are not satisfied. Attempting to upgrade " +
                                        "location settings ")
                                try {
                                    // Show the dialog by calling startResolutionForResult(), and check the
                                    // result in onActivityResult().
                                    val rae = p0 as ResolvableApiException
                                    rae.startResolutionForResult(this@SearchMapActivity, REQUEST_CHECK_SETTINGS)
                                } catch (sie: IntentSender.SendIntentException) {
                                    Log.i("Location", "PendingIntent unable to execute request.")
                                }
                            }

                            LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE ->
                                Toast.makeText(this@SearchMapActivity, "Location settings are inadequate, and cannot be \"+\n" +
                                        "                                    \"fixed here. Fix in Settings.", Toast.LENGTH_LONG).show();


                        }
                    }

            } catch (unlikely: SecurityException) {
                Log.e("Location", "Lost location permission. Could not request updates. " + unlikely)
            }
        } catch (e: SecurityException) {
            e.printStackTrace()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


    override fun onMapReady(p0: GoogleMap?) {
        Log.v("googleMap", "googleMap==" + googleMap)
        googleMap = p0
        googleMap?.setMapType(GoogleMap.MAP_TYPE_NORMAL)
        googleMap?.getUiSettings()?.apply {
            isZoomControlsEnabled = true
            isCompassEnabled = true
            isMyLocationButtonEnabled = true
        }
    }


    /* To hide Keyboard */
    fun hideKeyboard() {
        try {
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_LOCATION) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED) {
                initLocation()
            } else {
                Toast.makeText(this@SearchMapActivity, "denied", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun checkPermissions(): Boolean {
        val permissionState = ActivityCompat.checkSelfPermission(this,
            Manifest.permission.ACCESS_FINE_LOCATION)
        return permissionState == PackageManager.PERMISSION_GRANTED
    }

    private fun requestPermissions() {
        ActivityCompat.requestPermissions(
            this,
            arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), REQUEST_LOCATION)

    }

    override fun onResume() {
        super.onResume()
        if (checkPermissions()) {
            initLocation()
        } else {
            requestPermissions()
        }
    }




}

