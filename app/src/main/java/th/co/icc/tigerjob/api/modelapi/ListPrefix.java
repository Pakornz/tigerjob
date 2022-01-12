package th.co.icc.tigerjob.api.modelapi;

import java.util.List;

public class ListPrefix {

    /**
     * success : true
     * message : null
     * refcode : 200
     * total : 8
     * datas : [{"docid":2,"type":"job","docname":"Default","prefix":"J","startrun":"00000000","currentrun":"05","customtext":null,"isdefault":true,"ishidden":false,"isactive":true,"docformat":"J00000000"},{"docid":36,"type":"job","docname":"Sahapat Jobno","prefix":"SAHA","startrun":"00000","currentrun":"000001","customtext":null,"isdefault":false,"ishidden":false,"isactive":true,"docformat":null},{"docid":41,"type":"job","docname":"PowerMall","prefix":"PMAL","startrun":"0000","currentrun":"000001","customtext":null,"isdefault":false,"ishidden":false,"isactive":true,"docformat":"PMAL-YYYY-MM-DD-0000"},{"docid":42,"type":"job","docname":"Baby Best Buy","prefix":"BABY","startrun":"0000","currentrun":"000002","customtext":null,"isdefault":false,"ishidden":false,"isactive":true,"docformat":"BABY-YYYY-MM-DD-0000"},{"docid":43,"type":"job","docname":"บ้านและสวน","prefix":"HG","startrun":"0000","currentrun":"000001","customtext":null,"isdefault":false,"ishidden":false,"isactive":true,"docformat":"HG-YYYY-MM-DD-0000"},{"docid":44,"type":"job","docname":"ไฟฟ้าชัยมงคล","prefix":"CMK","startrun":"0000","currentrun":"000006","customtext":null,"isdefault":false,"ishidden":false,"isactive":true,"docformat":"CMK0000"},{"docid":45,"type":"job","docname":"SAHA22","prefix":"SH22","startrun":"0000","currentrun":"000002","customtext":null,"isdefault":false,"ishidden":false,"isactive":true,"docformat":"SH220000"},{"docid":49,"type":"job","docname":"Wacoal","prefix":"BGW","startrun":"0000","currentrun":"000001","customtext":null,"isdefault":false,"ishidden":false,"isactive":true,"docformat":"BGW0000"}]
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
         * docid : 2
         * type : job
         * docname : Default
         * prefix : J
         * startrun : 00000000
         * currentrun : 05
         * customtext : null
         * isdefault : true
         * ishidden : false
         * isactive : true
         * docformat : J00000000
         */

        private int docid;
        private String type;
        private String docname;
        private String prefix;
        private String startrun;
        private String currentrun;
        private Object customtext;
        private boolean isdefault;
        private boolean ishidden;
        private boolean isactive;
        private String docformat;

        public int getDocid() {
            return docid;
        }

        public void setDocid(int docid) {
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

        public Object getCustomtext() {
            return customtext;
        }

        public void setCustomtext(Object customtext) {
            this.customtext = customtext;
        }

        public boolean isIsdefault() {
            return isdefault;
        }

        public void setIsdefault(boolean isdefault) {
            this.isdefault = isdefault;
        }

        public boolean isIshidden() {
            return ishidden;
        }

        public void setIshidden(boolean ishidden) {
            this.ishidden = ishidden;
        }

        public boolean isIsactive() {
            return isactive;
        }

        public void setIsactive(boolean isactive) {
            this.isactive = isactive;
        }

        public String getDocformat() {
            return docformat;
        }

        public void setDocformat(String docformat) {
            this.docformat = docformat;
        }
    }
}
