package com.example.charleswayne.weather;

/**
 * Created by charleswayne on 7/1/18.
 */

    public class City {
        private String province;            //省
        private String city;                //市
        private String number;              //城市号（方便模拟器检索）
        private String firstPY;             //大写首字母
        private String allPY;               //拼音拼写
        private String allFirstPY;          //首字母全拼
        //构造方法：赋予初始值
        public City(String province,String city,String number,String firstPY,String allPY,String allFirstPY)
        {
            this.province = province;
            this.city = city;
            this.number = number;
            this.firstPY = firstPY;
            this.allPY = allPY;
            this.allFirstPY = allFirstPY;
        }
        //一系列get和set方法
        public String getAllFirstPY() {
            return allFirstPY;
        }

        public void setAllFirstPY(String allFirstPY) {
            this.allFirstPY = allFirstPY;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getFirstPY() {
            return firstPY;
        }

        public void setFirstPY(String firstPY) {
            this.firstPY = firstPY;
        }

        public String getAllPY() {
            return allPY;
        }

        public void setAllPY(String allPY) {
            this.allPY = allPY;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }
    }

