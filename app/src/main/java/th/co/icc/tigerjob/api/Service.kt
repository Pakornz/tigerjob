package th.co.icc.tigerjob.api

import android.util.Log
import com.google.gson.GsonBuilder
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import okhttp3.Credentials
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import th.co.icc.tigerjob.api.CustomHttp.CONTENT_TYPE_JSON
import th.co.icc.tigerjob.api.modelapi.*
import th.co.icc.tigerjob.config.App.Companion.PASS_SKYFROG
import th.co.icc.tigerjob.config.App.Companion.SKYFROG_ICC_COMPANY_ID
import th.co.icc.tigerjob.config.App.Companion.USER_SKYFROG
import th.co.icc.tigerjob.config.App.Companion.WEB_API_BASE_URL_SKYFROG
import th.co.icc.tigerjob.config.App.Companion.WEB_API_BASE_URL_TIGER
import th.co.icc.tigerjob.config.App.Companion.WEB_API_CUSTOMER
import th.co.icc.tigerjob.config.App.Companion.WEB_API_PREFIX
import th.co.icc.tigerjob.database.RealmDb
import java.util.*
import th.co.icc.tigerjob.config.App.Companion.WEB_API_CREATE_CUSTOMER
import th.co.icc.tigerjob.config.App.Companion.WEB_API_CREATE_JOB
import th.co.icc.tigerjob.config.App.Companion.WEB_API_LISTCUSTOMER
import th.co.icc.tigerjob.config.App.Companion.WEB_API_TIGER_CREATE_CUSTOMER
import th.co.icc.tigerjob.config.App.Companion.WEB_API_TIGER_CREATE_JOB
import th.co.icc.tigerjob.config.App.Companion.WEB_API_TIGER_DELETE_CUSTOMER
import th.co.icc.tigerjob.config.App.Companion.WEB_API_TIGER_DELETE_JOB
import th.co.icc.tigerjob.config.App.Companion.WEB_API_ZIPCODE
import th.co.icc.tigerjob.config.App.Companion.WEB_GET_API_BASE_URL
import th.co.icc.tigerjob.config.App.Companion.WEB_GET_API_CREATE_RUNNING
import java.text.SimpleDateFormat
import okhttp3.ResponseBody
import retrofit2.http.DELETE




class Service {

    val gson = GsonBuilder().serializeNulls().create()

    val Service: ApiService
    val Service2: ApiService
    val Service3: ApiService


    interface ApiCallBack {
        fun onGetData(data: Any?)
        fun onError(err: String)
    }

    interface UploadCallBack{
        fun onUpload(data:Any?)
        fun onErrorUpload(err:String)
    }

    interface ApiService {

        @GET(WEB_API_PREFIX)
        fun getListPrefix(): Call<ListPrefix>

        @GET(WEB_API_CUSTOMER)
        fun getCustomer(@QueryMap options: Map<String, String>): Call<Customer>

        @GET(WEB_API_ZIPCODE)
        fun getListZipcode(@Path("zipid") zipid: String): Call<ListZipCode>

        @GET(WEB_GET_API_CREATE_RUNNING)
        fun getCreateCustomer(@QueryMap options: Map<String, String>): Call<RunningCustomer>

        @GET(WEB_API_LISTCUSTOMER)
        fun getListCustomer(@QueryMap options: Map<String, String>): Call<ListCustomer>

        @POST(WEB_API_TIGER_CREATE_CUSTOMER)
        fun postCreateCustomer(@Body body : RequestBody): Call<Any>

        @POST(WEB_API_TIGER_CREATE_JOB)
        fun postCreateJob(@Body body : RequestBody): Call<Any>

        @HTTP(method = "DELETE", path = WEB_API_TIGER_DELETE_JOB, hasBody = true)
        fun deleteDeleteJob(@Body body : RequestBody): Call<Any>

        @HTTP(method = "DELETE", path = WEB_API_TIGER_DELETE_CUSTOMER, hasBody = true)
        fun deleteDeleteCustomer(@Body body : RequestBody): Call<Any>

    }

