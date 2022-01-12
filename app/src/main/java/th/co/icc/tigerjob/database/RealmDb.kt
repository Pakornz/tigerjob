package th.co.icc.tigerjob.database

import android.app.Activity
import android.util.Log
import io.realm.Realm
import th.co.icc.tigerjob.api.modelapi.ResultSet
import th.co.icc.tigerjob.database.modelrealm.*
import java.util.ArrayList

import java.util.Date
import java.util.Locale


class RealmDb {
    var realmDatabase: Realm? = null

    interface RealmTransactionFinished {
        fun onFinish(result: ResultSet)
    }

    constructor() {
        realmDatabase = Realm.getDefaultInstance()
    }

    constructor(activity: Activity) {
        realmDatabase = Realm.getDefaultInstance()
    }

    fun close() {
        if (realmDatabase != null) {
            realmDatabase!!.close()
        }
    }

    /*========================= user ================================*/

    val user: User?
        get() = realmDatabase!!.where(User::class.java).findFirst()

    fun insertOrUpdateUser(user: User) {
        realmDatabase!!.executeTransaction { realm ->
            user.authDate = Date()
            realm.insertOrUpdate(user)
        }
    }

    fun deleteUser(realmTransactionFinished:RealmTransactionFinished) {
        realmDatabase!!.executeTransaction { realm ->
            val user = realm.where(User::class.java).findAll()
            val isDelete = user.deleteAllFromRealm()

            if (realmTransactionFinished != null) {
                val rs = ResultSet()
                rs.isSuccess = isDelete
                realmTransactionFinished.onFinish(rs)
            }
        }

    }

    fun deleteUser(): Boolean {
        val isDelete: Boolean
        realmDatabase!!.beginTransaction()

        val user = realmDatabase!!.where(User::class.java).findAll()
        isDelete = user.deleteAllFromRealm()

        if (isDelete)
            realmDatabase!!.commitTransaction()
        else
            realmDatabase!!.cancelTransaction()

        return isDelete
    }

    /*========================= prefix ================================*/

    val prefix: Prefix?
        get() = realmDatabase!!.where(Prefix::class.java).findFirst()

    fun insertOrUpdatePrefix(prefix: Prefix) {
        realmDatabase!!.executeTransaction { realm -> realm.insertOrUpdate(prefix) }
    }

    fun deletePrefix(): Boolean {
        val isDelete: Boolean
        realmDatabase!!.beginTransaction()

        val prefix = realmDatabase!!.where(Prefix::class.java).findAll()
        isDelete = prefix.deleteAllFromRealm()

        if (isDelete)
            realmDatabase!!.commitTransaction()
        else
            realmDatabase!!.cancelTransaction()

        return isDelete
    }

    /*========================= CreateCustomer ================================*/

    val custo: CreateCustomer?
        get() = realmDatabase!!.where(CreateCustomer::class.java).findFirst()

    fun insertOrUpdateCustomer(custo: CreateCustomer) {
        realmDatabase!!.executeTransaction { realm -> realm.insertOrUpdate(custo) }
    }

    fun deleteCusto(): Boolean {
        val isDelete: Boolean
        realmDatabase!!.beginTransaction()

        val custo = realmDatabase!!.where(CreateCustomer::class.java).findAll()
        isDelete = custo.deleteAllFromRealm()

        if (isDelete)
            realmDatabase!!.commitTransaction()
        else
            realmDatabase!!.cancelTransaction()

        return isDelete
    }

    /*========================= ListCustomer ================================*/

    val listCustomer : Customer?
        get() = realmDatabase!!.where(Customer::class.java).findFirst()

    fun ListCutomer(showdate:String): ArrayList<Customer> {
        val cus : ArrayList<Customer> = ArrayList()

        try {
            val query = realmDatabase!!.where(Customer::class.java).equalTo("date",showdate).findAll()

            for (i in query){
                cus.add(cloneCustomer(i))
            }

        }catch (e:Exception){
            Log.e("Error na Krub",e.message)
        }
        return cus

    }

    fun deleteCurrentCus(deleteCurrent:String): Boolean {
        var isDeleted = false

        realmDatabase!!.beginTransaction()
        try {
            val query = realmDatabase!!.where(Customer::class.java).equalTo("customerCode",deleteCurrent).findAll()
            isDeleted = query.deleteAllFromRealm()

            if (isDeleted)
            {
                realmDatabase!!.commitTransaction()
            }
            else{
                realmDatabase!!.cancelTransaction()
            }

        }
        catch (e:Exception)
        {
            realmDatabase!!.cancelTransaction()
        }

        return isDeleted
    }

    private fun cloneCustomer(cus: Customer) : Customer {

        val newNote = Customer()
        newNote.customerCode = cus.customerCode
        newNote.customerName = cus.customerName
        newNote.address = cus.address
        newNote.subdistrict = cus.subdistrict
        newNote.district = cus.district
        newNote.province = cus.province
        newNote.zipcode = cus.zipcode
        newNote.tel = cus.tel
        newNote.lat = cus.lat
        newNote.lng = cus.lng
        newNote.date = cus.date

        return newNote

    }

