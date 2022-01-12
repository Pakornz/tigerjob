package th.co.icc.tigerjob.database.modelrealm;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.annotations.PrimaryKey;

import java.util.Date;


public class User extends RealmObject
{
    public interface Key
    {
        String EMP_ID = "empId";
        String NAME = "name";
        String DEPT_ID = "dept_id";
        String AUTH_USER_NAME = "authUserName";
        String AUTH_PASSWORD = "authPassword";
        String AUTH_DATE = "authDate";
        String AUTH_TOKEN = "authToken";
        String PRE_FIX = "pre_fix";
        String EXPIRE_DATE = "expire_date";

    }


    private String empId ;

    private String name;
    private String dept_id;

    @PrimaryKey
    private String authToken;

    @Ignore
    private String authUserName ;

    @Ignore
    private String authPassword;

    @Ignore
    private String pre_fix;

    private Date authDate ;

    private String expiredate;

    /*------------------- Constructor --------------------*/

    public User()
    {

    }

    /*------------------- Getter --------------------*/

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getAuthUserName() {
        return authUserName;
    }

    public void setAuthUserName(String authUserName) {
        this.authUserName = authUserName;
    }

    public String getAuthPassword() {
        return authPassword;
    }

    public void setAuthPassword(String authPassword) {
        this.authPassword = authPassword;
    }

    public Date getAuthDate() {
        return authDate;
    }

    public void setAuthDate(Date authDate) {
        this.authDate = authDate;
    }

    public String getPre_fix() {
        return pre_fix;
    }

    public void setPre_fix(String pre_fix) {
        this.pre_fix = pre_fix;
    }

    public String getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(String expiredate) {
        this.expiredate = expiredate;
    }

    @Override
    public String toString() {
        return "User{" +
                "empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", dept_id='" + dept_id + '\'' +
                ", authToken='" + authToken + '\'' +
                ", authUserName='" + authUserName + '\'' +
                ", authPassword='" + authPassword + '\'' +
                ", pre_fix='" + pre_fix + '\'' +
                ", authDate=" + authDate +
                ", expiredate='" + expiredate + '\'' +
                '}';
    }
}
