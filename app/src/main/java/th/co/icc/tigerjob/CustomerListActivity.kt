package th.co.icc.tigerjob

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.support.design.widget.TabLayout
import android.support.v7.app.AlertDialog
import android.support.v7.widget.CardView
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.*
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.google.zxing.WriterException
import com.journeyapps.barcodescanner.BarcodeEncoder
import sweetalert.SweetAlertDialog
import th.co.icc.tigerjob.api.Service
import th.co.icc.tigerjob.database.RealmDb
import th.co.icc.tigerjob.database.modelrealm.CreateCustomer
import th.co.icc.tigerjob.database.modelrealm.Customer
import th.co.icc.tigerjob.font.Fonts
import java.text.DecimalFormat
import java.util.*

class CustomerListActivity : BaseActivity() {

    private val dateFormat = "dd/MM/yyyy"
    private var currentViewDate = Date()
    private val formatter = java.text.SimpleDateFormat(dateFormat, Locale("th", "TH"))
    lateinit var dateDisplay: TextView
    lateinit var empty_text:TextView
    lateinit var goPrev: ImageView
    lateinit var goNext:ImageView
    lateinit var datePickerDialog: DatePickerDialog
    private var maxDate: Date? = null
    private val minDate: Date? = null
    lateinit var bill_list_recycler_view: RecyclerView
    private var gson: Gson? = null
    private var viewMode = 0
    private var listData: List<Customer>? = null
    lateinit var listAdapter: CustomerListAdapter
    lateinit var showdate : String
    lateinit var userInfoDialog: AlertDialog

    private lateinit var callApi : Service

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_joblist)

        initRealmDatabase()

        showdate = formatter.format(currentViewDate).toString()

        /*  set appbar  */

        fonts = Fonts(this)
        fonts.overrideFonts(this, findViewById(R.id.activity_received_list), fonts.DEFAULT_THAI_FONTS)
        gson = GsonBuilder().serializeNulls().excludeFieldsWithoutExposeAnnotation().create()
        empty_text = findViewById(R.id.empty_text)
        bill_list_recycler_view = findViewById(R.id.bill_list_recycler_view)
        maxDate = Date()
        goPrev = findViewById(R.id.go_prev)
        goNext = findViewById(R.id.go_next)
        dateDisplay = findViewById(R.id.date_display)
        datePickerDialog = createDatePickerDialog(minDate, maxDate)

        dateDisplay.setOnClickListener {
            // open date picker dialog
            datePickerDialog.show()
        }

        goPrev.setOnClickListener {
            displayViewDate(-1)
            reloadListData()
        }

        goNext.setOnClickListener {
            displayViewDate(1)
            reloadListData()
        }

        listAdapter = CustomerListAdapter()

        // set list
        bill_list_recycler_view.adapter = listAdapter
        bill_list_recycler_view.layoutManager = LinearLayoutManager(applicationContext)
        bill_list_recycler_view.itemAnimator = DefaultItemAnimator()

        listAdapter.onVideoClick = object : CustomerListAdapter.OnVideoClick  //set button
        {
            override fun onClickItem(cus:String){
                userInfoDialog = createUserDetailDialog(cus)
                userInfoDialog.show()
            }

//            override fun onClickUser(cus:String) {
//                deleteCurrent(cus)
//            }
        }

        listAdapter.typeList = realmDatabase!!.ListCutomer(showdate)

        if (listAdapter.typeList.isEmpty()) {
            empty_text.visibility = View.VISIBLE
            bill_list_recycler_view.visibility = View.GONE
            Log.wtf("11111111111","11111111111")
            Log.wtf("11111111111",listAdapter.typeList.toString())
        } else {
            empty_text.visibility = View.GONE
            bill_list_recycler_view.visibility = View.VISIBLE
            Log.wtf("2222222222222","22222222")
            Log.wtf("2222222222222",listAdapter.typeList.toString())
        }

        listAdapter.notifyDataSetChanged()

        displayViewDate(0)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_default, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        // Handle item selection
        when (item?.itemId) {
            android.R.id.home -> {
                this.finish()
            }
//            R.id.menu_delete -> {
//                deleteList()
//            }
        }
        return false
    }

    override fun onResume() {
        super.onResume()
        reloadListData()
    }

    private fun createDatePickerDialog(minDate: Date?, maxDate: Date?): DatePickerDialog {
        val mYear: Int
        val mMonth: Int
        val mDay: Int

        val c = Calendar.getInstance()
        mYear = c.get(Calendar.YEAR)
        mMonth = c.get(Calendar.MONTH)
        mDay = c.get(Calendar.DAY_OF_MONTH)
        val datePickerDialog = DatePickerDialog(this@CustomerListActivity,
            DatePickerDialog.OnDateSetListener { _, year, monthOfYear, dayOfMonth ->
                val seqFormat = DecimalFormat("00")
                val dateStr = seqFormat.format(dayOfMonth.toLong()) + "/" + seqFormat.format((monthOfYear + 1).toLong()) + "/" + year
                dateDisplay.text = dateStr
                currentViewDate = function.StringToDate(dateStr, "dd/MM/yyyy", Locale("en", "EN"))!!

                showdate = formatter.format(currentViewDate).toString()
                Log.wtf("date1111111111111",showdate)

                reloadListData()
            }, mYear, mMonth, mDay
        )

        if (minDate != null)
            datePickerDialog.datePicker.minDate = minDate.time
        if (maxDate != null)
            datePickerDialog.datePicker.maxDate = maxDate.time

        return datePickerDialog
    }

    private fun displayViewDate(day: Int) {

        val cal = Calendar.getInstance()
        cal.time = currentViewDate
        cal.add(Calendar.DATE, day)

        currentViewDate = cal.time

        dateDisplay.text = formatter.format(currentViewDate).toString()
        datePickerDialog.datePicker
            .updateDate(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH))

        showdate = formatter.format(currentViewDate).toString()
        Log.wtf("date2222222222222",showdate)
        reloadListData()


    }

