package th.co.icc.tigerjob.api.modelapi;

import java.util.List;

public class ListCustomer {

    /**
     * success : true
     * message : null
     * refcode : 200
     * total : 10
     * datas : [{"id":"TDL61147","name":"วิชากรณ์ ศรีสุทัสสิยากร","tel":"0870323331"},{"id":"TDL611470","name":"เพียรรัตน์ อภิชิตานนท์","tel":"0852537788"},{"id":"TDL611471","name":"ผศ. กิ่งกาญจน์ มูลเมือง","tel":"0896611430"},{"id":"TDL611472","name":"ดารณี วิทยาศัย","tel":"0865995095"},{"id":"TDL611473","name":"คุณขวัญดาว  ชัยชนะ","tel":"0814732194"},{"id":"TDL611474","name":"กรรณิการ์ สงคงคา","tel":"0862728212"},{"id":"TDL611475","name":"คุณอนงทิพย์ วงศ์จิระสวัสดิ์ ","tel":"0818436088"},{"id":"TDL611476","name":"วิมลรัตน์ เศารยะ","tel":"0813623636"},{"id":"TDL611477","name":"วีร์วรุตม์ จิรไกลศรี","tel":"089-1785589"},{"id":"TDL611478","name":"คุณอารี  ยาชูรมณ์","tel":"0854874164"}]
     */

    private boolean success;
    private Object message;
    private String refcode;
    private int total;
    private List<DatasBean> datas;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public String getRefcode() {
        return refcode;
    }

    public void setRefcode(String refcode) {
        this.refcode = refcode;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<DatasBean> getDatas() {
        return datas;
    }

    public void setDatas(List<DatasBean> datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * id : TDL61147
         * name : วิชากรณ์ ศรีสุทัสสิยากร
         * tel : 0870323331
         */

        private String id;
        private String name;
        private String tel;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }
    }
}
