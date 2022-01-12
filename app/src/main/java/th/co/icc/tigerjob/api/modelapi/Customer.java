package th.co.icc.tigerjob.api.modelapi;

public class Customer {

    /**
     * success : true
     * message : null
     * refcode : 200
     * total : 1
     * datas : {"CustomerCode":"TDL61147","CustomerName":"วิชากรณ์ ศรีสุทัสสิยากร","Address":"519 ซอยเพชรเกษม 63 แยก 1แขวงหลักสอง เขตบางแค","CustomerType":"D","Tel":"0870323331","Fax":"","Email":"","Latitude":13.703969,"Longitude":100.389555,"RadiusError":100,"ListZipCode":"10160","District":""}
     */

    private boolean success;
    private Object message;
    private String refcode;
    private int total;
    private DatasBean datas;

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

    public DatasBean getDatas() {
        return datas;
    }

    public void setDatas(DatasBean datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * CustomerCode : TDL61147
         * CustomerName : วิชากรณ์ ศรีสุทัสสิยากร
         * Address : 519 ซอยเพชรเกษม 63 แยก 1แขวงหลักสอง เขตบางแค
         * CustomerType : D
         * Tel : 0870323331
         * Fax :
         * Email :
         * Latitude : 13.703969
         * Longitude : 100.389555
         * RadiusError : 100
         * ListZipCode : 10160
         * District :
         */

        private String CustomerCode;
        private String CustomerName;
        private String Address;
        private String CustomerType;
        private String Tel;
        private String Fax;
        private String Email;
        private double Latitude;
        private double Longitude;
        private int RadiusError;
        private String ZipCode;
        private String District;

        public String getCustomerCode() {
            return CustomerCode;
        }

        public void setCustomerCode(String CustomerCode) {
            this.CustomerCode = CustomerCode;
        }

        public String getCustomerName() {
            return CustomerName;
        }

        public void setCustomerName(String CustomerName) {
            this.CustomerName = CustomerName;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String Address) {
            this.Address = Address;
        }

        public String getCustomerType() {
            return CustomerType;
        }

        public void setCustomerType(String CustomerType) {
            this.CustomerType = CustomerType;
        }

        public String getTel() {
            return Tel;
        }

        public void setTel(String Tel) {
            this.Tel = Tel;
        }

        public String getFax() {
            return Fax;
        }

        public void setFax(String Fax) {
            this.Fax = Fax;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String Email) {
            this.Email = Email;
        }

        public double getLatitude() {
            return Latitude;
        }

        public void setLatitude(double Latitude) {
            this.Latitude = Latitude;
        }

        public double getLongitude() {
            return Longitude;
        }

        public void setLongitude(double Longitude) {
            this.Longitude = Longitude;
        }

        public int getRadiusError() {
            return RadiusError;
        }

        public void setRadiusError(int RadiusError) {
            this.RadiusError = RadiusError;
        }

        public String getZipCode() {
            return ZipCode;
        }

        public void setZipCode(String ZipCode) {
            this.ZipCode = ZipCode;
        }

        public String getDistrict() {
            return District;
        }

        public void setDistrict(String District) {
            this.District = District;
        }
    }
}