    init {

        val httpClient = OkHttpClient.Builder()
        val authToken = Credentials.basic(USER_SKYFROG, PASS_SKYFROG)

        httpClient.addInterceptor { chain ->
            val request = chain.request().newBuilder()
                .addHeader(CustomHttp.Header.AUTHORIZATION, authToken)
                .addHeader(CustomHttp.Header.CONTENT_TYPE, CONTENT_TYPE_JSON)
                .addHeader(CustomHttp.Header.COMPANY_ID, SKYFROG_ICC_COMPANY_ID)
                .build()

            chain.proceed(request)
        }
        val client = httpClient.build()

//        ---------------------------------------------

        val httpClient2 = OkHttpClient.Builder()

        httpClient2.addInterceptor { chain ->
            val request = chain.request().newBuilder()
                .addHeader(CustomHttp.Header.CONTENT_TYPE, CONTENT_TYPE_JSON)
                .build()

            chain.proceed(request)
        }
        val client2 = httpClient2.build()

        val retrofit = Retrofit.Builder()
            .baseUrl(WEB_API_BASE_URL_SKYFROG)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client)
            .build()

        Service = retrofit.create(ApiService::class.java)

        val retrofit2 = Retrofit.Builder()
            .baseUrl(WEB_GET_API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

        Service2 = retrofit2.create(ApiService::class.java)

        val retrofit3 = Retrofit.Builder()
            .baseUrl(WEB_API_BASE_URL_TIGER)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client2)
            .build()

        Service3 = retrofit3.create(ApiService::class.java)
    }

    fun getApiCustomer(cus: String,cb:ApiCallBack?){

        val paramHM = HashMap<String, String>()
        paramHM.put("S_Cus",cus)

        Service.getCustomer(paramHM).enqueue(object : Callback<Customer> {
            override fun onResponse(call: Call<Customer>, response: Response<Customer>) {
                if (response.isSuccessful){
                    cb?.onGetData(response.body())
                    Log.wtf("success", response.body().toString())
                    Log.wtf("success", "1111111111")
                }else{
                    cb?.onError("ERROR")
                    Log.wtf("success", "2222222222")
                }
            }

            override fun onFailure(call: Call<Customer>, t: Throwable?) {
                cb?.onError("ERROR")
                Log.wtf("Failure", "3333333333")
            }

        })
    }

    fun getApiCreateCustomer(pre:String,typ:String,cb:ApiCallBack?){

        val paramHM = HashMap<String, String>()
        paramHM.put("prefix",pre)
        paramHM.put("type",typ)

        Service2.getCreateCustomer(paramHM).enqueue(object : Callback<RunningCustomer> {
            override fun onResponse(call: Call<RunningCustomer>, response: Response<RunningCustomer>) {
                if (response.isSuccessful){
                    cb?.onGetData(response.body())
                    Log.wtf("success", response.body().toString())
                    Log.wtf("success", "1111111111")
                }else{
                    cb?.onError("ERROR")
                    Log.wtf("success", "2222222222")
                }
            }

            override fun onFailure(call: Call<RunningCustomer>, t: Throwable?) {
                cb?.onError("ERROR")
                Log.wtf("Failure", "3333333333")
            }

        })
    }

    fun getApiListCustomer(cus: String,limit :String,cb:ApiCallBack?){

        val paramHM = HashMap<String, String>()
        paramHM.put("CustomerName",cus)
        paramHM.put("limit",limit)

        Service.getListCustomer(paramHM).enqueue(object : Callback<ListCustomer> {
            override fun onResponse(call: Call<ListCustomer>, response: Response<ListCustomer>) {
                if (response.isSuccessful){
                    cb?.onGetData(response.body())
                    Log.wtf("success", response.body().toString())
                    Log.wtf("success", "1111111111")
                }else{
                    cb?.onError("ERROR")
                    Log.wtf("success", "2222222222")
                }
            }

            override fun onFailure(call: Call<ListCustomer>, t: Throwable?) {
                cb?.onError("ERROR")
                Log.wtf("Failure", "3333333333")
            }

        })
    }

    fun getApiListPrefix(cb:ApiCallBack?){
        Service.getListPrefix().enqueue(object : Callback<ListPrefix> {
            override fun onResponse(call: Call<ListPrefix>?, response: Response<ListPrefix>?) {
                if (response!!.isSuccessful) {
                    cb?.onGetData(response.body())
                    Log.wtf("success", response.body().toString())
                    Log.wtf("success", "1111111111")
                }else{
                    cb?.onError("ERROR")
                    Log.wtf("success", "2222222222")
                }
            }

            override fun onFailure(call: Call<ListPrefix>?, t: Throwable?) {
                cb?.onError("ERROR")
                Log.wtf("Failure", "3333333333")
            }

        })
    }

    fun getApiListZipcode(zipid:String, cb:ApiCallBack?){
        Service.getListZipcode(zipid).enqueue(object : Callback<ListZipCode> {
            override fun onResponse(call: Call<ListZipCode>?, response: Response<ListZipCode>?) {
                if (response!!.isSuccessful){
                    val gson = GsonBuilder().serializeNulls().create()
                    val jsonObject = gson.toJsonTree(response.body()).asJsonObject
                    val success = jsonObject.get("result").asString

                    if (success == "true"){
                        cb?.onGetData(response.body())
                        Log.wtf("Deteail Success true", response.body().toString())
                    }else{
                        cb?.onError(response.body().toString())
                        Log.wtf("Deteail Success false", response.body().toString())
                    }

                }else{
                    cb?.onError(response.body().toString())
                    Log.wtf("onResponse error", response.body().toString())
                }
            }

            override fun onFailure(call: Call<ListZipCode>?, t: Throwable?) {
                cb?.onError("ERROR")
                Log.wtf("onFailure error", "")
            }

        })
    }

