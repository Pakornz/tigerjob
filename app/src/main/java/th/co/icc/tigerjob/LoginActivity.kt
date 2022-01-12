package th.co.icc.tigerjob

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import android.support.v7.app.AlertDialog
import android.support.v7.widget.*
import android.util.Log
import android.view.*
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import sweetalert.SweetAlertDialog
import th.co.icc.tigerjob.api.AuthenticationService
import th.co.icc.tigerjob.api.Service
import th.co.icc.tigerjob.api.modelapi.ListPrefix
import th.co.icc.tigerjob.config.Config.CODE_PREFIX
import th.co.icc.tigerjob.database.RealmDb
import th.co.icc.tigerjob.database.modelrealm.Check
import th.co.icc.tigerjob.database.modelrealm.Prefix
import java.util.*
import android.text.InputFilter




class LoginActivity : BaseActivity() {

        private lateinit var wTextInputUsername     : AppCompatEditText
        private lateinit var wTextInputPassword    : AppCompatEditText
        private lateinit var wLoginButton       : Button
        private lateinit var wCopyRightTV       : TextView
        private lateinit var wVersionTextView   : TextView
        private lateinit var text_prefix_id    : TextView
        private lateinit var linear : LinearLayout
        private lateinit var value : String
        private var showButton : Boolean = false

        private var prefixx = Prefix()

        lateinit var aListAdapter : SelectTypeListAdapter
        private lateinit var callApi : Service

        override fun onCreate(savedInstanceState: Bundle?)
        {
            super.onCreate(savedInstanceState)
            requestWindowFeature(Window.FEATURE_NO_TITLE)
            window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
            setContentView(R.layout.activity_login)

            initRealmDatabase()

            if (isAuthorized())
            {
                goToMenu()
                return
            }

            bindViews()

            setEvents()

        }

