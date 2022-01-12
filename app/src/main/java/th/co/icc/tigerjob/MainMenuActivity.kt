package th.co.icc.tigerjob

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.*
import android.widget.Button
import android.widget.TextView
import sweetalert.SweetAlertDialog
import th.co.icc.tigerjob.api.Service
import th.co.icc.tigerjob.api.modelapi.ListPrefix
import th.co.icc.tigerjob.config.Config.CODE_PREFIX
import th.co.icc.tigerjob.database.RealmDb
import th.co.icc.tigerjob.database.modelrealm.Prefix
import th.co.icc.tigerjob.fragment.MainActivity
import java.util.*


class MainMenuActivity : BaseActivity(), View.OnClickListener {
    private var copyrightTextView : TextView? = null
    private var versionText : TextView? = null
    lateinit var userInfoDialog: AlertDialog
    lateinit var pprefix : String
    lateinit var value : String

    private var prefixx = Prefix()
    private var cclick = false

    lateinit var aListAdapter : LoginActivity.SelectTypeListAdapter
    private lateinit var callApi : Service

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        pprefix = intent.getStringExtra(CODE_PREFIX)

        initRealmDatabase()

        if (supportActionBar != null)
            supportActionBar!!.setDisplayHomeAsUpEnabled(false)

        try
        {
            val versionName = this.packageManager.getPackageInfo(packageName, 0).versionName
            setActionBarTitle(pprefix)


        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
            setActionBarTitle(getString(R.string.app_name))
        }

        userInfoDialog = createUserDetailDialog()

