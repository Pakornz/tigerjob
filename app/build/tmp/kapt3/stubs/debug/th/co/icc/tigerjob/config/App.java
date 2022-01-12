package th.co.icc.tigerjob.config;

import java.lang.System;

/**
 * * Created by User on 25/1/2560.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lth/co/icc/tigerjob/config/App;", "", "Companion", "app_debug"})
public abstract interface App {
    public static final th.co.icc.tigerjob.config.App.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SKYFROG_ICC_COMPANY_ID = "C160040";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_API_BASE_URL = "http://webapi.icc.co.th:7021/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_API_AUTHEN = "authen/token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_API_VERIFY = "authen/verify";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_SKYFROG = "skyfrogtest";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PASS_SKYFROG = "p@ssw0rd";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_API_BASE_URL_SKYFROG = "https://interface.skyfrog.net/POD/API/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_API_PREFIX = "Sahapat/JobPreFix";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_API_CUSTOMER = "Sahapat/GetCustomerList";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_API_LISTCUSTOMER = "Sahapat/GetListCustomer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_API_BASE_URL_TIGER = "https://webapi6.icc.co.th:7021/tms/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_API_TIGER_CREATE_JOB = "job/createjob";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_API_TIGER_CREATE_CUSTOMER = "customer/createcustomer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_API_TIGER_DELETE_JOB = "job/deletejob";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_API_TIGER_DELETE_CUSTOMER = "customer/deletecustomer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_API_ZIPCODE = "http://webapi.icc.co.th:7002/hisher/hisherapp2/province/{zipid}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_API_CREATE_CUSTOMER = "Customer/Create";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_API_CREATE_JOB = "CreateJobSimple";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_GET_API_BASE_URL = "https://webapi6.icc.co.th:7021/tms/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_GET_API_CREATE_RUNNING = "running";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_GET_API_CHECK_USER = "user/getuser";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_GET_API_CHECK_USERRIGHT = "user/getuserrights";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_NAME = "TIGER JOB";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_SCREEN = "TDL_01";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_POST_API_GENTOKEN = "authen/gentoken";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_POST_API_CHECKTOKEN = "authen/checktoken";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SECRET_KEY = "TDL123";
    public static final int EXPIRE_DAY_TOKEN = 30;
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lth/co/icc/tigerjob/config/App$Companion;", "", "()V", "APP_NAME", "", "APP_SCREEN", "EXPIRE_DAY_TOKEN", "", "PASS_SKYFROG", "SECRET_KEY", "SKYFROG_ICC_COMPANY_ID", "USER_SKYFROG", "WEB_API_AUTHEN", "WEB_API_BASE_URL", "WEB_API_BASE_URL_SKYFROG", "WEB_API_BASE_URL_TIGER", "WEB_API_CREATE_CUSTOMER", "WEB_API_CREATE_JOB", "WEB_API_CUSTOMER", "WEB_API_LISTCUSTOMER", "WEB_API_PREFIX", "WEB_API_TIGER_CREATE_CUSTOMER", "WEB_API_TIGER_CREATE_JOB", "WEB_API_TIGER_DELETE_CUSTOMER", "WEB_API_TIGER_DELETE_JOB", "WEB_API_VERIFY", "WEB_API_ZIPCODE", "WEB_GET_API_BASE_URL", "WEB_GET_API_CHECK_USER", "WEB_GET_API_CHECK_USERRIGHT", "WEB_GET_API_CREATE_RUNNING", "WEB_POST_API_CHECKTOKEN", "WEB_POST_API_GENTOKEN", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SKYFROG_ICC_COMPANY_ID = "C160040";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_API_BASE_URL = "http://webapi.icc.co.th:7021/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_API_AUTHEN = "authen/token";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_API_VERIFY = "authen/verify";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_SKYFROG = "skyfrogtest";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PASS_SKYFROG = "p@ssw0rd";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_API_BASE_URL_SKYFROG = "https://interface.skyfrog.net/POD/API/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_API_PREFIX = "Sahapat/JobPreFix";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_API_CUSTOMER = "Sahapat/GetCustomerList";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_API_LISTCUSTOMER = "Sahapat/GetListCustomer";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_API_BASE_URL_TIGER = "https://webapi6.icc.co.th:7021/tms/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_API_TIGER_CREATE_JOB = "job/createjob";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_API_TIGER_CREATE_CUSTOMER = "customer/createcustomer";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_API_TIGER_DELETE_JOB = "job/deletejob";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_API_TIGER_DELETE_CUSTOMER = "customer/deletecustomer";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_API_ZIPCODE = "http://webapi.icc.co.th:7002/hisher/hisherapp2/province/{zipid}";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_API_CREATE_CUSTOMER = "Customer/Create";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_API_CREATE_JOB = "CreateJobSimple";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_GET_API_BASE_URL = "https://webapi6.icc.co.th:7021/tms/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_GET_API_CREATE_RUNNING = "running";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_GET_API_CHECK_USER = "user/getuser";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_GET_API_CHECK_USERRIGHT = "user/getuserrights";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String APP_NAME = "TIGER JOB";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String APP_SCREEN = "TDL_01";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_POST_API_GENTOKEN = "authen/gentoken";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_POST_API_CHECKTOKEN = "authen/checktoken";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SECRET_KEY = "TDL123";
        public static final int EXPIRE_DAY_TOKEN = 30;
        
        private Companion() {
            super();
        }
    }
}