//    fun postApiCreateCustomer(ub:UploadCallBack?){
//
//        val realmDatabase: RealmDb = RealmDb()
//        val custo = realmDatabase.custo!!
//
//        val bodyHM = JsonObject()
//
//        bodyHM.addProperty("CustomerCode",custo.customerCode)
//        bodyHM.addProperty("CustomerName",custo.customerName)
//        bodyHM.addProperty("Type","D")
//        bodyHM.addProperty("OfficeTel",custo.tel)
//        bodyHM.addProperty("Mobile",custo.tel)
//        bodyHM.addProperty("Fax","")
//        bodyHM.addProperty("IsActive","True")
//        bodyHM.addProperty("IsNotifyDaily","")
//        bodyHM.addProperty("Email","")
//        bodyHM.addProperty("Address",custo.address)
//        bodyHM.addProperty("District",custo.province)
//        bodyHM.addProperty("Zipcode",custo.zipcode)
//        bodyHM.addProperty("Password","")
//        bodyHM.add("Position",JsonObject())
//        bodyHM.getAsJsonObject("Position").addProperty("Lat",custo.lat)
//        bodyHM.getAsJsonObject("Position").addProperty("Lng",custo.lng)
//        bodyHM.getAsJsonObject("Position").addProperty("radius","")
//
//
//        val uploadJSONString = gson.toJson(bodyHM)
//
//        Log.wtf("BODY", uploadJSONString)
//
//        val body = RequestBody.create(MediaType.parse(CONTENT_TYPE_JSON), uploadJSONString)
//
//        Service.postCreateCustomer(body).enqueue(object : Callback<Any> {
//            override fun onResponse(call: Call<Any>?, response: Response<Any>?) {
//
//                if (response!!.isSuccessful){
//                    val gson = GsonBuilder().serializeNulls().create()
//                    val jsonObject = gson.toJsonTree(response.body()).asJsonObject
//                    val success = jsonObject.get("success").asString
//
//                    if (success == "true"){
//                        ub?.onUpload(response.body().toString())
//                        Log.wtf("2222222222222222", response.body().toString())
//                    }else{
//                        ub?.onErrorUpload(response.body().toString())
//                        Log.wtf("not 333333333333", response.body().toString())
//                    }
//
//                }else{
//                    ub?.onErrorUpload(response.body().toString())
//                    Log.wtf("not 333333333333", response.body().toString())
//                }
//            }
//
//            override fun onFailure(call: Call<Any>?, t: Throwable?) {
//                ub?.onErrorUpload("ERROR99999999999")
//                Log.wtf("Failure", uploadJSONString)
//            }
//
//        })
//    }