        bindViews()
        updateUI()

    }

    override fun onClick(v: View)
    {
        when (v.id)
        {
            R.id.menu1 -> {
                startActivity(Intent(this@MainMenuActivity, JobActivity::class.java)) //MainActivity
            }
            R.id.menu2 -> {
                startActivity(Intent(this@MainMenuActivity, CustomerActivity::class.java))
            }
            R.id.menu3 -> {
                startActivity(Intent(this@MainMenuActivity, JobListActivity::class.java))
            }
            R.id.menu4 -> {
                startActivity(Intent(this@MainMenuActivity, CustomerListActivity::class.java))
            }
        }
    }

    private fun bindViews()
    {
        versionText = findViewById(R.id.versionText)
        copyrightTextView = findViewById(R.id.copyrightTextView)
    }

    private fun updateUI()
    {
        versionText?.text = getVersionName((this))
        copyrightTextView?.text = getCopyright((this))
    }

    private fun updateActionbar()
    {
        setActionBarTitle(value)
    }


    fun getVersionName(context: Context) : String
    {
        val versionName = this.packageManager.getPackageInfo(packageName, 0).versionName
        return (context.getString(R.string.versionName).replace("name" ,"$versionName"))
    }

    fun getCopyright(context: Context) : String
    {
        return (context.getString(R.string.copyright).replace(":year" ,"${Calendar.getInstance().get(Calendar.YEAR)}"))
    }

    /**
     * open logout
    //     */

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        // Handle item selection
        when (item?.itemId) {
            android.R.id.home -> {
                this.finish()
            }
            R.id.user -> {
                userInfoDialog.show()
            }
            R.id.setting -> {
                createPrefixDialog()
            }
        }
        return false
    }

    private fun createUserDetailDialog(): AlertDialog
    {
        val dialogBuilder = AlertDialog.Builder(this)
        val inflater = this.layoutInflater
        val dialogView = inflater.inflate(R.layout.user_dialog, null)
        dialogBuilder.setView(dialogView)
        val closeDialogButton = dialogView.findViewById<Button>(R.id.close)
        val logOutButton = dialogView.findViewById<Button>(R.id.log_out)

        val userHandHeldIdTextView = dialogView.findViewById<TextView>(R.id.hand_held_id)
        val userNameTextView = dialogView.findViewById<TextView>(R.id.driver_name)
        val routeIdTextView = dialogView.findViewById<TextView>(R.id.route_id)

        val user = realmDatabase!!.user

        userHandHeldIdTextView.text = user!!.name
        userNameTextView.text = user.name
        routeIdTextView.text = user.expiredate

        Log.wtf("user-name",user.name)

        logOutButton.setOnClickListener { showConfirmLogOutDialog() }

        val userInfoDialog = dialogBuilder.create()

        closeDialogButton.setOnClickListener {
            userInfoDialog.dismiss()
        }

        if (userInfoDialog.window != null)
            userInfoDialog.window!!.attributes.windowAnimations = R.style.DialogAnimation

        fonts.overrideFonts(applicationContext, dialogView, fonts.DEFAULT_THAI_FONTS)

        return userInfoDialog
    }

    private fun createPrefixDialog() {

        aListAdapter = LoginActivity.SelectTypeListAdapter()
        aListAdapter.onVideoClick = object : LoginActivity.SelectTypeListAdapter.OnVideoClick  //set button
        {
            override fun onClickUser(type: ListPrefix.DatasBean) {

                prefixx.docid = type.docid.toString()
                prefixx.type = type.type
                prefixx.docname = type.docname
                prefixx.prefix = type.prefix
                prefixx.startrun = type.startrun
                prefixx.currentrun = type.currentrun
//                        prefixx.customtext = type.customtext.equals(null).toString()
                prefixx.isdefault = type.isIsdefault
                prefixx.ishidden = type.isIshidden
                prefixx.isactive = type.isIsactive
                prefixx.docformat = type.docformat


                Log.wtf("11111111111111111",prefixx.docid)
                Log.wtf("11111111111111111",prefixx.type)
                Log.wtf("11111111111111111",prefixx.docname)
                Log.wtf("11111111111111111",prefixx.prefix)
                Log.wtf("11111111111111111",prefixx.startrun)
                Log.wtf("11111111111111111",prefixx.currentrun)
                Log.wtf("11111111111111111",prefixx.customtext)
                Log.wtf("11111111111111111",prefixx.isdefault.toString())
                Log.wtf("11111111111111111",prefixx.ishidden.toString())
                Log.wtf("11111111111111111",prefixx.isactive.toString())
                Log.wtf("11111111111111111",prefixx.docformat)


                val p1 = prefixx.prefix
                val p2 = prefixx.docname
                value = "$p1 - $p2"

                cclick = true
            }
        }

        callListPrefix()
        showSelectTypeDialog()

    }

    private fun showConfirmLogOutDialog()
    {
        val confirmLogoutDialog = SweetAlertDialog(this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)

        confirmLogoutDialog.titleText = "ยืนยัน"
        confirmLogoutDialog.contentText = "ยืนยันออกจากระบบ"
        confirmLogoutDialog.setCustomImage(R.drawable.ic_log_out)
        confirmLogoutDialog.cancelText = getString(R.string.cancel_txt)


        confirmLogoutDialog.setConfirmClickListener {
            val rml = RealmDb()
            val intent = Intent(applicationContext, LoginActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            rml.deleteUser()
            rml.close()

        confirmLogoutDialog.setOnDismissListener { confirmLogoutDialog.dismissWithAnimation() }

        }

        confirmLogoutDialog.show()
    }
    /**
     * close logout
     */

    private fun callListPrefix() {
        callApi = Service()
        callApi.getApiListPrefix(object : Service.ApiCallBack {
            override fun onGetData(data:Any?) {

                Log.wtf("11111111111111111",data.toString())

                val yt = data as ListPrefix
                val jb = yt.datas

                aListAdapter.typeList = jb //name records
                aListAdapter.notifyDataSetChanged()

            }
            override fun onError(err: String) {
                Log.wtf("33333333333333","333333333333333")
            }
        })
    }

    private fun showSelectTypeDialog()
    {
        val builder = AlertDialog.Builder(this@MainMenuActivity)
        val dialogView = this@MainMenuActivity.layoutInflater.inflate(R.layout.mat_select_type_dialog, null)
        var confirmButton : Button = dialogView.findViewById(R.id.submit_btn)
        var titleTextView : TextView = dialogView.findViewById(R.id.title)
        var wTypeListRecyclerView : RecyclerView = dialogView.findViewById(R.id.wTypeListRecyclerView)

        builder.setView(dialogView)

        titleTextView.text = "Job Events"

        wTypeListRecyclerView.adapter = aListAdapter
        wTypeListRecyclerView.layoutManager = LinearLayoutManager(applicationContext)
        wTypeListRecyclerView.itemAnimator = DefaultItemAnimator()


        val dialogShow = builder.create()

        if (dialogShow.window != null)
            dialogShow.window!!.attributes.windowAnimations = R.style.DialogAnimation

        fonts.overrideFonts(applicationContext, dialogView, fonts.DEFAULT_THAI_FONTS)

        val lp : WindowManager.LayoutParams = dialogShow.window.attributes
        val window = dialogShow.window
        lp.copyFrom(window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.MATCH_PARENT
        window.attributes = lp
        lp.gravity = Gravity.CENTER

        confirmButton.setOnClickListener {
            if (cclick){
                val realmDatabase = RealmDb()
                realmDatabase.deletePrefix()
                realmDatabase.insertOrUpdatePrefix(prefixx)
                realmDatabase.close()
                updateActionbar()
                dialogShow.dismiss()
            }else{
                dialogShow.dismiss()
            }
        }
        cclick = false

        dialogShow.show()
    }




}