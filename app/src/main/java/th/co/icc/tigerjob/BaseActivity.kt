package th.co.icc.tigerjob

import android.annotation.SuppressLint
import android.content.Intent
import android.location.Location
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import th.co.icc.tigerjob.database.RealmDb
import th.co.icc.tigerjob.font.Fonts
import th.co.icc.tigerjob.function.Function
import java.util.*


@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity()
{
    lateinit var function: Function
    lateinit var fonts: Fonts
    var realmDatabase: RealmDb? = null

    private var locationChangeListener: LocationChangeListener? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fonts = Fonts(applicationContext)
        function = Function()
    }

    fun initRealmDatabase() {

        realmDatabase = RealmDb()
    }

    interface LocationChangeListener {
        fun onLocationChange(location: Location?)
    }

    override fun setContentView(layoutResID: Int)
    {
        super.setContentView(layoutResID)
        setViewsFont()
        setActionbar()

    }

    protected fun setLocationChangeListener(locationChangeListener: LocationChangeListener) {
        this.locationChangeListener = locationChangeListener
    }

    private fun setViewsFont() {
        try {
            val view = window.decorView.rootView
            fonts.overrideFonts(this, view, fonts.DEFAULT_THAI_FONTS)


        } catch (e: Exception) {
            Log.e("SET-FONT-ERR", e.message)
        }

    }

    private fun setActionbar() {
        val actionBar = getSupportActionBar()
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setDisplayShowTitleEnabled(true)
        }
    }

    protected fun setActionBarTitle(title: String) {
        if (getSupportActionBar() != null) {
            getSupportActionBar()!!.setTitle(title)
        }

    }

    protected fun setActionBarSubtitle(title: String) {
        if (getSupportActionBar() != null) {
            getSupportActionBar()!!.setSubtitle(title)
        }

    }

    override fun startActivity(intent: Intent) {
        super.startActivity(intent)
        overridePendingTransitionEnter()
    }

    override fun finish() {
        super.finish()
        overridePendingTransitionExit()
    }

    private fun overridePendingTransitionEnter() {
        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
    }

    private fun overridePendingTransitionExit() {
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
    }

    fun showToastShort(msg:String)
    {
        Toast.makeText(this , msg , Toast.LENGTH_SHORT).show()
    }
    fun showToastLong(msg:String)
    {
        Toast.makeText(this , msg , Toast.LENGTH_LONG).show()
    }

    fun AppVersion(): String? {
        try {
            return this.packageManager.getPackageInfo(packageName, 0).versionName
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }
    }

//    fun copyRight(): String {
//        return "©" +
//                Calendar.getInstance().get(Calendar.YEAR) +
//                " " +
//                getString(R.string.copy_right)
//    }



}