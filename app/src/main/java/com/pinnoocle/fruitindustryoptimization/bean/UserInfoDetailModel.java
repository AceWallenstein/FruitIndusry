package com.pinnoocle.fruitindustryoptimization.bean;

import java.util.List;

public class UserInfoDetailModel {
    /**
     * code : 1
     * msg : success
     * data : {"userInfo":{"user_id":17139,"union_id":"","app_openid":"","pid":0,"nickName":"一\u20f0无\u20f0白\u20f0衣\u20f0","avatarUrl":"https://thirdwx.qlogo.cn/mmopen/vi_32/DYAIOgq83eowXq4W2OXOiar4ULicT7uBv0XBzLaG24ox9cFIiaG3jgj7bYFBia1ia56M945IVK5nVacnPwaVek5DicuQ/132","gender":"男","country":"中国","province":"安徽","city":"合肥","address_id":13398,"balance":"0.00","points":0,"pay_money":"0.00","expend_money":"0.00","grade_id":1,"is_new_user":1,"phone":"","fid":0,"mid":1,"role":null,"smile":0,"weixin":null,"job":null,"source_name":null,"source_text":null,"source_cardid":null,"lasttime":null,"group_tags":null,"company":null,"position":null,"source_type":1,"scene":null,"source_id":null,"phonemodel":null,"address":[{"address_id":13397,"name":"周星驰","phone":"13333333333","province_id":1,"city_id":2,"region_id":3,"district":"","detail":"哒哒哒哒哒哒多多","longitude":"","latitude":"","user_id":17139,"region":{"province":"北京市","city":"北京市","region":"东城区"}},{"address_id":13398,"name":"11","phone":"13433333333","province_id":1,"city_id":2,"region_id":3,"district":"","detail":"11","longitude":"","latitude":"","user_id":17139,"region":{"province":"北京市","city":"北京市","region":"东城区"}}],"username":null,"password":"","tree_prize":"0.00","register_prize":"0.00","address_default":{"address_id":13398,"name":"11","phone":"13433333333","province_id":1,"city_id":2,"region_id":3,"district":"","detail":"11","longitude":"","latitude":"","user_id":17139,"region":{"province":"北京市","city":"北京市","region":"东城区"}},"grade":{"grade_id":1,"name":"个人会员","weight":1,"upgrade":{"expend_money":"9999999999"},"equity":{"discount":"9"},"status":1,"is_delete":0,"wxapp_id":10001,"create_time":"2020-07-13 16:20:30","update_time":"2020-07-31 12:18:22"}}}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * userInfo : {"user_id":17139,"union_id":"","app_openid":"","pid":0,"nickName":"一\u20f0无\u20f0白\u20f0衣\u20f0","avatarUrl":"https://thirdwx.qlogo.cn/mmopen/vi_32/DYAIOgq83eowXq4W2OXOiar4ULicT7uBv0XBzLaG24ox9cFIiaG3jgj7bYFBia1ia56M945IVK5nVacnPwaVek5DicuQ/132","gender":"男","country":"中国","province":"安徽","city":"合肥","address_id":13398,"balance":"0.00","points":0,"pay_money":"0.00","expend_money":"0.00","grade_id":1,"is_new_user":1,"phone":"","fid":0,"mid":1,"role":null,"smile":0,"weixin":null,"job":null,"source_name":null,"source_text":null,"source_cardid":null,"lasttime":null,"group_tags":null,"company":null,"position":null,"source_type":1,"scene":null,"source_id":null,"phonemodel":null,"address":[{"address_id":13397,"name":"周星驰","phone":"13333333333","province_id":1,"city_id":2,"region_id":3,"district":"","detail":"哒哒哒哒哒哒多多","longitude":"","latitude":"","user_id":17139,"region":{"province":"北京市","city":"北京市","region":"东城区"}},{"address_id":13398,"name":"11","phone":"13433333333","province_id":1,"city_id":2,"region_id":3,"district":"","detail":"11","longitude":"","latitude":"","user_id":17139,"region":{"province":"北京市","city":"北京市","region":"东城区"}}],"username":null,"password":"","tree_prize":"0.00","register_prize":"0.00","address_default":{"address_id":13398,"name":"11","phone":"13433333333","province_id":1,"city_id":2,"region_id":3,"district":"","detail":"11","longitude":"","latitude":"","user_id":17139,"region":{"province":"北京市","city":"北京市","region":"东城区"}},"grade":{"grade_id":1,"name":"个人会员","weight":1,"upgrade":{"expend_money":"9999999999"},"equity":{"discount":"9"},"status":1,"is_delete":0,"wxapp_id":10001,"create_time":"2020-07-13 16:20:30","update_time":"2020-07-31 12:18:22"}}
         */

