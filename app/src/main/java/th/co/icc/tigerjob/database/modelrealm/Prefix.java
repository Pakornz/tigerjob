package th.co.icc.tigerjob.database.modelrealm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Prefix extends RealmObject {

    public interface Key
    {
        String docid = "docid";
        String type = "type";
        String docname = "docname";
        String prefix = "prefix";
        String startrun = "startrun";
        String currentrun = "currentrun";
        String customtext = "customtext";
        String isdefault = "isdefault";
        String ishidden = "ishidden";
        String isactive = "isactive";
        String docformat = "docformat";

    }

    @PrimaryKey
    private String docid ;
    private String type;
    private String docname;
    private String prefix ;
    private String startrun;
    private String currentrun;
    private String customtext;
    private Boolean isdefault;
    private Boolean ishidden;
    private Boolean isactive;
    private String docformat;

    /*------------------- Constructor --------------------*/

    public Prefix()
    {

    }

    /*------------------- Getter --------------------*/

    public String getDocid() {
        return docid;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getStartrun() {
        return startrun;
    }

    public void setStartrun(String startrun) {
        this.startrun = startrun;
    }

    public String getCurrentrun() {
        return currentrun;
    }

    public void setCurrentrun(String currentrun) {
        this.currentrun = currentrun;
    }

    public String getCustomtext() {
        return customtext;
    }

    public void setCustomtext(String customtext) {
        this.customtext = customtext;
    }

    public Boolean getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
    }

    public Boolean getIshidden() {
        return ishidden;
    }

    public void setIshidden(Boolean ishidden) {
        this.ishidden = ishidden;
    }

    public Boolean getIsactive() {
        return isactive;
    }

    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
    }

    public String getDocformat() {
        return docformat;
    }

    public void setDocformat(String docformat) {
        this.docformat = docformat;
    }

    @Override
    public String toString() {
        return "Prefix{" +
                "docid='" + docid + '\'' +
                ", type='" + type + '\'' +
                ", docname='" + docname + '\'' +
                ", prefix='" + prefix + '\'' +
                ", startrun='" + startrun + '\'' +
                ", currentrun='" + currentrun + '\'' +
                ", customtext='" + customtext + '\'' +
                ", isdefault=" + isdefault +
                ", ishidden=" + ishidden +
                ", isactive=" + isactive +
                ", docformat='" + docformat + '\'' +
                '}';
    }
}