    fun insertOrUpdateListCustomer(custo: Customer) {
            realmDatabase!!.beginTransaction()

            try {

                realmDatabase!!.insertOrUpdate(custo)
                realmDatabase!!.commitTransaction()

            }catch (e:Exception){
                Log.e("Error na krub",e.message)
                realmDatabase!!.cancelTransaction()
            }
    }

    fun deleteListCustomer(deleteDay:String): Boolean {
        var isDeleted = false

        realmDatabase!!.beginTransaction()
        try {
            val query = realmDatabase!!.where(Customer::class.java).equalTo("date",deleteDay).findAll()
            isDeleted = query.deleteAllFromRealm()

            if (isDeleted)
            {
                realmDatabase!!.commitTransaction()
            }
            else{
                realmDatabase!!.cancelTransaction()
            }

        }
        catch (e:Exception)
        {
            realmDatabase!!.cancelTransaction()
        }

        return isDeleted
    }


    /*========================= CreateJob ================================*/

    val job: CreateJob?
        get() = realmDatabase!!.where(CreateJob::class.java).findFirst()

    fun insertOrUpdateJob(job: CreateJob) {
        realmDatabase!!.executeTransaction { realm -> realm.insertOrUpdate(job) }
    }

    fun deleteJob(): Boolean {
        val isDelete: Boolean
        realmDatabase!!.beginTransaction()

        val job = realmDatabase!!.where(CreateJob::class.java).findAll()
        isDelete = job.deleteAllFromRealm()

        if (isDelete)
            realmDatabase!!.commitTransaction()
        else
            realmDatabase!!.cancelTransaction()

        return isDelete
    }

    fun deleteRemarkJob(jobNo: CreateJob): Boolean {
        val isDelete: Boolean
        realmDatabase!!.beginTransaction()

        val delremark = realmDatabase!!.where(CreateJob::class.java).equalTo("jobNo", jobNo.remark).findAll()
        isDelete = delremark.deleteAllFromRealm()

        if (isDelete)
            realmDatabase!!.commitTransaction()
        else
            realmDatabase!!.cancelTransaction()

        return isDelete
    }

    /*========================= ListJob ================================*/

    val listJob : Job?
        get() = realmDatabase!!.where(Job::class.java).findFirst()

    fun ListJob(showdate:String): ArrayList<Job> {
        val cus : ArrayList<Job> = ArrayList()

        try {
            val query = realmDatabase!!.where(Job::class.java).equalTo("date",showdate).findAll()

            for (i in query){
                cus.add(cloneJob(i))
            }

        }catch (e:Exception){
            Log.e("Error na Krub",e.message)
        }
        return cus


    }

    private fun cloneJob(job: Job) : Job {

        val newNote = Job()
        newNote.jobNo = job.jobNo
        newNote.customerCode = job.customerCode
        newNote.currentDate = job.currentDate
        newNote.box = job.box
        newNote.zipcode = job.zipcode
        newNote.tel = job.tel
        newNote.contact = job.contact
        newNote.remark = job.remark
        newNote.date = job.date
        newNote.currenttime = job.currenttime

        return newNote

    }

    fun insertOrUpdateListJob(job: Job) {
        realmDatabase!!.beginTransaction()

        try {

            realmDatabase!!.insertOrUpdate(job)
            realmDatabase!!.commitTransaction()

        }catch (e:Exception){
            Log.e("Error na krub",e.message)
            realmDatabase!!.cancelTransaction()
        }
    }

    fun deleteListJob(deleteDay:String): Boolean {
        var isDeleted = false

        realmDatabase!!.beginTransaction()
        try {
            val query = realmDatabase!!.where(Job::class.java).equalTo("date",deleteDay).findAll()
            isDeleted = query.deleteAllFromRealm()

            if (isDeleted)
            {
                realmDatabase!!.commitTransaction()
            }
            else{
                realmDatabase!!.cancelTransaction()
            }

        }
        catch (e:Exception)
        {
            realmDatabase!!.cancelTransaction()
        }

        return isDeleted
    }

    fun deleteCurrentJob(deleteCurrent:String): Boolean {
        var isDeleted = false

        realmDatabase!!.beginTransaction()
        try {
            val query = realmDatabase!!.where(Job::class.java).equalTo("jobNo",deleteCurrent).findAll()
            isDeleted = query.deleteAllFromRealm()

            if (isDeleted)
            {
                realmDatabase!!.commitTransaction()
            }
            else{
                realmDatabase!!.cancelTransaction()
            }

        }
        catch (e:Exception)
        {
            realmDatabase!!.cancelTransaction()
        }

        return isDeleted
    }

    /*========================= Check ================================*/

    val check: Check?
        get() = realmDatabase!!.where(Check::class.java).findFirst()

    fun insertOrUpdateCheck(check: Check) {
        realmDatabase!!.executeTransaction { realm -> realm.insertOrUpdate(check) }
    }

    fun deleteCheck(): Boolean {
        val isDelete: Boolean
        realmDatabase!!.beginTransaction()

        val check = realmDatabase!!.where(Check::class.java).findAll()
        isDelete = check.deleteAllFromRealm()

        if (isDelete)
            realmDatabase!!.commitTransaction()
        else
            realmDatabase!!.cancelTransaction()

        return isDelete
    }


}
