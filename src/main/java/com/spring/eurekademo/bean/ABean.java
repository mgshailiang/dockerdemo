package com.spring.eurekademo.bean;

import java.util.List;

public class ABean {

    /**
     * name : 王尼玛
     * fans : [{"name":"小王","age":"7"},{"name":"小尼玛","age":"10"}]
     */

    private String name;
    private List<FansBean> fans;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FansBean> getFans() {
        return fans;
    }

    public void setFans(List<FansBean> fans) {
        this.fans = fans;
    }

    public static class FansBean {
        /**
         * name : 小王
         * age : 7
         */

        private String name;
        private String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }
}