//    private fun deleteList() {
//
//        // set dialog question
//        val sweetAlertDialog = SweetAlertDialog(this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
//        sweetAlertDialog.setCustomImage(R.drawable.p_bin)
//        sweetAlertDialog.titleText = "ต้องการลบรายการทั้งหมด?"
//        sweetAlertDialog.confirmText = getString(R.string.confirm_txt)
//        sweetAlertDialog.cancelText = getString(R.string.cancel_txt)
//        sweetAlertDialog.setCancelClickListener { sweetAlertDialog.dismissWithAnimation() }
//
//        // on confirm upload
//        sweetAlertDialog.setConfirmClickListener {
//            sweetAlertDialog.changeAlertType(SweetAlertDialog.PROGRESS_TYPE)
//            sweetAlertDialog.progressHelper.barColor = Color.parseColor("#A5DC86")
//            sweetAlertDialog.titleText = "กำลังลบรายการทั้งหมด"
//            sweetAlertDialog.showCancelButton(false)
//            sweetAlertDialog.showContentText(false)
//            sweetAlertDialog.setCancelClickListener(null)
//            sweetAlertDialog.setOnDismissListener { sweetAlertDialog.dismiss() }
//
//            val realmDatabase = RealmDb()
//            realmDatabase.deleteListCustomer(showdate)
//            realmDatabase.close()
//
//            val handler = Handler()
//            handler.postDelayed({
//                sweetAlertDialog.changeAlertType(SweetAlertDialog.SUCCESS_TYPE)
//                sweetAlertDialog.titleText = "ลบรายทั้งหมดเรียบร้อย"
//                sweetAlertDialog.showCancelButton(false)
//                sweetAlertDialog.showContentText(false)
//                sweetAlertDialog.setConfirmClickListener {
//                    sweetAlertDialog.dismiss()
//                    reloadListData()
//                }
//            }, 1500)
//        }
//
//        sweetAlertDialog.show()
//    }

