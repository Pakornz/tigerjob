package th.co.icc.tigerjob

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.CardView
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.SearchView
import android.util.Log
import android.view.*
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_job.*
import th.co.icc.tigerjob.api.Service
import th.co.icc.tigerjob.api.modelapi.Customer
import th.co.icc.tigerjob.api.modelapi.ListCustomer
import th.co.icc.tigerjob.config.Config.KEY_CUS_ID
import java.text.SimpleDateFormat
import java.util.*


class JobActivity : BaseActivity() {

    var job_qty_text_view : TextView? = null
    var no1 : TextView? = null
    var no2 : TextView? = null
    var no3 : TextView? = null
    var no4 : TextView? = null
    var no5 : TextView? = null
    var no6 : TextView? = null
    var no7 : TextView? = null
    var no8 : TextView? = null
    var statusContainer : View? = null
    var statusIcon : ImageView? = null
    var statusText : TextView? = null
    val STATUS_SEARCH = 1
    var step1Item : View? = null

    var currentdate = Calendar.getInstance().time
    val formatdate = SimpleDateFormat("yyyyMMdd")
    val date = formatdate.format(currentdate)

    private lateinit var basicListAdapter : BasicAdapter

    lateinit var callApi : Service
    lateinit var api : Customer.DatasBean

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job)

        initRealmDatabase()

        bindView()
        showStatus()

        setList()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_createjob, menu)
        val searchItem = menu.findItem(R.id.menu_search)
        if(searchItem != null){
            val searchView = searchItem.actionView as SearchView
            val editext = searchView.findViewById<EditText>(android.support.v7.appcompat.R.id.search_src_text)
            editext.hint = "ค้นหา . . ."

            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
                override fun onQueryTextSubmit(query: String?): Boolean {
                    return true
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    callListCustomer(newText!!,"20")
//                    callCustomer2(newText!!)
                    return true
                }

            })
        }
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        // Handle item selection
        when (item?.itemId) {
            android.R.id.home -> {
                finish()
            }
        }
        return false
    }

    private fun bindView() {

        statusContainer = findViewById(R.id.status_container)
        step1Item= findViewById(R.id.container)
    }

    private fun updateUI() {

        basicListAdapter.basiclist.reversed()

        if (basicListAdapter.basiclist.isEmpty()){
            country_list.visibility = View.GONE
            status_icon2.visibility = View.VISIBLE
            txt_empty_notes_view.visibility = View.VISIBLE
        }else{
            country_list.visibility = View.VISIBLE
            status_icon2.visibility = View.GONE
            txt_empty_notes_view.visibility = View.GONE
        }

        basicListAdapter.notifyDataSetChanged()

    }

    private fun showStatus()
    {
        statusContainer!!.visibility = View.VISIBLE
    }

    private fun hideStatus()
    {
        statusContainer!!.visibility = View.GONE
    }

    private fun setList() {

        basicListAdapter = BasicAdapter()
        country_list.adapter = basicListAdapter
        country_list.layoutManager = LinearLayoutManager(applicationContext)

        basicListAdapter.onVideoClick = object : BasicAdapter.OnVideoClick  //set button
        {
            override fun onClickUser(cus:ListCustomer.DatasBean) {
                val intent = Intent(applicationContext,JobCompleteActivity::class.java) // put intent
                intent.putExtra(KEY_CUS_ID,"${cus.id}")
                startActivity(intent)
            }
        }
    }

    private fun callListCustomer(cus:String,limit:String) {
        hideStatus()

        callApi = Service()
        callApi.getApiListCustomer(cus,limit,object : Service.ApiCallBack {
            override fun onGetData(data:Any?) {

                    Log.wtf("11111111111111111",data.toString())

                    val yt = data as ListCustomer
                    val jb = yt.datas

                    basicListAdapter.basiclist = jb //name records

                    updateUI()
//                    Log.wtf("99999999999999999999",jb[0].name)


            }
            override fun onError(err: String) {
                Log.wtf("33333333333333","333333333333333")
            }
        })
    }

    class BasicAdapter : RecyclerView.Adapter<BasicAdapter.BasicHolder>(){

        var basiclist : List<ListCustomer.DatasBean> = emptyList()

        var onVideoClick : OnVideoClick? = null   //set button
        interface OnVideoClick{
            fun onClickUser(cus:ListCustomer.DatasBean)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BasicHolder {
            val rowView = LayoutInflater.from(parent.context).inflate(R.layout.search_list,parent,false)
            return BasicHolder(rowView)

        }

        override fun getItemCount(): Int {
            return basiclist.size
        }

        override fun onBindViewHolder(holder: BasicHolder, position: Int) {
            val basic = basiclist[position]

            holder.textname1.text = basic.id
            holder.textname2.text = basic.name
            holder.textname3.text = basic.tel

            holder.cardview.setOnClickListener {
                onVideoClick?.onClickUser(basic)
            }

        }

        class BasicHolder(val view: View) : RecyclerView.ViewHolder(view){
            val textname1 : TextView = view.findViewById(R.id.country_name1)
            val textname2 : TextView = view.findViewById(R.id.country_name2)
            val textname3 : TextView = view.findViewById(R.id.country_name3)
            val cardview : CardView = view.findViewById(R.id.cardview)

        }
    }

}
