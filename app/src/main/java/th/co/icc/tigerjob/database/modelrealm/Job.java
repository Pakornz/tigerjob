package th.co.icc.tigerjob.database.modelrealm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Job extends RealmObject {

    public interface Key
    {
        String jobNo = "jobNo";
        String customerCode = "customerCode";
        String currentDate = "currentDate";
        String box = "box";
        String zipcode = "zipcode";
        String tel = "tel";
        String contact = "contact";
        String remark = "remark";
        String date = "date";
        String currenttime = "currenttime";

    }

    @PrimaryKey
    private String jobNo ;

    private String customerCode;
    private String currentDate;
    private String box ;
    private String zipcode ;
    private String tel ;
    private String contact ;
    private String remark ;
    private String date ;
    private String currenttime ;



    public Job()
    {

    }

    public String getJobNo() {
        return jobNo;
    }

    public void setJobNo(String jobNo) {
        this.jobNo = jobNo;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCurrenttime() {
        return currenttime;
    }

    public void setCurrenttime(String currenttime) {
        this.currenttime = currenttime;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobNo='" + jobNo + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", currentDate='" + currentDate + '\'' +
                ", box='" + box + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", tel='" + tel + '\'' +
                ", contact='" + contact + '\'' +
                ", remark='" + remark + '\'' +
                ", date='" + date + '\'' +
                ", currenttime='" + currenttime + '\'' +
                '}';
    }
}