//    private fun deleteCurrent(cus:String) {
//
//        // set dialog question
//        val sweetAlertDialog = SweetAlertDialog(this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
//        sweetAlertDialog.setCustomImage(R.drawable.p_bin)
//        sweetAlertDialog.titleText = "ต้องการลบรายการนี้?"
//        sweetAlertDialog.confirmText = getString(R.string.confirm_txt)
//        sweetAlertDialog.cancelText = getString(R.string.cancel_txt)
//        sweetAlertDialog.setCancelClickListener { sweetAlertDialog.dismissWithAnimation() }
//
//        // on confirm upload
//        sweetAlertDialog.setConfirmClickListener {
//            sweetAlertDialog.changeAlertType(SweetAlertDialog.PROGRESS_TYPE)
//            sweetAlertDialog.progressHelper.barColor = Color.parseColor("#A5DC86")
//            sweetAlertDialog.titleText = "กำลังลบรายการนี้"
//            sweetAlertDialog.showCancelButton(false)
//            sweetAlertDialog.showContentText(false)
//            sweetAlertDialog.setCancelClickListener(null)
//            sweetAlertDialog.setOnDismissListener { sweetAlertDialog.dismiss() }
//
//            callApi = Service()
//            callApi.deleteApiDeleteCustomer(cus,object : Service.UploadCallBack{
//                override fun onUpload(data: Any?) {
//
//        //            val realmDatabase = RealmDb()
//        //            realmDatabase.deleteCurrentCus(cus)
//        //            realmDatabase.close()
//
//                    val handler = Handler()
//                    handler.postDelayed({
//                        sweetAlertDialog.changeAlertType(SweetAlertDialog.SUCCESS_TYPE)
//                        sweetAlertDialog.titleText = "ลบรายการเรียบร้อย"
//                        sweetAlertDialog.showCancelButton(false)
//                        sweetAlertDialog.showContentText(false)
//                        sweetAlertDialog.setConfirmClickListener {
//                            sweetAlertDialog.dismiss()
//                            reloadListData()
//                        }
//                    }, 1500)
//
//                }
//
//                override fun onErrorUpload(err: String) {
//
//                    val handler = Handler()
//                    handler.postDelayed({
//                        sweetAlertDialog.changeAlertType(SweetAlertDialog.ERROR_TYPE)
//                        sweetAlertDialog.titleText = "ผิดพลาด ไม่สามารถลบได้"
//                        sweetAlertDialog.showCancelButton(false)
//                        sweetAlertDialog.showContentText(false)
//                        sweetAlertDialog.setConfirmClickListener {
//                            sweetAlertDialog.dismiss()
//                            finish()
//                        }
//                    }, 1500)
//
//                }
//            })
//
//
//
//        }
//
//        sweetAlertDialog.show()
//    }

    @SuppressLint("SetTextI18n")
    private fun createUserDetailDialog(cus:String): AlertDialog
    {
        val dialogBuilder = AlertDialog.Builder(this)
        val inflater = this.layoutInflater
        val dialogView = inflater.inflate(R.layout.card_dialog, null)
        dialogBuilder.setView(dialogView)
        val closeDialogButton = dialogView.findViewById<Button>(R.id.close)

        var qrCode = dialogView.findViewById<ImageView>(R.id.qrcode)
        var barCode = dialogView.findViewById<ImageView>(R.id.barcode)
        val userHandHeldIdTextView = dialogView.findViewById<TextView>(R.id.driver_name)

        val text = cus
        val multiFormatWriter = MultiFormatWriter()
        try {
            val bitMatrix = multiFormatWriter.encode(text, BarcodeFormat.QR_CODE, 400, 400)
            val barcodeEncoder = BarcodeEncoder()
            val bitmap = barcodeEncoder.createBitmap(bitMatrix)
            qrCode.setImageBitmap(bitmap)
        } catch (e: WriterException) {
            e.printStackTrace()
        }
        try {
            val bitMatrix = multiFormatWriter.encode(text, BarcodeFormat.CODE_128, 400, 200)
            val barcodeEncoder = BarcodeEncoder()
            val bitmap = barcodeEncoder.createBitmap(bitMatrix)
            barCode.setImageBitmap(bitmap)
        } catch (e: WriterException) {
            e.printStackTrace()
        }

        val tabLayout = dialogView.findViewById<TabLayout>(R.id.tablayout)
        tabLayout.addTab(tabLayout.newTab().setText("Qrcode"))
        tabLayout.addTab(tabLayout.newTab().setText("Barcode"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL

        fun getItem(position: Int) {
            when (position) {

                0 -> {
                    qrCode.visibility = View.VISIBLE
                    barCode.visibility = View.GONE
                    Log.e("SET-TAB", "0")
                }
                1 -> {
                    barCode.visibility = View.VISIBLE
                    qrCode.visibility = View.GONE
                    Log.e("SET-TAB", "1")
                }
                else -> null
            }
        }

        tabLayout.setOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                getItem(tab.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

        userHandHeldIdTextView.text = "รหัสลูกค้า : $cus"

        val userInfoDialog = dialogBuilder.create()

        closeDialogButton.setOnClickListener {
            userInfoDialog.dismiss()
        }

        if (userInfoDialog.window != null)
            userInfoDialog.window!!.attributes.windowAnimations = R.style.DialogAnimation

        fonts.overrideFonts(applicationContext, dialogView, fonts.DEFAULT_THAI_FONTS)

        return userInfoDialog
    }

    private fun reloadListData() {

        listAdapter.typeList = realmDatabase!!.ListCutomer(showdate)
        listAdapter.typeList.reverse()

        if (listAdapter.typeList.isEmpty()) {
            empty_text.visibility = View.VISIBLE
            bill_list_recycler_view.visibility = View.GONE
            Log.wtf("3333333333333333333","33333333333333333333")
        } else {
            empty_text.visibility = View.GONE
            bill_list_recycler_view.visibility = View.VISIBLE
            Log.wtf("44444444444444","444444444444444444")
        }

        listAdapter.notifyDataSetChanged()

    }


    /*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*- Adapter Class -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**/

    class CustomerListAdapter : RecyclerView.Adapter<CustomerListAdapter.TypeViewHolder>()
    {
        var typeList : ArrayList<Customer> = ArrayList()

        var onVideoClick : OnVideoClick? = null   //set button
        interface OnVideoClick{
            fun onClickItem(cus:String)
//            fun onClickUser(cus:String)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TypeViewHolder
        {
            val itemView =  LayoutInflater.from(parent.context).inflate(R.layout.customer_list_item, parent, false)
            return TypeViewHolder(itemView)
        }

        override fun getItemCount():Int
        {
            return typeList.size
        }

        override fun onBindViewHolder(holder: TypeViewHolder, position: Int) {
            val type = typeList[position]

            holder.textname1.text = type.customerCode
            holder.textname2.text = type.customerName
            holder.textname3.text = type.address+" จังหวัด"+type.province+" "+type.zipcode

            holder.cardview.setOnClickListener {
                onVideoClick?.onClickItem(type.customerCode)
            }

//            holder.deletee.setOnClickListener {
//                onVideoClick?.onClickUser(type.customerCode)
//            }

        }

        class TypeViewHolder(view : View) : RecyclerView.ViewHolder(view)
        {
            val textname1 : TextView = view.findViewById(R.id.country_name1)
            val textname2 : TextView = view.findViewById(R.id.country_name2)
            val textname3 : TextView = view.findViewById(R.id.country_name3)
            val cardview : CardView = view.findViewById(R.id.cardview)
//            val deletee : ImageView = view.findViewById(R.id.deletee)
        }
    }



}