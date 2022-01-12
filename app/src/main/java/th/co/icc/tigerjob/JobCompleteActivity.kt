package th.co.icc.tigerjob

import android.content.Intent
import android.graphics.Color
import android.location.Location
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import sweetalert.SweetAlertDialog
import th.co.icc.tigerjob.api.Service
import th.co.icc.tigerjob.api.modelapi.Customer
import th.co.icc.tigerjob.api.modelapi.RunningCustomer
import th.co.icc.tigerjob.config.Config.KEY_CUS_ID
import th.co.icc.tigerjob.database.RealmDb
import th.co.icc.tigerjob.database.modelrealm.CreateJob
import th.co.icc.tigerjob.database.modelrealm.Job
import th.co.icc.tigerjob.dialog.InputDialog
import java.text.SimpleDateFormat
import java.util.*

@Suppress("NAME_SHADOWING")
class JobCompleteActivity : BaseActivity() {

    var job_qty_text_view : TextView? = null
    lateinit var no1 : TextView
    lateinit var no2 : TextView
    lateinit var no3 : TextView
    lateinit var no4 : TextView
    lateinit var no5 : TextView
    lateinit var no6 : TextView
    lateinit var no7 : TextView
    lateinit var no8 : TextView
    lateinit var addRemask : ImageView
    lateinit var titleRemask : TextView
    lateinit var save_button : Button

    var step1Item : LinearLayout? = null
    val STATUS_LOADING = 1
    var statusContainer : View? = null
    var statusIcon : ImageView? = null
    var statusText : TextView? = null

    var currentdate = Calendar.getInstance().time
    val formatdate = SimpleDateFormat("yyyyMMdd")
    val newformatdate = SimpleDateFormat("dd/MM/yyyy")
    val date = formatdate.format(currentdate)
    val newDate = newformatdate.format(currentdate)

    private var latitude: String? = null
    private var longitude: String? = null
    private var box = 1

    lateinit var callApi : Service
    lateinit var cus : String
    lateinit var api : Customer.DatasBean

    lateinit var NewDate2 : String
    lateinit var time : String
    private var currentViewDate = Date()
    private var currentViewDateTime = Date().time
    private val dateFormat = "dd/MM/yyyy"
    private val formatter = java.text.SimpleDateFormat(dateFormat, Locale("th", "TH"))
    private val dateFormatTime = "HH:mm"
    private val formatterTime = java.text.SimpleDateFormat(dateFormatTime, Locale("th", "TH"))