        private fun bindViews()
        {
            wTextInputUsername  = findViewById(R.id.input_hhid)
            wTextInputPassword = findViewById(R.id.input_tsc_id)
            wLoginButton    = findViewById(R.id.login_button)
            wCopyRightTV    = findViewById(R.id.copy_right_text)
            wVersionTextView= findViewById(R.id.versionText)
            text_prefix_id = findViewById(R.id.text_prefix_id)
            linear = findViewById(R.id.linear)

            wTextInputUsername.filters = arrayOf<InputFilter>(InputFilter.AllCaps())
            wTextInputPassword.filters = arrayOf<InputFilter>(InputFilter.AllCaps())

            wVersionTextView.text = getVersionName(this)
            wCopyRightTV.text = getCopyright(this)
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

        private fun updateUI() {
            text_prefix_id.text = value
        }

        private fun setEvents()
        {
            wLoginButton.setOnClickListener { login() }

            linear.setOnClickListener {

                aListAdapter = SelectTypeListAdapter()
                aListAdapter.onVideoClick = object : SelectTypeListAdapter.OnVideoClick  //set button
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

                        val p1 = type.prefix
                        val p2 = type.docname
                        value = "$p1 - $p2"

                        showButton = true
                    }
                }

                callListPrefix()
                showSelectTypeDialog()

            }
        }

        fun showSelectTypeDialog()
        {
            val builder = AlertDialog.Builder(this@LoginActivity)
            val dialogView = this@LoginActivity.layoutInflater.inflate(R.layout.mat_select_type_dialog, null)
             var confirmButton : Button = dialogView.findViewById(R.id.submit_btn)
             var titleTextView : TextView = dialogView.findViewById(R.id.title)
             var wTypeListRecyclerView : RecyclerView = dialogView.findViewById(R.id.wTypeListRecyclerView)

            builder.setView(dialogView)

            titleTextView.text = "Job Events"

            wTypeListRecyclerView.adapter = aListAdapter
            wTypeListRecyclerView.layoutManager = LinearLayoutManager(applicationContext)
            wTypeListRecyclerView.itemAnimator = DefaultItemAnimator()


            val dialogShow = builder.create()

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
                    val realmDatabase = RealmDb()
                    realmDatabase.deletePrefix()
                    realmDatabase.insertOrUpdatePrefix(prefixx)
                    realmDatabase.close()
                    updateUI()
                    dialogShow.dismiss()
                }else{
                    dialogShow.dismiss()
                }
            }
            showButton = false

            dialogShow.show()
        }

        private fun isAuthorized(): Boolean
        {
            val boo = AuthenticationService(applicationContext)
            val author = boo.AuthResult()

            return author.isAuthorization
        }

        private fun login()
        {
            val username    = wTextInputUsername.text.toString().trim().toUpperCase()
            val password   = wTextInputPassword.text.toString().trim().toUpperCase()
            val prefix   = text_prefix_id.text.toString().trim()


            val authenStatusSwal = SweetAlertDialog(this, SweetAlertDialog.PROGRESS_TYPE)
            authenStatusSwal.showCancelButton(false)
            authenStatusSwal.showContentText(false)
            authenStatusSwal.titleText = "กำลังตรวจสอบข้อมูล"

            if ( username.isEmpty())
            {
                authenStatusSwal.titleText = "คำเตือน"
                authenStatusSwal.showContentText(true)
                authenStatusSwal.changeAlertType(SweetAlertDialog.WARNING_TYPE)
                authenStatusSwal.contentText = "กรุณาใส่ Username"
                authenStatusSwal.setConfirmClickListener {
                    authenStatusSwal.dismissWithAnimation()
                }
                authenStatusSwal.show()
                return
            }

            if ( password.isEmpty())
            {
                authenStatusSwal.titleText = "คำเตือน"
                authenStatusSwal.showContentText(true)
                authenStatusSwal.changeAlertType(SweetAlertDialog.WARNING_TYPE)
                authenStatusSwal.contentText = "กรุณาใส่ Password"
                authenStatusSwal.setConfirmClickListener {
                    authenStatusSwal.dismissWithAnimation()
                }
                authenStatusSwal.show()
                return
            }

            if ( prefix.isEmpty())
            {
                authenStatusSwal.titleText = "คำเตือน"
                authenStatusSwal.showContentText(true)
                authenStatusSwal.changeAlertType(SweetAlertDialog.WARNING_TYPE)
                authenStatusSwal.contentText = "กรุณาเลือก Job Events"
                authenStatusSwal.setConfirmClickListener {
                    authenStatusSwal.dismissWithAnimation()
                }
                authenStatusSwal.show()
                return
            }
            authenStatusSwal.show()

            val realmDatabase = RealmDb()

            AuthenticationService(applicationContext).checkUser(username,password)
            { result ->
                if (result.isAutherUser){

                    AuthenticationService(applicationContext).checkUserRight(username,password)
                    { result ->
                        if (result.isAutherUser){

                            AuthenticationService(applicationContext).genTokenAuth(username,password)
                            { result ->
                                if(result.isAuthorization)
                                {
                                    object : CountDownTimer(1500, 1500)
                                    {
                                        override fun onTick(millisUntilFinished: Long) { }

                                        override fun onFinish()
                                        {
                                            val userVerify = realmDatabase.user
                                            AuthenticationService(applicationContext).checkTokenAuth(userVerify){
                                                goToMenu()
                                            }
                                        }
                                    }.start()
                                }
                                else
                                {
                                    authenStatusSwal.changeAlertType(SweetAlertDialog.ERROR_TYPE)
                                    authenStatusSwal.titleText = "คำเตือน"
                                    authenStatusSwal.showContentText(true)
                                    authenStatusSwal.contentText = "Token ของคุณหมดอายุ"
                                    authenStatusSwal.setConfirmClickListener {
                                        authenStatusSwal.dismissWithAnimation()
                                    }
                                }
                            }
                        }else{
                            authenStatusSwal.changeAlertType(SweetAlertDialog.WARNING_TYPE)
                            authenStatusSwal.titleText = "คำเตือน"
                            authenStatusSwal.showContentText(true)
                            authenStatusSwal.contentText = "คุณไม่มีสิทธิ์เข้าใช้โปรแกรม TDL_01"
                            authenStatusSwal.setConfirmClickListener {
                                authenStatusSwal.dismissWithAnimation()
                            }
                        }
                    }
                }else{
                    authenStatusSwal.changeAlertType(SweetAlertDialog.WARNING_TYPE)
                    authenStatusSwal.titleText = "คำเตือน"
                    authenStatusSwal.showContentText(true)
                    authenStatusSwal.contentText = "Username หรือ Password ไม่ถูกต้อง"
                    authenStatusSwal.setConfirmClickListener {
                        authenStatusSwal.dismissWithAnimation()
                    }
                }

            }


        }

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

        private fun goToMenu()
        {
            var prefixx = realmDatabase?.prefix
            var p1 = prefixx?.prefix
            var p2 = prefixx?.docname
            val pprefix = "$p1 - $p2"

            val intent = Intent(applicationContext, MainMenuActivity::class.java)
            intent.putExtra(CODE_PREFIX, pprefix)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
            finish()

        }

        class SelectTypeListAdapter : RecyclerView.Adapter<SelectTypeListAdapter.TypeViewHolder>()
        {
            var typeList : List<ListPrefix.DatasBean> = emptyList()
            var selectedPosition : Int? = null

            var onVideoClick : OnVideoClick? = null   //set button
            interface OnVideoClick{
                fun onClickUser(type :ListPrefix.DatasBean)
            }

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TypeViewHolder
            {
                val itemView =  LayoutInflater.from(parent.context).inflate(R.layout.type_list_item, parent, false)
                return TypeViewHolder(itemView)
            }

            override fun getItemCount():Int
            {
                return typeList.size
            }

            override fun onBindViewHolder(holder: TypeViewHolder, position: Int) {
                val type = typeList[position]

                holder.wTypePrefix.text = type.prefix
                holder.wTypeName.text = type.docname

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

}