package th.co.icc.tigerjob

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.CountDownTimer
import android.support.v4.content.ContextCompat
import android.util.Log
import android.view.WindowManager
import android.widget.TextView
import pl.tajchert.nammu.Nammu
import pl.tajchert.nammu.PermissionCallback
import th.co.icc.tigerjob.api.AuthenticationService
import th.co.icc.tigerjob.config.Config
import java.util.*


class SplashScreenActivity : BaseActivity()
{
    private var copyrightTextView : TextView? = null

    private val REQUEST_PERMISSIONS = arrayOf(
//        android.Manifest.permission.READ_PHONE_STATE,
        android.Manifest.permission.ACCESS_COARSE_LOCATION,
        android.Manifest.permission.ACCESS_NETWORK_STATE,
        android.Manifest.permission.ACCESS_WIFI_STATE,
        android.Manifest.permission.INTERNET,
        android.Manifest.permission.ACCESS_FINE_LOCATION
    )
    // Check Runtime Persion -- END

    private val isAllPermissionsGranted: Boolean
        get()
        {
            for (pms in REQUEST_PERMISSIONS)
            {
                val isGranted = ContextCompat.checkSelfPermission(this, pms) == PackageManager.PERMISSION_GRANTED

                Log.i("PERMISSION", "$pms : $isGranted")
                if (!isGranted) {
                    return false
                }
            }

            Log.i("PERMISSION", "Granted all")

            return true
        }


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash_screen)

        initRealmDatabase()
        checkRuntimePermission()

        bindViews()
        updateUI()
    }

    private fun bindViews()
    {
        copyrightTextView = findViewById(R.id.copyrightTextView)
    }

    private fun updateUI()
    {
        copyrightTextView?.text = getCopyright((this))
    }


    private fun getCopyright(context: Context) : String
    {
        return (context.getString(R.string.copyright).replace(":year" ,"${Calendar.getInstance().get(Calendar.YEAR)}"))
    }

    // Check Runtime Permission -- BEGIN
    private fun checkRuntimePermission()
    {
        if (isAllPermissionsGranted)
        {
            checkUser()
            return
        }


        Nammu.init(this)

        // permission list


        // Check Runtime Permission
        Nammu.askForPermission(this, REQUEST_PERMISSIONS, object : PermissionCallback
        {
            override fun permissionGranted()
            {
                // Toast.makeText(MainActivity.this, "Manifest.permission.WRITE_EXTERNAL_STORAGE - Granted", Toast.LENGTH_SHORT).show();
                if (isAllPermissionsGranted)
                {
                    checkUser()
                }
            }

            override fun permissionRefused()
            {
                Log.e("CHECKPOINT", "permissionRefused")
                finish()
            }
        })
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray)
    {
        Nammu.onRequestPermissionsResult(requestCode, permissions, grantResults)
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (isAllPermissionsGranted) {
            checkUser()
        }

    }

    @SuppressLint("HardwareIds", "MissingPermission")
    private fun checkUser() {
        val user = realmDatabase?.user

        if (function.isInternetConnected(this)) {

            if (user == null) {
                goToActivity(LoginActivity::class.java)
            } else {
                AuthenticationService(applicationContext).checkTokenAuth(user)
                { result ->
                    if (result.isAuthorization) {
                        goToActivity(MainMenuActivity::class.java)
                    } else {
                        goToActivity(LoginActivity::class.java)
                    }
                }
            }

        } else {
            if (user == null) {
                goToActivity(MainMenuActivity::class.java)
            } else {
                function.showErrorDialog(this,"ผิดพลาด","ไม่สามารถตรวจสอบผู้ใช้งาน \n กรุณาเชื่อมต่ออินเตอร์เน็ต",callbackListener = null)
                val delay = 5000
                object : CountDownTimer(delay.toLong(), delay.toLong())
                {
                    override fun onTick(millisUntilFinished: Long) {}

                    override fun onFinish()
                    {
                        finish()
                    }
                }.start()
            }
        }

    }


    private fun goToActivity(activityClass: Class<*>)
    {

        val delay = 1500
        object : CountDownTimer(delay.toLong(), delay.toLong())
        {
            override fun onTick(millisUntilFinished: Long) {}

            override fun onFinish()
            {
                var prefixx = realmDatabase?.prefix
                var p1 = prefixx?.prefix
                var p2 = prefixx?.docname
                val pprefix = "$p1 - $p2"

                val intent = Intent(applicationContext, activityClass)
                intent.putExtra(Config.CODE_PREFIX, pprefix)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(intent)
                finish()

            }
        }.start()

    }


}