    lateinit var pre : String
    val typ = "CREATE_JOB"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jobcomplete)

        initRealmDatabase()

        val prefixx = realmDatabase!!.prefix!!
        pre = prefixx.prefix
        createRunningJob(pre,typ)

        cus = intent.getStringExtra(KEY_CUS_ID)  // get intent

        NewDate2 = formatter.format(currentViewDate).toString()
        time = formatterTime.format(currentViewDateTime).toString()
        Log.wtf("timeeeeeeeeeeee",time)

        bindViews()
        setEvent()

        callCustomer(cus)

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

    private fun createRunningJob(pre:String,typ:String){
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

    private fun bindViews() {

        job_qty_text_view = findViewById(R.id.job_qty_text_view)
        no1 = findViewById(R.id.no1)
        no2 = findViewById(R.id.no2)
        no3 = findViewById(R.id.no3)
        no4 = findViewById(R.id.no4)
        no5 = findViewById(R.id.no5)
        no6 = findViewById(R.id.no6)
        no7 = findViewById(R.id.no7)
        no8 = findViewById(R.id.no8)
        step1Item = findViewById(R.id.detail_step1)
        addRemask = findViewById(R.id.edit_desc_btn)
        titleRemask = findViewById(R.id.task_desc)
        save_button = findViewById(R.id.save_button)

        statusContainer = findViewById(R.id.status_container)
        statusText = findViewById(R.id.status_text)
        statusIcon = findViewById (R.id.status_icon)

    }

    private fun setEvent() {

        setLocationChangeListener(object : LocationChangeListener
        {
            override fun onLocationChange(location: Location?)
            {
                api?.latitude = latitude!!.toDouble()
                api?.longitude = longitude!!.toDouble()

                Log.wtf("Location change", api!!.latitude.toString() + "," + api!!.longitude.toString())
            }

        })

        save_button.setOnClickListener { uploadInfoDialog() }

        addRemask.setOnClickListener {
            openTaskDescDialog()
        }


    }

    private fun showStatus(status: Int, text: String?)
    {
        statusIcon!!.clearAnimation()

        var mgs = text

        when (status)
        {
            STATUS_LOADING ->
            {
                if(text == null)
                {
                    mgs = "Loading..."
                }

                statusIcon!!.setImageResource(R.drawable.ic_spinner_circle)
                statusText!!.text = mgs
                val rotateAnimation = RotateAnimation(0f, 360f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f)
                rotateAnimation.duration = 1200
                rotateAnimation.repeatCount = Animation.INFINITE
                statusIcon!!.startAnimation(rotateAnimation)
            }
        }

        statusContainer!!.visibility = View.VISIBLE

    }

    private fun hideStatus()
    {
        statusContainer!!.visibility = View.GONE
    }

    private fun updateRemask() {
        val job = realmDatabase!!.job!!

        var desc = if(job.remark == null ) "" else job.remark
        Log.wtf("remaskkkkkkkkkkk",job.remark)
        Log.wtf("sssssss",job.jobNo)
        titleRemask.text = desc

        addRemask.setImageResource( (if(job.remark == null ) R.drawable.ic_plus  else R.drawable.ic_pencil) )

    }

    private fun openTaskDescDialog()
    {
        val descDialog = InputDialog(this)
        val realmDatabase = RealmDb()
        val job = CreateJob()

        if(job.remark != null)
        {
            descDialog.setValue(job.remark)
        }

        descDialog.setTitle("หมายเหตุ")
        descDialog.setInputHint("หมายเหตุ")
        descDialog.setInputLines(3)

        descDialog.setOnSubmitInput { value ->
            val mValue =  value!!.trim { it <= ' ' }

            job.remark =  if (mValue == "") null else mValue

                realmDatabase.deleteJob()
                realmDatabase.insertOrUpdateJob(job)
                realmDatabase.close()
                Log.wtf("remaskkkkkkkkkkk",job.remark)
                Log.wtf("aaaaaaaaaaaa",job.jobNo)

            updateRemask()
            descDialog.dismiss()
        }

        descDialog.show()

    }

    private fun callCustomer(cus:String) {
        showStatus(STATUS_LOADING , null)

        callApi = Service()
        callApi.getApiCustomer(cus,object : Service.ApiCallBack {
            override fun onGetData(data:Any?) {

                if(data != null)
                {
                    hideStatus()
                    Log.wtf("11111111111111111",data.toString())

                    val yt = data as Customer
                    val jb = yt.datas

                    api = jb

                    updateUI()

                }

            }

            override fun onError(err: String) {
                Log.wtf("33333333333333","333333333333333")
            }
        })
    }

    private fun updateUI() {

        job_qty_text_view?.text = if ( box == null) "0" else box.toString() + ""

        no2.text = api.customerCode
        no3.text = api.address
        no4.text = api.latitude.toString() +","+ api.longitude
        no5.text = newDate
        no6.text = api.customerName
        no7.text = api.zipCode
        no8.text = api.tel

    }

    fun changeCount(v: View) {
        if (api != null && api!!.customerCode != null) {
            when (v.id) {
                R.id.decrease_bill_count -> {
                    box = box-1
                }
                R.id.increase_bil_count -> {
                    box = box+1
                }
            } // end switch

//            api!!.latitude = latitude!!.toDouble()
//            api!!.longitude = longitude!!.toDouble()

//            realmDatabase.insertOrUpdateJob(mCurrentJob)
            updateUI()
        }
    }

    private fun uploadInfoDialog() {

        val jobNo    = no1.text.toString().trim()
        val customerCode    = no2.text.toString().trim()
        val currentDate          = no5.text.toString().trim()
        val box         = job_qty_text_view!!.text.toString().trim()
        val zipcode = no7.text.toString().trim()
        val tel = no8.text.toString().trim()
        val contact = no6.text.toString().trim()
        val remark = titleRemask.text.toString().trim()

        val realmDatabase = RealmDb()
        val job = CreateJob()

        realmDatabase.deleteJob()
        job.jobNo = jobNo
        job.customerCode = customerCode
        job.currentDate = currentDate
        job.box = box
        job.zipcode = zipcode
        job.tel = tel
        job.contact = contact
        job.remark = remark

        realmDatabase.insertOrUpdateJob(job)
        realmDatabase.close()

        Log.wtf("testttttttttttttttt",job.jobNo)
        Log.wtf("testttttttttttttttt",job.currentDate)

        // set dialog question
        val sweetAlertDialog = SweetAlertDialog(this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
        sweetAlertDialog.setCustomImage(R.drawable.p_upload_dialog)
        sweetAlertDialog.titleText = "สร้างงาน"
        sweetAlertDialog.confirmText = getString(R.string.confirm_txt)
        sweetAlertDialog.cancelText = getString(R.string.cancel_txt)
        sweetAlertDialog.setCancelClickListener { sweetAlertDialog -> sweetAlertDialog.dismissWithAnimation() }

        // on confirm upload
        sweetAlertDialog.setConfirmClickListener {
            sweetAlertDialog.changeAlertType(SweetAlertDialog.PROGRESS_TYPE)
            sweetAlertDialog.progressHelper.barColor = Color.parseColor("#A5DC86")
            sweetAlertDialog.titleText = "กำลังสร้างงาน"
            sweetAlertDialog.showCancelButton(false)
            sweetAlertDialog.showContentText(false)
            sweetAlertDialog.setCancelClickListener(null)
            sweetAlertDialog.setOnDismissListener { sweetAlertDialog.dismiss()}

            callApi = Service()
            callApi.postApiCreateJob(object : Service.UploadCallBack{

                override fun onUpload(data: Any?) {

                    val jub = Job()
                    jub.jobNo = jobNo
                    jub.customerCode = customerCode
                    jub.currentDate = currentDate
                    jub.box = box
                    jub.zipcode = zipcode
                    jub.tel = tel
                    jub.contact = contact
                    jub.remark = remark
                    jub.date = NewDate2
                    jub.currenttime = time

                    realmDatabase.insertOrUpdateListJob(jub)
                    Log.wtf("custoo",jub.jobNo)
                    Log.wtf("custootime",jub.currenttime)

                    val handler = Handler()
                    handler.postDelayed({
                        sweetAlertDialog.changeAlertType(SweetAlertDialog.SUCCESS_TYPE)
                        sweetAlertDialog.titleText = jobNo
                        sweetAlertDialog.showCancelButton(false)
                        sweetAlertDialog.showContentText(false)
                        sweetAlertDialog.setConfirmClickListener { finish()
                            val intent = Intent(this@JobCompleteActivity, JobActivity::class.java)
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                            startActivity(intent)}
                    }, 1500)

                }

                override fun onErrorUpload(err: String) {
                    val handler = Handler()
                    handler.postDelayed({
                        sweetAlertDialog.changeAlertType(SweetAlertDialog.ERROR_TYPE)
                        sweetAlertDialog.titleText = "ผิดพลาด ไม่สามารถสร้างได้"
                        sweetAlertDialog.showCancelButton(false)
                        sweetAlertDialog.showContentText(false)
                        sweetAlertDialog.setConfirmClickListener { finish()
                            startActivity(Intent(this@JobCompleteActivity,JobActivity::class.java))}
                    }, 1500)

                    Log.wtf("Response gotten is","3333333333333333")
                }
            })

        }

        sweetAlertDialog.show()
    }

}