//    fun postApiCreateJob(ub:UploadCallBack?){
//
//        val calendar = Calendar.getInstance()
//        calendar.add(Calendar.DAY_OF_YEAR, +1)
//        val formatdate = SimpleDateFormat("dd/MM/yyyy HH:mm")
//
//        val currentdate = Calendar.getInstance()
//
//        val newdate = formatdate.format(calendar.time)
//        val date = formatdate.format(currentdate.time)
//
//        val realmDatabase = RealmDb()
//        val job = realmDatabase.job!!
//        val pre = realmDatabase.prefix!!
//
//        var itembox:Int = job.box.toInt()
//
//        val bodyHM = JsonObject()
//
//        bodyHM.addProperty("CompanyID","C160040")
//        bodyHM.addProperty("JobNo",job.jobNo)
//        bodyHM.addProperty("JobType","8")
//        bodyHM.addProperty("JobStatus","OPEN")
//        bodyHM.addProperty("Ref1",pre.prefix)
//        bodyHM.addProperty("Ref2",pre.docname)
//        bodyHM.addProperty("Ref3","")
//        bodyHM.addProperty("Ref4","")
//        bodyHM.addProperty("Ref5",job.zipcode)
//        bodyHM.addProperty("Ref6","")
//        bodyHM.addProperty("Ref7",job.box)
//        bodyHM.addProperty("Ref8","")
//        bodyHM.addProperty("Ref9","")
//        bodyHM.addProperty("Ref10","")
//        bodyHM.addProperty("Ref11","")
//        bodyHM.addProperty("Ref12","")
//        bodyHM.addProperty("Remark",job.remark)
//        bodyHM.addProperty("LoadID","")
//        bodyHM.addProperty("HHID","16004000004")
//        bodyHM.addProperty("PickupDate",date)
//        bodyHM.addProperty("GroupID","1000")
//        bodyHM.addProperty("Amount","")
//
//        bodyHM.add("Customer",JsonObject())
//        bodyHM.getAsJsonObject("Customer").addProperty("CustomerCode",job.customerCode)
//        bodyHM.getAsJsonObject("Customer").addProperty("CustomerName","")
//        bodyHM.getAsJsonObject("Customer").addProperty("Address","")
//        bodyHM.getAsJsonObject("Customer").addProperty("CustomerType","")
//        bodyHM.getAsJsonObject("Customer").addProperty("Tel",job.tel)
//        bodyHM.getAsJsonObject("Customer").addProperty("Fax","")
//        bodyHM.getAsJsonObject("Customer").addProperty("Latitude","")
//        bodyHM.getAsJsonObject("Customer").addProperty("Longitude","")
//        bodyHM.getAsJsonObject("Customer").addProperty("RadiusError","")
//        bodyHM.getAsJsonObject("Customer").addProperty("UpSert","")
//
//        bodyHM.add("Pickup",JsonObject())
//        bodyHM.getAsJsonObject("Pickup").addProperty("PointCode","TIGER")
//        bodyHM.getAsJsonObject("Pickup").addProperty("PointName","")
//        bodyHM.getAsJsonObject("Pickup").addProperty("Address","")
//        bodyHM.getAsJsonObject("Pickup").addProperty("Latitude","")
//        bodyHM.getAsJsonObject("Pickup").addProperty("Longitude","")
//        bodyHM.getAsJsonObject("Pickup").addProperty("ContactName","")
//        bodyHM.getAsJsonObject("Pickup").addProperty("ContactFullName","")
//        bodyHM.getAsJsonObject("Pickup").addProperty("Tel","")
//        bodyHM.getAsJsonObject("Pickup").addProperty("Email","")
//        bodyHM.getAsJsonObject("Pickup").addProperty("Notification","")
//        bodyHM.getAsJsonObject("Pickup").addProperty("DueDate",date)
//        bodyHM.getAsJsonObject("Pickup").addProperty("UpSert","")
//
//        bodyHM.add("Shipping",JsonObject())
//        bodyHM.getAsJsonObject("Shipping").addProperty("PointCode",job.customerCode)
//        bodyHM.getAsJsonObject("Shipping").addProperty("PointName","")
//        bodyHM.getAsJsonObject("Shipping").addProperty("Address","")
//        bodyHM.getAsJsonObject("Shipping").addProperty("Latitude","")
//        bodyHM.getAsJsonObject("Shipping").addProperty("Longitude","")
//        bodyHM.getAsJsonObject("Shipping").addProperty("ContactName","")
//        bodyHM.getAsJsonObject("Shipping").addProperty("ContactFullName",job.contact)
//        bodyHM.getAsJsonObject("Shipping").addProperty("Tel",job.tel)
//        bodyHM.getAsJsonObject("Shipping").addProperty("Email","")
//        bodyHM.getAsJsonObject("Shipping").addProperty("Notification","")
//        bodyHM.getAsJsonObject("Shipping").addProperty("DueDate",newdate)
//        bodyHM.getAsJsonObject("Shipping").addProperty("UpSert","")
//
//        val array = JsonArray()
//        for (i in 1..itembox){
//            val objfromArray = JsonObject()
//            objfromArray.addProperty("ItemNo",i)
//            objfromArray.addProperty("ItemCode","ITEM$i")
//            objfromArray.addProperty("Description","")
//            objfromArray.addProperty("Quantity","1")
//            objfromArray.addProperty("ReceiveQuantity","")
//            objfromArray.addProperty("Unit","")
//            objfromArray.addProperty("Width","")
//            objfromArray.addProperty("Length","")
//            objfromArray.addProperty("Height","")
//            objfromArray.addProperty("Weight","")
//            objfromArray.addProperty("Reference","")
//            array.add(objfromArray)
//        }
//        bodyHM.add("Items",array)
//
//
//        val uploadJSONString = gson.toJson(bodyHM)
//
//        Log.wtf("BODY", uploadJSONString)
//
//        val body = RequestBody.create(MediaType.parse(CONTENT_TYPE_JSON), uploadJSONString)
//
//        Service.postCreateJob(body).enqueue(object : Callback<Any> {
//            override fun onResponse(call: Call<Any>?, response: Response<Any>?) {
//
//                if (response!!.isSuccessful){
//                    val gson = GsonBuilder().serializeNulls().create()
//                    val jsonObject = gson.toJsonTree(response.body()).asJsonObject
//                    val success = jsonObject.get("success").asString
//
//                    if (success == "true"){
//                        ub?.onUpload(response.body().toString())
//                        Log.wtf("2222222222222222", response.body().toString())
//                    }else{
//                        ub?.onErrorUpload(response.body().toString())
//                        Log.wtf("not 333333333333", response.body().toString())
//                    }
//
//                }else{
//                    ub?.onErrorUpload(response.body().toString())
//                    Log.wtf("not 333333333333", response.body().toString())
//                }
//            }
//
//            override fun onFailure(call: Call<Any>?, t: Throwable?) {
//                ub?.onErrorUpload("ERROR99999999999")
//                Log.wtf("Failure", uploadJSONString)
//            }
//
//        })
//    }

    fun postApiCreateCustomer(ub:UploadCallBack?){

        val realmDatabase: RealmDb = RealmDb()
        val custo = realmDatabase.custo!!

        val bodyHM = JsonObject()

        bodyHM.addProperty("customer_code",custo.customerCode)
        bodyHM.addProperty("customer_name",custo.customerName)
        bodyHM.addProperty("tel",custo.tel)
        bodyHM.addProperty("address",custo.address)
        bodyHM.addProperty("subdistrict",custo.subdistrict)
        bodyHM.addProperty("district",custo.district)
        bodyHM.addProperty("province",custo.province)
        bodyHM.addProperty("zipcode",custo.zipcode)
        bodyHM.addProperty("latitude",custo.lat)
        bodyHM.addProperty("longitude",custo.lng)


        val uploadJSONString = gson.toJson(bodyHM)

        Log.wtf("BODY", uploadJSONString)

        val body = RequestBody.create(MediaType.parse(CONTENT_TYPE_JSON), uploadJSONString)

        Service3.postCreateCustomer(body).enqueue(object : Callback<Any> {
            override fun onResponse(call: Call<Any>?, response: Response<Any>?) {

                if (response!!.isSuccessful){
                    val gson = GsonBuilder().serializeNulls().create()
                    val jsonObject = gson.toJsonTree(response.body()).asJsonObject
                    val success = jsonObject.get("result").asString
                    val message = jsonObject.get("message").asString

                    if (success == "true"){
                        ub?.onUpload(response.body().toString())
                        Log.wtf("2222222222222222", message)
                    }else{
                        ub?.onErrorUpload(response.body().toString())
                        Log.wtf("not 333333333333", message)
                    }

                }else{
                    ub?.onErrorUpload(response.body().toString())
                    Log.wtf("not 333333333333", response.body().toString())
                }
            }

            override fun onFailure(call: Call<Any>?, t: Throwable?) {
                ub?.onErrorUpload("ERROR99999999999")
                Log.wtf("Failure", uploadJSONString)
            }

        })
    }

    fun postApiCreateJob(ub:UploadCallBack?){
        val realmDatabase = RealmDb()
        val job = realmDatabase.job!!
        val pre = realmDatabase.prefix!!

        val bodyHM = JsonObject()

        bodyHM.addProperty("job_no",job.jobNo)
        bodyHM.addProperty("prefix_code",pre.prefix)
        bodyHM.addProperty("prefix_name",pre.docname)
        bodyHM.addProperty("customer_code",job.customerCode)
        bodyHM.addProperty("customer_name",job.contact)
        bodyHM.addProperty("zipcode",job.zipcode)
        bodyHM.addProperty("total_box",job.box.toInt())
        bodyHM.addProperty("remark",job.remark)

        val uploadJSONString = gson.toJson(bodyHM)

        Log.wtf("BODY", uploadJSONString)

        val body = RequestBody.create(MediaType.parse(CONTENT_TYPE_JSON), uploadJSONString)

        Service3.postCreateJob(body).enqueue(object : Callback<Any> {
            override fun onResponse(call: Call<Any>?, response: Response<Any>?) {

                if (response!!.isSuccessful){
                    val gson = GsonBuilder().serializeNulls().create()
                    val jsonObject = gson.toJsonTree(response.body()).asJsonObject
                    val success = jsonObject.get("result").asString
                    val message = jsonObject.get("message").asString

                    if (success == "true"){
                        ub?.onUpload(response.body().toString())
                        Log.wtf("2222222222222222", message)
                    }else{
                        ub?.onErrorUpload(response.body().toString())
                        Log.wtf("not 333333333333", message)
                    }

                }else{
                    ub?.onErrorUpload(response.body().toString())
                    Log.wtf("not 333333333333", response.body().toString())
                }
            }

            override fun onFailure(call: Call<Any>?, t: Throwable?) {
                ub?.onErrorUpload("ERROR99999999999")
                Log.wtf("Failure", uploadJSONString)
            }

        })
    }

    fun deleteApiDeleteJob(cus:String,ub:UploadCallBack?){

        val realmDatabase = RealmDb()
        realmDatabase.deleteCurrentJob(cus)
        realmDatabase.close()

        val bodyHM = JsonObject()

        bodyHM.addProperty("job_no",cus)

        val uploadJSONString = gson.toJson(bodyHM)

        Log.wtf("BODY", uploadJSONString)

        val body = RequestBody.create(MediaType.parse(CONTENT_TYPE_JSON), uploadJSONString)

        Service2.deleteDeleteJob(body).enqueue(object : Callback<Any> {
            override fun onResponse(call: Call<Any>?, response: Response<Any>?) {

                if (response!!.isSuccessful){
                    val gson = GsonBuilder().serializeNulls().create()
                    val jsonObject = gson.toJsonTree(response.body()).asJsonObject
                    val success = jsonObject.get("result").asString
                    val message = jsonObject.get("message").asString

                    if (success == "true"){
                        ub?.onUpload(response.body().toString())
                        Log.wtf("2222222222222222", message)
                    }else{
                        ub?.onErrorUpload(response.body().toString())
                        Log.wtf("not 333333333333", message)
                    }

                }else{
                    ub?.onErrorUpload(response.body().toString())
                    Log.wtf("not 333333333333", response.body().toString())
                }
            }

            override fun onFailure(call: Call<Any>?, t: Throwable?) {
                ub?.onErrorUpload("ERROR99999999999")
                Log.wtf("Failure", uploadJSONString)
            }

        })
    }

    fun deleteApiDeleteCustomer(cus:String,ub:UploadCallBack?){

        val realmDatabase = RealmDb()
        realmDatabase.deleteCurrentCus(cus)
        realmDatabase.close()

        val bodyHM = JsonObject()

        bodyHM.addProperty("customer_id",cus)

        val uploadJSONString = gson.toJson(bodyHM)

        Log.wtf("BODY", uploadJSONString)

        val body = RequestBody.create(MediaType.parse(CONTENT_TYPE_JSON), uploadJSONString)

        Service2.deleteDeleteCustomer(body).enqueue(object : Callback<Any> {
            override fun onResponse(call: Call<Any>?, response: Response<Any>?) {

                if (response!!.isSuccessful){
                    val gson = GsonBuilder().serializeNulls().create()
                    val jsonObject = gson.toJsonTree(response.body()).asJsonObject
                    val success = jsonObject.get("result").asString
                    val message = jsonObject.get("message").asString

                    if (success == "true"){
                        ub?.onUpload(response.body().toString())
                        Log.wtf("2222222222222222", message)
                    }else{
                        ub?.onErrorUpload(response.body().toString())
                        Log.wtf("not 333333333333", message)
                    }

                }else{
                    ub?.onErrorUpload(response.body().toString())
                    Log.wtf("not 333333333333", response.body().toString())
                }
            }

            override fun onFailure(call: Call<Any>?, t: Throwable?) {
                ub?.onErrorUpload("ERROR99999999999")
                Log.wtf("Failure", uploadJSONString)
            }

        })
    }


}