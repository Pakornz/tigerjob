package th.co.icc.tigerjob.database.modelrealm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Check extends RealmObject {

    public interface Key
    {
        String SETTING_KEY = "names";
        String SETTING_VALUE = "isChecked";
    }


    @PrimaryKey
    private String names;
    private boolean isChecked;


    public Check() {

    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }




    @Override
    public String toString() {
        return "Check{" +
                "names='" + names + '\'' +
                ", isChecked=" + isChecked +
                '}';
    }
}
