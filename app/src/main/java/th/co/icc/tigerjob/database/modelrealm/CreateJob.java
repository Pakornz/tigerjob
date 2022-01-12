package th.co.icc.tigerjob.database.modelrealm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class CreateJob extends RealmObject {

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



    public CreateJob()
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


    @Override
    public String toString() {
        return "CreateJob{" +
                "jobNo='" + jobNo + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", currentDate='" + currentDate + '\'' +
                ", box='" + box + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", tel='" + tel + '\'' +
                ", contact='" + contact + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
