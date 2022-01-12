package th.co.icc.tigerjob.config

/**
 * Created by User on 25/1/2560.
 */

interface App {
    companion object {

        const val SKYFROG_ICC_COMPANY_ID = "C160040"

        const val WEB_API_BASE_URL = "http://webapi.icc.co.th:7021/"
        const val WEB_API_AUTHEN = "authen/token"
        const val WEB_API_VERIFY = "authen/verify"

        const val USER_SKYFROG = "skyfrogtest"
        const val PASS_SKYFROG = "p@ssw0rd"

        const val WEB_API_BASE_URL_SKYFROG = "https://interface.skyfrog.net/POD/API/"
        const val WEB_API_PREFIX = "Sahapat/JobPreFix"
        const val WEB_API_CUSTOMER = "Sahapat/GetCustomerList"
        const val WEB_API_LISTCUSTOMER = "Sahapat/GetListCustomer"

        const val WEB_API_BASE_URL_TIGER = "https://webapi6.icc.co.th:7021/tms/"
        const val WEB_API_TIGER_CREATE_JOB = "job/createjob"
        const val WEB_API_TIGER_CREATE_CUSTOMER = "customer/createcustomer"
        const val WEB_API_TIGER_DELETE_JOB = "job/deletejob"
        const val WEB_API_TIGER_DELETE_CUSTOMER = "customer/deletecustomer"

        const val WEB_API_ZIPCODE = "http://webapi.icc.co.th:7002/hisher/hisherapp2/province/{zipid}"

        const val WEB_API_CREATE_CUSTOMER = "Customer/Create"
        const val WEB_API_CREATE_JOB = "CreateJobSimple"

        const val WEB_GET_API_BASE_URL = "https://webapi6.icc.co.th:7021/tms/"
        const val WEB_GET_API_CREATE_RUNNING = "running"
        const val WEB_GET_API_CHECK_USER = "user/getuser"
        const val WEB_GET_API_CHECK_USERRIGHT = "user/getuserrights"

        const val APP_NAME = "TIGER JOB"
        const val APP_SCREEN = "TDL_01"

        const val WEB_POST_API_GENTOKEN = "authen/gentoken"
        const val WEB_POST_API_CHECKTOKEN = "authen/checktoken"
        const val SECRET_KEY = "TDL123"
        const val EXPIRE_DAY_TOKEN = 30

    }
}
