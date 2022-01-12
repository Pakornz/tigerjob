package th.co.icc.tigerjob.api.modelapi;

import java.util.List;

public class ListZipCode {
    /**
     * result : true
     * status : 200
     * data : {"post_code":"10120","province_id":"10","province_name":"กรุงเทพมหานคร","districts":[{"district_id":"1012","district_name":"ยานนาวา","subdistricts":[{"id":101203,"name":"ช่องนนทรี","latitude":13.751,"longitude":100.492},{"id":101204,"name":"บางโพงพาง","latitude":13.751,"longitude":100.492}]},{"district_id":"1028","district_name":"สาทร","subdistricts":[{"id":101208,"name":"ทุ่งมหาเมฆ","latitude":13.751,"longitude":100.492},{"id":101201,"name":"ทุ่งวัดดอน","latitude":13.751,"longitude":100.492},{"id":101202,"name":"ยานนาวา","latitude":13.751,"longitude":100.492}]},{"district_id":"1031","district_name":"บางคอแหลม","subdistricts":[{"id":101207,"name":"บางคอแหลม","latitude":13.751,"longitude":100.492},{"id":101206,"name":"บางโคล่","latitude":13.751,"longitude":100.492},{"id":101205,"name":"วัดพระยาไกร","latitude":13.751,"longitude":100.492}]}]}
     */

    private boolean result;
    private int status;
    private DataBean data;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * post_code : 10120
         * province_id : 10
         * province_name : กรุงเทพมหานคร
         * districts : [{"district_id":"1012","district_name":"ยานนาวา","subdistricts":[{"id":101203,"name":"ช่องนนทรี","latitude":13.751,"longitude":100.492},{"id":101204,"name":"บางโพงพาง","latitude":13.751,"longitude":100.492}]},{"district_id":"1028","district_name":"สาทร","subdistricts":[{"id":101208,"name":"ทุ่งมหาเมฆ","latitude":13.751,"longitude":100.492},{"id":101201,"name":"ทุ่งวัดดอน","latitude":13.751,"longitude":100.492},{"id":101202,"name":"ยานนาวา","latitude":13.751,"longitude":100.492}]},{"district_id":"1031","district_name":"บางคอแหลม","subdistricts":[{"id":101207,"name":"บางคอแหลม","latitude":13.751,"longitude":100.492},{"id":101206,"name":"บางโคล่","latitude":13.751,"longitude":100.492},{"id":101205,"name":"วัดพระยาไกร","latitude":13.751,"longitude":100.492}]}]
         */

        private String post_code;
        private String province_id;
        private String province_name;
        private List<DistrictsBean> districts;

        public String getPost_code() {
            return post_code;
        }

        public void setPost_code(String post_code) {
            this.post_code = post_code;
        }

        public String getProvince_id() {
            return province_id;
        }

        public void setProvince_id(String province_id) {
            this.province_id = province_id;
        }

        public String getProvince_name() {
            return province_name;
        }

        public void setProvince_name(String province_name) {
            this.province_name = province_name;
        }

        public List<DistrictsBean> getDistricts() {
            return districts;
        }

        public void setDistricts(List<DistrictsBean> districts) {
            this.districts = districts;
        }

        public static class DistrictsBean {
            /**
             * district_id : 1012
             * district_name : ยานนาวา
             * subdistricts : [{"id":101203,"name":"ช่องนนทรี","latitude":13.751,"longitude":100.492},{"id":101204,"name":"บางโพงพาง","latitude":13.751,"longitude":100.492}]
             */

            private String district_id;
            private String district_name;
            private List<SubdistrictsBean> subdistricts;

            public String getDistrict_id() {
                return district_id;
            }

            public void setDistrict_id(String district_id) {
                this.district_id = district_id;
            }

            public String getDistrict_name() {
                return district_name;
            }

            public void setDistrict_name(String district_name) {
                this.district_name = district_name;
            }

            public List<SubdistrictsBean> getSubdistricts() {
                return subdistricts;
            }

            public void setSubdistricts(List<SubdistrictsBean> subdistricts) {
                this.subdistricts = subdistricts;
            }

            public static class SubdistrictsBean {
                /**
                 * id : 101203
                 * name : ช่องนนทรี
                 * latitude : 13.751
                 * longitude : 100.492
                 */

                private String id;
                private String name;
                private double latitude;
                private double longitude;


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

                public double getLatitude() {
                    return latitude;
                }

                public void setLatitude(double latitude) {
                    this.latitude = latitude;
                }

                public double getLongitude() {
                    return longitude;
                }

                public void setLongitude(double longitude) {
                    this.longitude = longitude;
                }
            }
        }
    }
}