        private UserInfoBean userInfo;

        public UserInfoBean getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoBean userInfo) {
            this.userInfo = userInfo;
        }

        public static class UserInfoBean {
            /**
             * user_id : 17139
             * union_id :
             * app_openid :
             * pid : 0
             * nickName : 一⃰无⃰白⃰衣⃰
             * avatarUrl : https://thirdwx.qlogo.cn/mmopen/vi_32/DYAIOgq83eowXq4W2OXOiar4ULicT7uBv0XBzLaG24ox9cFIiaG3jgj7bYFBia1ia56M945IVK5nVacnPwaVek5DicuQ/132
             * gender : 男
             * country : 中国
             * province : 安徽
             * city : 合肥
             * address_id : 13398
             * balance : 0.00
             * points : 0
             * pay_money : 0.00
             * expend_money : 0.00
             * grade_id : 1
             * is_new_user : 1
             * phone :
             * fid : 0
             * mid : 1
             * role : null
             * smile : 0
             * weixin : null
             * job : null
             * source_name : null
             * source_text : null
             * source_cardid : null
             * lasttime : null
             * group_tags : null
             * company : null
             * position : null
             * source_type : 1
             * scene : null
             * source_id : null
             * phonemodel : null
             * address : [{"address_id":13397,"name":"周星驰","phone":"13333333333","province_id":1,"city_id":2,"region_id":3,"district":"","detail":"哒哒哒哒哒哒多多","longitude":"","latitude":"","user_id":17139,"region":{"province":"北京市","city":"北京市","region":"东城区"}},{"address_id":13398,"name":"11","phone":"13433333333","province_id":1,"city_id":2,"region_id":3,"district":"","detail":"11","longitude":"","latitude":"","user_id":17139,"region":{"province":"北京市","city":"北京市","region":"东城区"}}]
             * username : null
             * password :
             * tree_prize : 0.00
             * register_prize : 0.00
             * address_default : {"address_id":13398,"name":"11","phone":"13433333333","province_id":1,"city_id":2,"region_id":3,"district":"","detail":"11","longitude":"","latitude":"","user_id":17139,"region":{"province":"北京市","city":"北京市","region":"东城区"}}
             * grade : {"grade_id":1,"name":"个人会员","weight":1,"upgrade":{"expend_money":"9999999999"},"equity":{"discount":"9"},"status":1,"is_delete":0,"wxapp_id":10001,"create_time":"2020-07-13 16:20:30","update_time":"2020-07-31 12:18:22"}
             */

            private int user_id;
            private String union_id;
            private String app_openid;
            private int pid;
            private String nickName;
            private String avatarUrl;
            private String gender;
            private String country;
            private String province;
            private String city;
            private int address_id;
            private String balance;
            private int points;
            private String pay_money;
            private String expend_money;
            private int grade_id;
            private int is_new_user;
            private String phone;
            private int fid;
            private int mid;
            private Object role;
            private int smile;
            private Object weixin;
            private Object job;
            private Object source_name;
            private Object source_text;
            private Object source_cardid;
            private Object lasttime;
            private Object group_tags;
            private Object company;
            private Object position;
            private int source_type;
            private Object scene;
            private Object source_id;
            private Object phonemodel;
            private Object username;
            private String password;
            private String tree_prize;
            private String register_prize;
            private AddressDefaultBean address_default;
            private GradeBean grade;
            private List<AddressBean> address;

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public String getUnion_id() {
                return union_id;
            }

            public void setUnion_id(String union_id) {
                this.union_id = union_id;
            }

            public String getApp_openid() {
                return app_openid;
            }

            public void setApp_openid(String app_openid) {
                this.app_openid = app_openid;
            }

            public int getPid() {
                return pid;
            }

            public void setPid(int pid) {
                this.pid = pid;
            }

            public String getNickName() {
                return nickName;
            }

            public void setNickName(String nickName) {
                this.nickName = nickName;
            }

            public String getAvatarUrl() {
                return avatarUrl;
            }

            public void setAvatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public int getAddress_id() {
                return address_id;
            }

            public void setAddress_id(int address_id) {
                this.address_id = address_id;
            }

            public String getBalance() {
                return balance;
            }

            public void setBalance(String balance) {
                this.balance = balance;
            }

            public int getPoints() {
                return points;
            }

            public void setPoints(int points) {
                this.points = points;
            }

            public String getPay_money() {
                return pay_money;
            }

            public void setPay_money(String pay_money) {
                this.pay_money = pay_money;
            }

            public String getExpend_money() {
                return expend_money;
            }

            public void setExpend_money(String expend_money) {
                this.expend_money = expend_money;
            }

            public int getGrade_id() {
                return grade_id;
            }

            public void setGrade_id(int grade_id) {
                this.grade_id = grade_id;
            }

            public int getIs_new_user() {
                return is_new_user;
            }

            public void setIs_new_user(int is_new_user) {
                this.is_new_user = is_new_user;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public int getFid() {
                return fid;
            }

            public void setFid(int fid) {
                this.fid = fid;
            }

            public int getMid() {
                return mid;
            }

            public void setMid(int mid) {
                this.mid = mid;
            }

            public Object getRole() {
                return role;
            }

            public void setRole(Object role) {
                this.role = role;
            }

            public int getSmile() {
                return smile;
            }

            public void setSmile(int smile) {
                this.smile = smile;
            }

            public Object getWeixin() {
                return weixin;
            }

            public void setWeixin(Object weixin) {
                this.weixin = weixin;
            }

            public Object getJob() {
                return job;
            }

            public void setJob(Object job) {
                this.job = job;
            }

            public Object getSource_name() {
                return source_name;
            }

            public void setSource_name(Object source_name) {
                this.source_name = source_name;
            }

            public Object getSource_text() {
                return source_text;
            }

            public void setSource_text(Object source_text) {
                this.source_text = source_text;
            }

            public Object getSource_cardid() {
                return source_cardid;
            }

            public void setSource_cardid(Object source_cardid) {
                this.source_cardid = source_cardid;
            }

            public Object getLasttime() {
                return lasttime;
            }

            public void setLasttime(Object lasttime) {
                this.lasttime = lasttime;
            }

            public Object getGroup_tags() {
                return group_tags;
            }

            public void setGroup_tags(Object group_tags) {
                this.group_tags = group_tags;
            }

            public Object getCompany() {
                return company;
            }

            public void setCompany(Object company) {
                this.company = company;
            }

            public Object getPosition() {
                return position;
            }

            public void setPosition(Object position) {
                this.position = position;
            }

            public int getSource_type() {
                return source_type;
            }

            public void setSource_type(int source_type) {
                this.source_type = source_type;
            }

            public Object getScene() {
                return scene;
            }

            public void setScene(Object scene) {
                this.scene = scene;
            }

            public Object getSource_id() {
                return source_id;
            }

            public void setSource_id(Object source_id) {
                this.source_id = source_id;
            }

            public Object getPhonemodel() {
                return phonemodel;
            }

            public void setPhonemodel(Object phonemodel) {
                this.phonemodel = phonemodel;
            }

            public Object getUsername() {
                return username;
            }

            public void setUsername(Object username) {
                this.username = username;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getTree_prize() {
                return tree_prize;
            }

            public void setTree_prize(String tree_prize) {
                this.tree_prize = tree_prize;
            }

            public String getRegister_prize() {
                return register_prize;
            }

            public void setRegister_prize(String register_prize) {
                this.register_prize = register_prize;
            }

            public AddressDefaultBean getAddress_default() {
                return address_default;
            }

            public void setAddress_default(AddressDefaultBean address_default) {
                this.address_default = address_default;
            }

            public GradeBean getGrade() {
                return grade;
            }

            public void setGrade(GradeBean grade) {
                this.grade = grade;
            }

            public List<AddressBean> getAddress() {
                return address;
            }

            public void setAddress(List<AddressBean> address) {
                this.address = address;
            }

            public static class AddressDefaultBean {
                /**
                 * address_id : 13398
                 * name : 11
                 * phone : 13433333333
                 * province_id : 1
                 * city_id : 2
                 * region_id : 3
                 * district :
                 * detail : 11
                 * longitude :
                 * latitude :
                 * user_id : 17139
                 * region : {"province":"北京市","city":"北京市","region":"东城区"}
                 */

                private int address_id;
                private String name;
                private String phone;
                private int province_id;
                private int city_id;
                private int region_id;
                private String district;
                private String detail;
                private String longitude;
                private String latitude;
                private int user_id;
                private RegionBean region;

                public int getAddress_id() {
                    return address_id;
                }

                public void setAddress_id(int address_id) {
                    this.address_id = address_id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public int getProvince_id() {
                    return province_id;
                }

                public void setProvince_id(int province_id) {
                    this.province_id = province_id;
                }

                public int getCity_id() {
                    return city_id;
                }

                public void setCity_id(int city_id) {
                    this.city_id = city_id;
                }

                public int getRegion_id() {
                    return region_id;
                }

                public void setRegion_id(int region_id) {
                    this.region_id = region_id;
                }

                public String getDistrict() {
                    return district;
                }

                public void setDistrict(String district) {
                    this.district = district;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getLongitude() {
                    return longitude;
                }

                public void setLongitude(String longitude) {
                    this.longitude = longitude;
                }

                public String getLatitude() {
                    return latitude;
                }

                public void setLatitude(String latitude) {
                    this.latitude = latitude;
                }

                public int getUser_id() {
                    return user_id;
                }

                public void setUser_id(int user_id) {
                    this.user_id = user_id;
                }

                public RegionBean getRegion() {
                    return region;
                }

                public void setRegion(RegionBean region) {
                    this.region = region;
                }

                public static class RegionBean {
                    /**
                     * province : 北京市
                     * city : 北京市
                     * region : 东城区
                     */

                    private String province;
                    private String city;
                    private String region;

                    public String getProvince() {
                        return province;
                    }

                    public void setProvince(String province) {
                        this.province = province;
                    }

                    public String getCity() {
                        return city;
                    }

                    public void setCity(String city) {
                        this.city = city;
                    }

                    public String getRegion() {
                        return region;
                    }

                    public void setRegion(String region) {
                        this.region = region;
                    }
                }
            }

            public static class GradeBean {
                /**
                 * grade_id : 1
                 * name : 个人会员
                 * weight : 1
                 * upgrade : {"expend_money":"9999999999"}
                 * equity : {"discount":"9"}
                 * status : 1
                 * is_delete : 0
                 * wxapp_id : 10001
                 * create_time : 2020-07-13 16:20:30
                 * update_time : 2020-07-31 12:18:22
                 */

                private int grade_id;
                private String name;
                private int weight;
                private UpgradeBean upgrade;
                private EquityBean equity;
                private int status;
                private int is_delete;
                private int wxapp_id;
                private String create_time;
                private String update_time;

                public int getGrade_id() {
                    return grade_id;
                }

                public void setGrade_id(int grade_id) {
                    this.grade_id = grade_id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getWeight() {
                    return weight;
                }

                public void setWeight(int weight) {
                    this.weight = weight;
                }

                public UpgradeBean getUpgrade() {
                    return upgrade;
                }

                public void setUpgrade(UpgradeBean upgrade) {
                    this.upgrade = upgrade;
                }

                public EquityBean getEquity() {
                    return equity;
                }

                public void setEquity(EquityBean equity) {
                    this.equity = equity;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public int getIs_delete() {
                    return is_delete;
                }

                public void setIs_delete(int is_delete) {
                    this.is_delete = is_delete;
                }

                public int getWxapp_id() {
                    return wxapp_id;
                }

                public void setWxapp_id(int wxapp_id) {
                    this.wxapp_id = wxapp_id;
                }

                public String getCreate_time() {
                    return create_time;
                }

                public void setCreate_time(String create_time) {
                    this.create_time = create_time;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public static class UpgradeBean {
                    /**
                     * expend_money : 9999999999
                     */

                    private String expend_money;

                    public String getExpend_money() {
                        return expend_money;
                    }

                    public void setExpend_money(String expend_money) {
                        this.expend_money = expend_money;
                    }
                }

                public static class EquityBean {
                    /**
                     * discount : 9
                     */

                    private String discount;

                    public String getDiscount() {
                        return discount;
                    }

                    public void setDiscount(String discount) {
                        this.discount = discount;
                    }
                }
            }

            public static class AddressBean {
                /**
                 * address_id : 13397
                 * name : 周星驰
                 * phone : 13333333333
                 * province_id : 1
                 * city_id : 2
                 * region_id : 3
                 * district :
                 * detail : 哒哒哒哒哒哒多多
                 * longitude :
                 * latitude :
                 * user_id : 17139
                 * region : {"province":"北京市","city":"北京市","region":"东城区"}
                 */

                private int address_id;
                private String name;
                private String phone;
                private int province_id;
                private int city_id;
                private int region_id;
                private String district;
                private String detail;
                private String longitude;
                private String latitude;
                private int user_id;
                private RegionBeanX region;

                public int getAddress_id() {
                    return address_id;
                }

                public void setAddress_id(int address_id) {
                    this.address_id = address_id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public int getProvince_id() {
                    return province_id;
                }

                public void setProvince_id(int province_id) {
                    this.province_id = province_id;
                }

                public int getCity_id() {
                    return city_id;
                }

                public void setCity_id(int city_id) {
                    this.city_id = city_id;
                }

                public int getRegion_id() {
                    return region_id;
                }

                public void setRegion_id(int region_id) {
                    this.region_id = region_id;
                }

                public String getDistrict() {
                    return district;
                }

                public void setDistrict(String district) {
                    this.district = district;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getLongitude() {
                    return longitude;
                }

                public void setLongitude(String longitude) {
                    this.longitude = longitude;
                }

                public String getLatitude() {
                    return latitude;
                }

                public void setLatitude(String latitude) {
                    this.latitude = latitude;
                }

                public int getUser_id() {
                    return user_id;
                }

                public void setUser_id(int user_id) {
                    this.user_id = user_id;
                }

                public RegionBeanX getRegion() {
                    return region;
                }

                public void setRegion(RegionBeanX region) {
                    this.region = region;
                }

                public static class RegionBeanX {
                    /**
                     * province : 北京市
                     * city : 北京市
                     * region : 东城区
                     */

                    private String province;
                    private String city;
                    private String region;

                    public String getProvince() {
                        return province;
                    }

                    public void setProvince(String province) {
                        this.province = province;
                    }

                    public String getCity() {
                        return city;
                    }

                    public void setCity(String city) {
                        this.city = city;
                    }

                    public String getRegion() {
                        return region;
                    }

                    public void setRegion(String region) {
                        this.region = region;
                    }
                }
            }
        }
    }
}
