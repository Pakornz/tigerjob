package th.co.icc.tigerjob

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AlertDialog
import android.support.v7.widget.CardView
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.*
import android.view.animation.AnimationUtils
import android.view.inputmethod.InputMethodManager
import android.widget.*
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import sweetalert.SweetAlertDialog
import th.co.icc.tigerjob.api.Service
import th.co.icc.tigerjob.api.modelapi.ListZipCode
import th.co.icc.tigerjob.api.modelapi.RunningCustomer
import th.co.icc.tigerjob.config.Config
import th.co.icc.tigerjob.database.RealmDb
import th.co.icc.tigerjob.database.modelrealm.Check
import th.co.icc.tigerjob.database.modelrealm.CreateCustomer
import th.co.icc.tigerjob.database.modelrealm.Customer
import java.util.*
import kotlin.collections.ArrayList


@Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class CustomerActivity : BaseActivity(),OnMapReadyCallback {

        lateinit var no1 : TextView
        lateinit var no2 : EditText
        lateinit var no3 : EditText
        lateinit var no4 : TextView
        lateinit var no5 : TextView
        lateinit var no6 : EditText
        lateinit var no7 : TextView
        lateinit var no8 : TextView
        lateinit var no10 : TextView
        lateinit var no11 : TextView
        lateinit var save_button : Button
        var show_map : LinearLayout? = null
        lateinit var searchmapshow : LinearLayout

        lateinit var searchmap : CardView
        lateinit var searchmap2 : ImageView
        lateinit var textmap2 : TextView

        private lateinit var mMap: GoogleMap
        val markerPoints = ArrayList<LatLng>()
        var marker: Marker? = null

        lateinit var callApi : Service
        var LL : String? = null
        var Lat : Double? = null
        var Long : Double? = null
        var Lat1 : Double = 13.6887061
        var Long1 : Double = 100.5266476

        private var showButton : Boolean = false
        private var closeShow : Boolean = false
        lateinit var aListAdapter : SelectZipcodeListAdapter
        lateinit var aListAdapter2 : SelectZipcodeListAdapter2
        lateinit var aListAdapter3 : SelectZipcodeListAdapter3
        var zipid : String = ""
        var p1 : String = ""
        var p2 : String = ""
        var p3 : String = ""
        var p4 : String = ""
        var REQUEST_CODE = 1
        var posit : Int = 0
        var positoon : Int? = null

        val pre = "TDL"
        val typ = "CREATE_CUSTOMER"
        val zipcodeBKK = "10"

        lateinit var NewDate : String
        private var currentViewDate = Date()
        private val dateFormat = "dd/MM/yyyy"
        private val formatter = java.text.SimpleDateFormat(dateFormat, Locale("th", "TH"))

    override fun onCreate(savedInstanceState: Bundle?) {

            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_customer)

            NewDate = formatter.format(currentViewDate).toString()

            initRealmDatabase()

            createRunningCustomer(pre,typ)

            bindViews()

            setEvents()

            hideStatus()

        }

        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            try
            {
                super.onActivityResult(requestCode, resultCode, data)
                if (requestCode == REQUEST_CODE && resultCode == RESULT_OK)
                {
                    Lat = data?.getDoubleExtra(Config.CODE_Lat,Lat1)
                    Long = data?.getDoubleExtra(Config.CODE_Long,Long1)
                    LL = "$Lat,$Long"

                    no7.text = Lat.toString()
                    no8.text = Long.toString()

                    onMapReady(mMap)

                    searchmapshow.visibility = View.GONE
                    searchmap2.visibility = View.VISIBLE
                    textmap2.visibility = View.VISIBLE

                    showStatus()
                    val animSlideDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down)
                    show_map?.startAnimation(animSlideDown)

                    Log.wtf("ffffffffffffff",LL.toString())
                }
            }
            catch (ex:Exception) {
                Toast.makeText(this@CustomerActivity, ex.toString(),
                    Toast.LENGTH_SHORT).show()
            }
        }

        private fun createRunningCustomer(pre:String,typ:String){
            callApi = Service()
            callApi.getApiCreateCustomer(pre,typ,object : Service.ApiCallBack {
                override fun onGetData(data:Any?) {

                    Log.wtf("11111111111111111",data.toString())

                    val yt = data as RunningCustomer
                    no1.text = yt.message

                }
                override fun onError(err: String) {
                    Log.wtf("33333333333333","333333333333333")
                }
            })
        }

        private fun bindViews()
        {

            no1 = findViewById(R.id.no1)
            no2 = findViewById(R.id.no2)
            no3 = findViewById(R.id.no3)
            no4 = findViewById(R.id.no4)
            no5 = findViewById(R.id.no5)
            no6 = findViewById(R.id.no6)
            no7 = findViewById(R.id.no7)
            no8 = findViewById(R.id.no8)
            no10 = findViewById(R.id.no10)
            no11 = findViewById(R.id.no11)
            save_button = findViewById(R.id.save_button)
            show_map = findViewById(R.id.show_map)
            searchmapshow = findViewById(R.id.searchmapshow)

            searchmap = findViewById(R.id.searchmap)
            searchmap2 = findViewById(R.id.searchmap2)
            textmap2 = findViewById(R.id.textmap2)

        }

        private fun setEvents()
        {
            val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
            mapFragment.getMapAsync(this)

            searchmapshow.setOnClickListener {

                val layout = findViewById<LinearLayout>(R.id.searchmapshow)
                val anim = AnimationUtils.loadAnimation(this, R.anim.hover)
                layout.startAnimation(anim)

                val Address          = no3.text.toString().trim()
                val District         = no10.text.toString().trim()
                val SubDistrict      = no11.text.toString().trim()
                val Province         = no4.text.toString().trim()
                val Zipcode          = no5.text.toString().trim()
                val Total : String

                if ( Address.isEmpty() )
                {
                    val authenStatusSwal = SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                    authenStatusSwal.titleText = "คำเตือน"
                    authenStatusSwal.showContentText(true)
                    authenStatusSwal.contentText = "กรุณาใส่ที่อยู่"
                    authenStatusSwal.setConfirmClickListener {
                        authenStatusSwal.dismissWithAnimation()
                    }
                    authenStatusSwal.show()
                    return@setOnClickListener
                }

                if ( Zipcode.isEmpty() || Province.isEmpty() )
                {
                    val authenStatusSwal = SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                    authenStatusSwal.titleText = "คำเตือน"
                    authenStatusSwal.showContentText(true)
                    authenStatusSwal.contentText = "กรุณาใส่รหัสไปรษณีย์"
                    authenStatusSwal.setConfirmClickListener {
                        authenStatusSwal.dismissWithAnimation()
                    }
                    authenStatusSwal.show()
                    return@setOnClickListener
                }

                if ( District.isEmpty() )
                {
                    val authenStatusSwal = SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                    authenStatusSwal.titleText = "คำเตือน"
                    authenStatusSwal.showContentText(true)
                    authenStatusSwal.contentText = "กรุณาใส่ เขจ/อำเภอ"
                    authenStatusSwal.setConfirmClickListener {
                        authenStatusSwal.dismissWithAnimation()
                    }
                    authenStatusSwal.show()
                    return@setOnClickListener
                }

                if ( SubDistrict.isEmpty() )
                {
                    val authenStatusSwal = SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                    authenStatusSwal.titleText = "คำเตือน"
                    authenStatusSwal.showContentText(true)
                    authenStatusSwal.contentText = "กรุณาใส่ แขวง/ตำบล"
                    authenStatusSwal.setConfirmClickListener {
                        authenStatusSwal.dismissWithAnimation()
                    }
                    authenStatusSwal.show()
                    return@setOnClickListener
                }

                Total = if (Zipcode.substring(0,2) == zipcodeBKK){
                    "$Address แขวง$SubDistrict เขต$District จังหวัด$Province $Zipcode"
                }else{
                    "$Address ตำบล$SubDistrict อำเภอ$District จังหวัด$Province $Zipcode"
                }

                val intent = Intent(applicationContext, SearchMapActivity::class.java)
                intent.putExtra(Config.CODE_ADD, Total)
                startActivityForResult(intent,REQUEST_CODE)
            }

            searchmap.setOnClickListener {

                val layout = findViewById<ImageView>(R.id.searchmap2)
                val layout2 = findViewById<TextView>(R.id.textmap2)
                val anim = AnimationUtils.loadAnimation(this, R.anim.hover)
                layout.startAnimation(anim)
                layout2.startAnimation(anim)

                val Address          = no3.text.toString().trim()
                val District         = no10.text.toString().trim()
                val SubDistrict      = no11.text.toString().trim()
                val Province         = no4.text.toString().trim()
                val Zipcode          = no5.text.toString().trim()
                val Total : String

                if ( Address.isEmpty() )
                {
                    val authenStatusSwal = SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                    authenStatusSwal.titleText = "คำเตือน"
                    authenStatusSwal.showContentText(true)
                    authenStatusSwal.contentText = "กรุณาใส่ที่อยู่"
                    authenStatusSwal.setConfirmClickListener {
                        authenStatusSwal.dismissWithAnimation()
                    }
                    authenStatusSwal.show()
                    return@setOnClickListener
                }

                if ( Zipcode.isEmpty() || Province.isEmpty() )
                {
                    val authenStatusSwal = SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                    authenStatusSwal.titleText = "คำเตือน"
                    authenStatusSwal.showContentText(true)
                    authenStatusSwal.contentText = "กรุณาใส่รหัสไปรษณีย์"
                    authenStatusSwal.setConfirmClickListener {
                        authenStatusSwal.dismissWithAnimation()
                    }
                    authenStatusSwal.show()
                    return@setOnClickListener
                }

                if ( District.isEmpty() )
                {
                    val authenStatusSwal = SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                    authenStatusSwal.titleText = "คำเตือน"
                    authenStatusSwal.showContentText(true)
                    authenStatusSwal.contentText = "กรุณาใส่ เขจ/อำเภอ"
                    authenStatusSwal.setConfirmClickListener {
                        authenStatusSwal.dismissWithAnimation()
                    }
                    authenStatusSwal.show()
                    return@setOnClickListener
                }

                if ( SubDistrict.isEmpty() )
                {
                    val authenStatusSwal = SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                    authenStatusSwal.titleText = "คำเตือน"
                    authenStatusSwal.showContentText(true)
                    authenStatusSwal.contentText = "กรุณาใส่ แขวง/ตำบล"
                    authenStatusSwal.setConfirmClickListener {
                        authenStatusSwal.dismissWithAnimation()
                    }
                    authenStatusSwal.show()
                    return@setOnClickListener
                }

                Total = if (Zipcode.substring(0,2) == zipcodeBKK){
                    "$Address แขวง$SubDistrict เขต$District จังหวัด$Province $Zipcode"
                }else{
                    "$Address ตำบล$SubDistrict อำเภอ$District จังหวัด$Province $Zipcode"
                }

                val intent = Intent(applicationContext, SearchMapActivity::class.java)
                intent.putExtra(Config.CODE_ADD, Total)
                startActivityForResult(intent,REQUEST_CODE)
            }

            no5.setOnClickListener {

                aListAdapter = SelectZipcodeListAdapter()
                aListAdapter.onVideoClick = object : SelectZipcodeListAdapter.OnVideoClick  //set button
                {
                    override fun onClickUser(type: ListZipCode.DataBean) {

                        p1 = type.province_name
                        p2 = type.post_code

                        if (p1 == "" && p2 == ""){
                            showButton = true
                            p1 = no4.text.toString()
                            p2 = no5.text.toString()
                            Log.wtf("dfd","non null")
                        }else{
                            showButton = true
//                            p1 = no4.text.toString()
//                            p2 = no5.text.toString()
                            Log.wtf("dfd","null")
                        }
                    }
                }

                showSelectTypeDialog()

            }

            no10.setOnClickListener {

                val Zipcode = no5.text.trim()

                if ( Zipcode.isEmpty() )
                {
                    val authenStatusSwal = SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                    authenStatusSwal.titleText = "คำเตือน"
                    authenStatusSwal.showContentText(true)
                    authenStatusSwal.contentText = "กรุณาใส่ รหัสไปรษณีย์ ก่อน"
                    authenStatusSwal.setConfirmClickListener {
                        authenStatusSwal.dismissWithAnimation()
                    }
                    authenStatusSwal.show()
                    return@setOnClickListener
                }

                aListAdapter2 = SelectZipcodeListAdapter2()
                aListAdapter2.onVideoClick = object : SelectZipcodeListAdapter2.OnVideoClick  //set button
                {
                    override fun onClickUser(type: ListZipCode.DataBean.DistrictsBean, pos: Int) {

                        p3 = type.district_name
                        posit = pos

                        showButton = true
                    }
                }

                callListDistrict(zipid)

                showSelectTypeDialog2()

            }

            no11.setOnClickListener {

                val Zipcode = no5.text.trim()
                val District = no10.text.trim()

                if ( Zipcode.isEmpty() )
                {
                    val authenStatusSwal = SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                    authenStatusSwal.titleText = "คำเตือน"
                    authenStatusSwal.showContentText(true)
                    authenStatusSwal.contentText = "กรุณาใส่ รหัสไปรษณีย์ ก่อน"
                    authenStatusSwal.setConfirmClickListener {
                        authenStatusSwal.dismissWithAnimation()
                    }
                    authenStatusSwal.show()
                    return@setOnClickListener
                }

                if ( District.isEmpty() )
                {
                    val authenStatusSwal = SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                    authenStatusSwal.titleText = "คำเตือน"
                    authenStatusSwal.showContentText(true)
                    authenStatusSwal.contentText = "กรุณาเลือก เขต/อำเภอ ก่อน"
                    authenStatusSwal.setConfirmClickListener {
                        authenStatusSwal.dismissWithAnimation()
                    }
                    authenStatusSwal.show()
                    return@setOnClickListener
                }

                aListAdapter3 = SelectZipcodeListAdapter3()
                aListAdapter3.onVideoClick = object : SelectZipcodeListAdapter3.OnVideoClick  //set button
                {
                    override fun onClickUser(type: ListZipCode.DataBean.DistrictsBean.SubdistrictsBean) {
                        p4 = type.name

                        showButton = true
                    }
                }

                callListSubDistrict(zipid)

                showSelectTypeDialog3()

            }

            save_button.setOnClickListener { uploadInfoDialog() }
        }

        private fun showStatus()
        {
            show_map!!.visibility = View.VISIBLE
        }

        private fun hideStatus()
        {
            show_map!!.visibility = View.GONE
        }

        override fun onMapReady(googleMap: GoogleMap?)
        {
            mMap = googleMap!!

            mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL)
            mMap.getUiSettings()?.apply {
                isZoomControlsEnabled = true
                isCompassEnabled = true
                isMyLocationButtonEnabled = true
            }

            var tigerLocation = LatLng(13.6887061,100.5266476)

            if (LL != null){
                tigerLocation = LatLng(Lat!!,Long!!)
            }
//            else{
//                tigerLocation = LatLng(13.6887061,100.5266476)
//                Log.wtf("ffdfdfdfdf",tigerLocation.toString())
//            }

            val Address          = no3.text.toString().trim()
            val Province         = no4.text.toString().trim()
            val Zipcode          = no5.text.toString().trim()
            val District         = no10.text.toString().trim()
            val SubDistrict      = no11.text.toString().trim()


            markerPoints.add(tigerLocation)

            if (LL != null){
                if (Zipcode.substring(0,2) == zipcodeBKK){
                    placeMarker(tigerLocation , "ที่อยู่:$Address","รายละเอียด:แขวง$SubDistrict เขต$District จังหวัด$Province $Zipcode")
                }else{
                    placeMarker(tigerLocation , "ที่อยู่:$Address","รายละเอียด:ตำบล$SubDistrict อำเภอ$District จังหวัด$Province $Zipcode")
                }
            }

        }

        private fun placeMarker(location : LatLng, title : String, detail : String)
        {
            mMap.clear()

                if (marker != null) {
                    marker!!.remove()
                }

                mMap.apply {
                    marker = mMap.addMarker(MarkerOptions()
                        .position(location)
                        .title(title)
                        .snippet(detail)
                        .icon(
                            BitmapDescriptorFactory
                                .defaultMarker(BitmapDescriptorFactory.HUE_RED)))
                    moveCamera(CameraUpdateFactory.newLatLng(location))
                    animateCamera(CameraUpdateFactory.newLatLngZoom(location, 15f))
                }

        }

        override fun onCreateOptionsMenu(menu: Menu): Boolean {
            menuInflater.inflate(R.menu.menu_upload, menu)
            return true
        }

        override fun onOptionsItemSelected(item: MenuItem?): Boolean {
            // Handle item selection
            when (item?.itemId) {
                android.R.id.home -> {
                    this.finish()
                }
                R.id.menu_upload -> {
                    uploadInfoDialog()
                }
            }
            return false
        }

        private fun showSelectTypeDialog()
        {
            val builder = AlertDialog.Builder(this@CustomerActivity)
            val dialogView = this@CustomerActivity.layoutInflater.inflate(R.layout.zipcode_dialog, null)
            var confirmButton : Button = dialogView.findViewById(R.id.submit_btn)
            var titleTextView : TextView = dialogView.findViewById(R.id.title)
            var wTypeListRecyclerView : RecyclerView = dialogView.findViewById(R.id.wTypeListRecyclerView)
            var enter : AutoCompleteTextView = dialogView.findViewById(R.id.enter_place)

            builder.setView(dialogView)

            titleTextView.text = "เลือกรหัสไปรษณีย์"

            wTypeListRecyclerView.adapter = aListAdapter
            wTypeListRecyclerView.layoutManager = LinearLayoutManager(applicationContext)
            wTypeListRecyclerView.itemAnimator = DefaultItemAnimator()

            val dialogShow = builder.create()

            enter.addTextChangedListener(object : TextWatcher{
                override fun afterTextChanged(p0: Editable?) {
                    //callListZipcode(p0.toString())
                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }

                override fun onTextChanged(p0: CharSequence?, p88: Int, p99: Int, p3: Int) {
                    p1 = no4.text.toString()
                    p2 = no5.text.toString()
                    aListAdapter.selectedPosition = null

                    if (p0.toString().length == 5) {
                        callListZipcode(p0.toString())
                    }
                }
            })

            if (dialogShow.getWindow() != null)
                dialogShow.getWindow()!!.getAttributes().windowAnimations = R.style.DialogAnimation

            fonts.overrideFonts(applicationContext, dialogView, fonts.DEFAULT_THAI_FONTS)

            val lp : WindowManager.LayoutParams = dialogShow.window.attributes
            val window = dialogShow.window
            lp.copyFrom(window.attributes)
            lp.width = WindowManager.LayoutParams.MATCH_PARENT
            lp.height = WindowManager.LayoutParams.MATCH_PARENT
            window.attributes = lp
            lp.gravity = Gravity.CENTER

            confirmButton.setOnClickListener {
                if (showButton){
                    no4.text = p1
                    no5.text = p2
                    no10.text = ""
                    no11.text = ""
                    zipid = p2

                    var ck = Check()
                    ck.names = p2
                    val realmDatabase = RealmDb()
                    realmDatabase.deleteCheck()
                    realmDatabase.insertOrUpdateCheck(ck)
                    realmDatabase.close()
                    val gg = ck.names
                    Log.wtf("zipcode",gg.toString())

                    hideKeyboard()
                    dialogShow.dismiss()
                }else{
                    dialogShow.dismiss()
                }
            }
            showButton = false

            dialogShow.show()
        }

        private fun showSelectTypeDialog2()
        {
            Log.wtf("zipcode",zipid)
            val builder = AlertDialog.Builder(this@CustomerActivity)
            val dialogView = this@CustomerActivity.layoutInflater.inflate(R.layout.district_dialog, null)
            var confirmButton : Button = dialogView.findViewById(R.id.submit_btn)
            var titleTextView : TextView = dialogView.findViewById(R.id.title)
            var wTypeListRecyclerView : RecyclerView = dialogView.findViewById(R.id.wTypeListRecyclerView)
            var enter : AutoCompleteTextView = dialogView.findViewById(R.id.enter_place)

            var showSearchDialog : RelativeLayout = dialogView.findViewById(R.id.showSearchDialog)
            showSearchDialog.visibility = View.GONE

            builder.setView(dialogView)

            titleTextView.text = "เลือกเขต/อำเภอ"

            wTypeListRecyclerView.adapter = aListAdapter2
            wTypeListRecyclerView.layoutManager = LinearLayoutManager(applicationContext)
            wTypeListRecyclerView.itemAnimator = DefaultItemAnimator()


            val dialogShow = builder.create()

            enter.addTextChangedListener(object : TextWatcher{
                override fun afterTextChanged(p0: Editable?) {
                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    callListDistrict(zipid)
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }
            })

            if (dialogShow.getWindow() != null)
                dialogShow.getWindow()!!.getAttributes().windowAnimations = R.style.DialogAnimation

            fonts.overrideFonts(applicationContext, dialogView, fonts.DEFAULT_THAI_FONTS)

            val lp : WindowManager.LayoutParams = dialogShow.window.attributes
            val window = dialogShow.window
            lp.copyFrom(window.attributes)
            lp.width = WindowManager.LayoutParams.MATCH_PARENT
            lp.height = WindowManager.LayoutParams.MATCH_PARENT
            window.attributes = lp
            lp.gravity = Gravity.CENTER

            confirmButton.setOnClickListener {
                if (showButton){
                    no10.text = p3
                    no11.text = ""
                    positoon = posit
                    dialogShow.dismiss()
                }else{
                    dialogShow.dismiss()
                }
            }
            showButton = false

            dialogShow.show()
        }

        private fun showSelectTypeDialog3()
        {
            val builder = AlertDialog.Builder(this@CustomerActivity)
            val dialogView = this@CustomerActivity.layoutInflater.inflate(R.layout.district_dialog, null)
            var confirmButton : Button = dialogView.findViewById(R.id.submit_btn)
            var titleTextView : TextView = dialogView.findViewById(R.id.title)
            var wTypeListRecyclerView : RecyclerView = dialogView.findViewById(R.id.wTypeListRecyclerView)
            var enter : AutoCompleteTextView = dialogView.findViewById(R.id.enter_place)

            var showSearchDialog : RelativeLayout = dialogView.findViewById(R.id.showSearchDialog)
            showSearchDialog.visibility = View.GONE

            builder.setView(dialogView)

            titleTextView.text = "เลือกแขวง/ตำบล"

            wTypeListRecyclerView.adapter = aListAdapter3
            wTypeListRecyclerView.layoutManager = LinearLayoutManager(applicationContext)
            wTypeListRecyclerView.itemAnimator = DefaultItemAnimator()


            val dialogShow = builder.create()

            enter.addTextChangedListener(object : TextWatcher{
                override fun afterTextChanged(p0: Editable?) {
                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    callListSubDistrict(zipid)
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }
            })

            if (dialogShow.getWindow() != null)
                dialogShow.getWindow()!!.getAttributes().windowAnimations = R.style.DialogAnimation

            fonts.overrideFonts(applicationContext, dialogView, fonts.DEFAULT_THAI_FONTS)

            val lp : WindowManager.LayoutParams = dialogShow.window.attributes
            val window = dialogShow.window
            lp.copyFrom(window.attributes)
            lp.width = WindowManager.LayoutParams.MATCH_PARENT
            lp.height = WindowManager.LayoutParams.MATCH_PARENT
            window.attributes = lp
            lp.gravity = Gravity.CENTER

            confirmButton.setOnClickListener {
                if (showButton){
                    no11.text = p4
                    dialogShow.dismiss()
                }else{
                    dialogShow.dismiss()
                }
            }
            showButton = false

            dialogShow.show()
        }

        private fun callListZipcode(zipid:String) {
            callApi = Service()
            callApi.getApiListZipcode(zipid,object : Service.ApiCallBack {
                override fun onGetData(data:Any?) {

                    Log.wtf("callListZipcode Success",data.toString())

                    val yt = data as ListZipCode
                    val jb = yt.data
                    val od = listOf(jb)

                    aListAdapter.typeList = od //name records
                    aListAdapter.notifyDataSetChanged()

                }
                override fun onError(err: String) {
                    Log.wtf("callListZipcode error","")
                }
            })
        }

        private fun callListDistrict(zipid:String) {
            callApi = Service()
            callApi.getApiListZipcode(zipid,object : Service.ApiCallBack {
                override fun onGetData(data:Any?) {

                    Log.wtf("11111111111111111",data.toString())

                    val yt = data as ListZipCode
                    val jb = yt.data
                    val od = jb.districts
                    val og = ArrayList(od)

//                    val ou = data.data.districts

                    aListAdapter2.typeList = og //name records
                    aListAdapter2.notifyDataSetChanged()

                }
                override fun onError(err: String) {
                    Log.wtf("33333333333333","333333333333333")
                }
            })
        }

        private fun callListSubDistrict(zipid:String) {
            callApi = Service()
            callApi.getApiListZipcode(zipid,object : Service.ApiCallBack {
                override fun onGetData(data:Any?) {

                    Log.wtf("11111111111111111",data.toString())

                    val yt = data as ListZipCode
                    val jb = yt.data
                    val od = jb.districts
                    val og = ArrayList(od)

                    val oy = ArrayList(og)[positoon!!]
                    val or = oy.subdistricts
                    val oe = ArrayList(or)

                    aListAdapter3.typeList = oe //name records
                    aListAdapter3.notifyDataSetChanged()

                }
                override fun onError(err: String) {
                    Log.wtf("33333333333333","333333333333333")
                }
            })
        }

        class SelectZipcodeListAdapter : RecyclerView.Adapter<SelectZipcodeListAdapter.TypeViewHolder>()
        {
            var typeList : List<ListZipCode.DataBean> = emptyList()
            var selectedPosition : Int? = null

            var onVideoClick : OnVideoClick? = null   //set button
            interface OnVideoClick{
                fun onClickUser(type :ListZipCode.DataBean)
            }

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TypeViewHolder
            {
                val itemView =  LayoutInflater.from(parent.context).inflate(R.layout.zipcode_list_item, parent, false)
                return TypeViewHolder(itemView)
            }

            override fun getItemCount():Int
            {
                return typeList.size
            }

            override fun onBindViewHolder(holder: TypeViewHolder, position: Int) {
                val type = typeList[position]

                holder.wTypePrefix.text = type.post_code
                holder.wTypeName.text = type.province_name

                holder.wTypeCard.setOnClickListener {
                    onVideoClick?.onClickUser(type)
                    selectedPosition = position

                    notifyDataSetChanged()
                }

                if (selectedPosition != null){
                    if (selectedPosition == position) {
                        holder.wSelected.visibility = View.VISIBLE
                        holder.itemView.setBackgroundColor(Color.parseColor("#eceff1"))
                    }else{
                        holder.wSelected.visibility = View.GONE
                        holder.itemView.setBackgroundColor(Color.parseColor("#ffffff"))
                    }
                }else{
                    holder.wSelected.visibility = View.VISIBLE
                    holder.itemView.setBackgroundColor(Color.parseColor("#eceff1"))
                    onVideoClick?.onClickUser(type)
                }



            }

            class TypeViewHolder(v : View) : RecyclerView.ViewHolder(v)
            {
                val wTypePrefix : TextView = v.findViewById(R.id.type_name_textView)
                val wTypeName : TextView = v.findViewById(R.id.type_name_textView2)
                val wSelected : ImageView = v.findViewById(R.id.selected)
                val wTypeCard : CardView = v.findViewById(R.id.type_card)

            }
        }

        class SelectZipcodeListAdapter2 : RecyclerView.Adapter<SelectZipcodeListAdapter2.TypeViewHolder>()
        {
            var typeList : ArrayList<ListZipCode.DataBean.DistrictsBean> = ArrayList()
            var selectedPosition : Int? = null
            val zipcodeBKK = "10"
            val realmDatabase = RealmDb()
            val ck = realmDatabase.check!!

            var onVideoClick : OnVideoClick? = null   //set button
            interface OnVideoClick{
                fun onClickUser(type :ListZipCode.DataBean.DistrictsBean,pos:Int)
            }

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TypeViewHolder
            {
                val itemView =  LayoutInflater.from(parent.context).inflate(R.layout.district_list_item, parent, false)
                return TypeViewHolder(itemView)
            }

            override fun getItemCount():Int
            {
                return typeList.size
            }

            override fun onBindViewHolder(holder: TypeViewHolder, position: Int) {
                val type = typeList[position]

                if (ck.names.substring(0,2) == zipcodeBKK) {
                    holder.wTypePrefix.text = "เขต"
                }else{
                    holder.wTypePrefix.text = "อำเภอ"
                }

                holder.wTypeName.text = type.district_name

                holder.wTypeCard.setOnClickListener {
                    onVideoClick?.onClickUser(type,position)
                    selectedPosition = position

                    notifyDataSetChanged()
                }

                if (selectedPosition == position) {
                    holder.wSelected.visibility = View.VISIBLE
                    holder.itemView.setBackgroundColor(Color.parseColor("#eceff1"))
                }else{
                    holder.wSelected.visibility = View.GONE
                    holder.itemView.setBackgroundColor(Color.parseColor("#ffffff"))
                }

            }

            class TypeViewHolder(v : View) : RecyclerView.ViewHolder(v)
            {
                val wTypePrefix : TextView = v.findViewById(R.id.type_name_textView)
                val wTypeName : TextView = v.findViewById(R.id.type_name_textView2)
                val wSelected : ImageView = v.findViewById(R.id.selected)
                val wTypeCard : CardView = v.findViewById(R.id.type_card)
            }
        }

        class SelectZipcodeListAdapter3 : RecyclerView.Adapter<SelectZipcodeListAdapter3.TypeViewHolder>()
        {
            var typeList : ArrayList<ListZipCode.DataBean.DistrictsBean.SubdistrictsBean> = ArrayList()
            var selectedPosition : Int? = null
            val zipcodeBKK = "10"
            val realmDatabase = RealmDb()
            val ck = realmDatabase.check!!

            var onVideoClick : OnVideoClick? = null   //set button
            interface OnVideoClick{
                fun onClickUser(type :ListZipCode.DataBean.DistrictsBean.SubdistrictsBean)
            }

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TypeViewHolder
            {
                val itemView =  LayoutInflater.from(parent.context).inflate(R.layout.district_list_item, parent, false)
                return TypeViewHolder(itemView)
            }

            override fun getItemCount():Int
            {
                return typeList.size
            }

            override fun onBindViewHolder(holder: TypeViewHolder, position: Int) {
                val type = typeList[position]

                if (ck.names.substring(0,2) == zipcodeBKK) {
                    holder.wTypePrefix.text = "แขวง"
                }else{
                    holder.wTypePrefix.text = "ตำบล"
                }

                holder.wTypeName.text = type.name

                holder.wTypeCard.setOnClickListener {
                    onVideoClick?.onClickUser(type)
                    selectedPosition = position

                    notifyDataSetChanged()
                }

                if (selectedPosition == position) {
                    holder.wSelected.visibility = View.VISIBLE
                    holder.itemView.setBackgroundColor(Color.parseColor("#eceff1"))
                }else{
                    holder.wSelected.visibility = View.GONE
                    holder.itemView.setBackgroundColor(Color.parseColor("#ffffff"))
                }

            }

            class TypeViewHolder(v : View) : RecyclerView.ViewHolder(v)
            {
                val wTypePrefix : TextView = v.findViewById(R.id.type_name_textView)
                val wTypeName : TextView = v.findViewById(R.id.type_name_textView2)
                val wSelected : ImageView = v.findViewById(R.id.selected)
                val wTypeCard : CardView = v.findViewById(R.id.type_card)
            }
        }

        private fun uploadInfoDialog() {

            val CustomerCode     = no1.text.toString().trim()
            val CustomerName     = no2.text.toString().trim()
            val Address          = no3.text.toString().trim()
            val Province         = no4.text.toString().trim()
            val Zipcode          = no5.text.toString().trim()
            val Tel              = no6.text.toString().trim()
            val Lat              = no7.text.toString().trim()
            val Lng              = no8.text.toString().trim()
            val District         = no10.text.toString().trim()
            val SubDistrict      = no11.text.toString().trim()


            val authenStatusSwal = SweetAlertDialog(this, SweetAlertDialog.PROGRESS_TYPE)
            authenStatusSwal.showCancelButton(false)
            authenStatusSwal.showContentText(false)
            authenStatusSwal.titleText = "กำลังตรวจสอบข้อมูล"

            if ( CustomerName.isEmpty() )
            {
                authenStatusSwal.titleText = "คำเตือน"
                authenStatusSwal.showContentText(true)
                authenStatusSwal.changeAlertType(SweetAlertDialog.WARNING_TYPE)
                authenStatusSwal.contentText = "กรุณาใส่ ชื่อ - นามสกุล"
                authenStatusSwal.setConfirmClickListener {
                    authenStatusSwal.dismissWithAnimation()
                }
                authenStatusSwal.show()
                return
            }

            if ( Address.isEmpty() )
            {
                authenStatusSwal.titleText = "คำเตือน"
                authenStatusSwal.showContentText(true)
                authenStatusSwal.changeAlertType(SweetAlertDialog.WARNING_TYPE)
                authenStatusSwal.contentText = "กรุณาใส่ ที่อยู่"
                authenStatusSwal.setConfirmClickListener {
                    authenStatusSwal.dismissWithAnimation()
                }
                authenStatusSwal.show()
                return
            }

            if ( Zipcode.isEmpty() )
            {
                authenStatusSwal.titleText = "คำเตือน"
                authenStatusSwal.showContentText(true)
                authenStatusSwal.changeAlertType(SweetAlertDialog.WARNING_TYPE)
                authenStatusSwal.contentText = "กรุณาใส่ รหัสไปรษณีย์"
                authenStatusSwal.setConfirmClickListener {
                    authenStatusSwal.dismissWithAnimation()
                }
                authenStatusSwal.show()
                return
            }

            if ( Province.isEmpty() )
            {
                authenStatusSwal.titleText = "คำเตือน"
                authenStatusSwal.showContentText(true)
                authenStatusSwal.changeAlertType(SweetAlertDialog.WARNING_TYPE)
                authenStatusSwal.contentText = "กรุณาใส่ จังหวัด"
                authenStatusSwal.setConfirmClickListener {
                    authenStatusSwal.dismissWithAnimation()
                }
                authenStatusSwal.show()
                return
            }

            if ( District.isEmpty() )
            {
                authenStatusSwal.titleText = "คำเตือน"
                authenStatusSwal.showContentText(true)
                authenStatusSwal.changeAlertType(SweetAlertDialog.WARNING_TYPE)
                authenStatusSwal.contentText = "กรุณาใส่ เขต/อำเภอ"
                authenStatusSwal.setConfirmClickListener {
                    authenStatusSwal.dismissWithAnimation()
                }
                authenStatusSwal.show()
                return
            }

            if ( SubDistrict.isEmpty() )
            {
                authenStatusSwal.titleText = "คำเตือน"
                authenStatusSwal.showContentText(true)
                authenStatusSwal.changeAlertType(SweetAlertDialog.WARNING_TYPE)
                authenStatusSwal.contentText = "กรุณาใส่ แขวง/ตำบล"
                authenStatusSwal.setConfirmClickListener {
                    authenStatusSwal.dismissWithAnimation()
                }
                authenStatusSwal.show()
                return
            }

            if ( Tel.isEmpty() )
            {
                authenStatusSwal.titleText = "คำเตือน"
                authenStatusSwal.showContentText(true)
                authenStatusSwal.changeAlertType(SweetAlertDialog.WARNING_TYPE)
                authenStatusSwal.contentText = "กรุณาใส่ เบอร์โทรศัพท์"
                authenStatusSwal.setConfirmClickListener {
                    authenStatusSwal.dismissWithAnimation()
                }
                authenStatusSwal.show()
                return
            }

            if ( Lat.isEmpty() && Lng.isEmpty() )
            {
                authenStatusSwal.titleText = "คำเตือน"
                authenStatusSwal.showContentText(true)
                authenStatusSwal.changeAlertType(SweetAlertDialog.WARNING_TYPE)
                authenStatusSwal.contentText = "กรุณาเลือกแผนที่ Map"
                authenStatusSwal.setConfirmClickListener {
                    authenStatusSwal.dismissWithAnimation()
                }
                authenStatusSwal.show()
                return
            }
//            authenStatusSwal.show()

            val realmDatabase = RealmDb()
            val custo = CreateCustomer()

            realmDatabase.deleteCusto()
            custo.customerCode = CustomerCode
            custo.customerName = CustomerName

            if(Zipcode.substring(0,2) == zipcodeBKK){
                custo.address = Address + " แขวง" + SubDistrict + " เขต" + District
            }else{
                custo.address = Address + " ตำบล" + SubDistrict + " อำเภอ" + District
            }

            custo.subdistrict = SubDistrict
            custo.district = District
            custo.province = Province
            custo.zipcode = Zipcode
            custo.tel = Tel
            custo.lat = Lat
            custo.lng = Lng

            realmDatabase.insertOrUpdateCustomer(custo)
            realmDatabase.close()

            // set dialog question
            val sweetAlertDialog = SweetAlertDialog(this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
            sweetAlertDialog.setCustomImage(R.drawable.p_upload_dialog)
            sweetAlertDialog.titleText = "สร้างลูกค้าใหม่"
            sweetAlertDialog.confirmText = getString(R.string.confirm_txt)
            sweetAlertDialog.cancelText = getString(R.string.cancel_txt)
            sweetAlertDialog.setCancelClickListener { sweetAlertDialog.dismissWithAnimation() }

            // on confirm upload
            sweetAlertDialog.setConfirmClickListener {
                sweetAlertDialog.changeAlertType(SweetAlertDialog.PROGRESS_TYPE)
                sweetAlertDialog.progressHelper.barColor = Color.parseColor("#A5DC86")
                sweetAlertDialog.titleText = "กำลังสร้างลูกค้าใหม่"
                sweetAlertDialog.showCancelButton(false)
                sweetAlertDialog.showContentText(false)
                sweetAlertDialog.setCancelClickListener(null)
                sweetAlertDialog.setOnDismissListener { sweetAlertDialog.dismiss() }

                callApi = Service()
                callApi.postApiCreateCustomer(object : Service.UploadCallBack{

                    override fun onUpload(data: Any?) {

                        val custoo = Customer()
                        custoo.customerCode = CustomerCode
                        custoo.customerName = CustomerName

                        if(Zipcode.substring(0,2) == zipcodeBKK){
                            custoo.address = Address + " แขวง" + SubDistrict + " เขต" + District
                        }else{
                            custoo.address = Address + " ตำบล" + SubDistrict + " อำเภอ" + District
                        }

                        custoo.subdistrict = SubDistrict
                        custoo.district = District
                        custoo.province = Province
                        custoo.zipcode = Zipcode
                        custoo.tel = Tel
                        custoo.lat = Lat
                        custoo.lng = Lng
                        custoo.date = NewDate

                        realmDatabase.insertOrUpdateListCustomer(custoo)
                        Log.wtf("custoo",custoo.customerCode)

                        val handler = Handler()
                        handler.postDelayed({
                            sweetAlertDialog.changeAlertType(SweetAlertDialog.SUCCESS_TYPE)
                            sweetAlertDialog.titleText = CustomerCode
                            sweetAlertDialog.showCancelButton(false)
                            sweetAlertDialog.showContentText(false)
                            sweetAlertDialog.setConfirmClickListener {
                                sweetAlertDialog.dismiss()
                                finish()
                            }
                        }, 1500)

                    }

                    override fun onErrorUpload(err: String) {
                        val handler = Handler()
                        handler.postDelayed({
                            sweetAlertDialog.changeAlertType(SweetAlertDialog.ERROR_TYPE)
                            sweetAlertDialog.titleText = "ผิดพลาด ไม่สามารถสร้างได้"
                            sweetAlertDialog.showCancelButton(false)
                            sweetAlertDialog.showContentText(false)
                            sweetAlertDialog.setConfirmClickListener {
                                sweetAlertDialog.dismiss()
                                finish()
                            }
                        }, 1500)

                        Log.wtf("Response gotten is","3333333333333333")
                    }
                })

            }

            sweetAlertDialog.show()
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

}