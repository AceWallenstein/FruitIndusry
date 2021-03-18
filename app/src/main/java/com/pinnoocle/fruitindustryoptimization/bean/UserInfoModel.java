package com.pinnoocle.fruitindustryoptimization.bean;

import java.util.List;

public class UserInfoModel {
    /**
     * code : 1
     * msg : success
     * data : {"rm":0,"tm":0,"dealer":{"user_id":17137,"real_name":"一\u20f0无\u20f0白\u20f0衣\u20f0","mobile":"","money":"0.00","freeze_money":"0.00","total_money":"0.00","referee_id":0,"first_num":0,"second_num":0,"third_num":0,"is_delete":0,"wxapp_id":10001,"user":{"user_id":17137,"union_id":"","open_id":"ocVLJ5TCbaI0iJl272V28VWa2Pkc","app_openid":"","pid":16820,"nickName":"一\u20f0无\u20f0白\u20f0衣\u20f0","avatarUrl":"https://thirdwx.qlogo.cn/mmopen/vi_32/DYAIOgq83eowXq4W2OXOiar4ULicT7uBv0XBzLaG24ox9cFIiaG3jgj7bYFBia1ia56M945IVK5nVacnPwaVek5DicuQ/132","gender":"男","country":"中国","province":"安徽","city":"合肥","address_id":0,"balance":"0.00","points":0,"pay_money":"0.00","expend_money":"0.00","grade_id":0,"is_new_user":1,"is_delete":0,"wxapp_id":10001,"create_time":"2021-02-26 13:51:09","update_time":"2021-02-26 17:36:47","phone":"13956934659","fid":0,"mid":1,"role":null,"smile":0,"weixin":null,"job":null,"source_name":null,"source_text":null,"source_cardid":null,"lasttime":null,"group_tags":null,"company":null,"position":null,"source_type":1,"scene":null,"source_id":null,"phonemodel":null,"address":null,"username":null,"password":"","tree_prize":"0.00","register_prize":"0.00"},"referee":null},"cn":0,"userInfo":{"user_id":17137,"union_id":"","app_openid":"","pid":16820,"nickName":"一\u20f0无\u20f0白\u20f0衣\u20f0","avatarUrl":"https://thirdwx.qlogo.cn/mmopen/vi_32/DYAIOgq83eowXq4W2OXOiar4ULicT7uBv0XBzLaG24ox9cFIiaG3jgj7bYFBia1ia56M945IVK5nVacnPwaVek5DicuQ/132","gender":"男","country":"中国","province":"安徽","city":"合肥","address_id":0,"balance":"0.00","points":0,"pay_money":"0.00","expend_money":"0.00","grade_id":0,"is_new_user":1,"phone":"13956934659","fid":0,"mid":1,"role":null,"smile":0,"weixin":null,"job":null,"source_name":null,"source_text":null,"source_cardid":null,"lasttime":null,"group_tags":null,"company":null,"position":null,"source_type":1,"scene":null,"source_id":null,"phonemodel":null,"address":[],"username":null,"password":"","tree_prize":"0.00","register_prize":"0.00","address_default":null,"grade":null},"orderCount":{"payment":0,"delivery":0,"received":0,"comment":0},"setting":{"points_name":"积分"},"couponCount":0,"userBgColor":"#ffdd00","menus":{"address":{"name":"收货地址","url":"pages/address/index","icon":"map"},"coupon":{"name":"领券中心","url":"pages/coupon/coupon","icon":"lingquan"},"my_coupon":{"name":"我的优惠券","url":"pages/user/coupon/coupon","icon":"youhuiquan"},"sharing_order":{"name":"拼团订单","url":"pages/sharing/order/index","icon":"pintuan"},"my_bargain":{"name":"我的秒助","url":"pages/bargain/index/index?tab=1","icon":"kanjia"},"points_mall":{"name":"积分商城","url":"pages/exchange/list","icon":"jifen"},"help":{"name":"我的帮助","url":"pages/user/help/index","icon":"help"}}}
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
         * rm : 0
         * tm : 0
         * dealer : {"user_id":17137,"real_name":"一\u20f0无\u20f0白\u20f0衣\u20f0","mobile":"","money":"0.00","freeze_money":"0.00","total_money":"0.00","referee_id":0,"first_num":0,"second_num":0,"third_num":0,"is_delete":0,"wxapp_id":10001,"user":{"user_id":17137,"union_id":"","open_id":"ocVLJ5TCbaI0iJl272V28VWa2Pkc","app_openid":"","pid":16820,"nickName":"一\u20f0无\u20f0白\u20f0衣\u20f0","avatarUrl":"https://thirdwx.qlogo.cn/mmopen/vi_32/DYAIOgq83eowXq4W2OXOiar4ULicT7uBv0XBzLaG24ox9cFIiaG3jgj7bYFBia1ia56M945IVK5nVacnPwaVek5DicuQ/132","gender":"男","country":"中国","province":"安徽","city":"合肥","address_id":0,"balance":"0.00","points":0,"pay_money":"0.00","expend_money":"0.00","grade_id":0,"is_new_user":1,"is_delete":0,"wxapp_id":10001,"create_time":"2021-02-26 13:51:09","update_time":"2021-02-26 17:36:47","phone":"13956934659","fid":0,"mid":1,"role":null,"smile":0,"weixin":null,"job":null,"source_name":null,"source_text":null,"source_cardid":null,"lasttime":null,"group_tags":null,"company":null,"position":null,"source_type":1,"scene":null,"source_id":null,"phonemodel":null,"address":null,"username":null,"password":"","tree_prize":"0.00","register_prize":"0.00"},"referee":null}
         * cn : 0
         * userInfo : {"user_id":17137,"union_id":"","app_openid":"","pid":16820,"nickName":"一\u20f0无\u20f0白\u20f0衣\u20f0","avatarUrl":"https://thirdwx.qlogo.cn/mmopen/vi_32/DYAIOgq83eowXq4W2OXOiar4ULicT7uBv0XBzLaG24ox9cFIiaG3jgj7bYFBia1ia56M945IVK5nVacnPwaVek5DicuQ/132","gender":"男","country":"中国","province":"安徽","city":"合肥","address_id":0,"balance":"0.00","points":0,"pay_money":"0.00","expend_money":"0.00","grade_id":0,"is_new_user":1,"phone":"13956934659","fid":0,"mid":1,"role":null,"smile":0,"weixin":null,"job":null,"source_name":null,"source_text":null,"source_cardid":null,"lasttime":null,"group_tags":null,"company":null,"position":null,"source_type":1,"scene":null,"source_id":null,"phonemodel":null,"address":[],"username":null,"password":"","tree_prize":"0.00","register_prize":"0.00","address_default":null,"grade":null}
         * orderCount : {"payment":0,"delivery":0,"received":0,"comment":0}
         * setting : {"points_name":"积分"}
         * couponCount : 0
         * userBgColor : #ffdd00
         * menus : {"address":{"name":"收货地址","url":"pages/address/index","icon":"map"},"coupon":{"name":"领券中心","url":"pages/coupon/coupon","icon":"lingquan"},"my_coupon":{"name":"我的优惠券","url":"pages/user/coupon/coupon","icon":"youhuiquan"},"sharing_order":{"name":"拼团订单","url":"pages/sharing/order/index","icon":"pintuan"},"my_bargain":{"name":"我的秒助","url":"pages/bargain/index/index?tab=1","icon":"kanjia"},"points_mall":{"name":"积分商城","url":"pages/exchange/list","icon":"jifen"},"help":{"name":"我的帮助","url":"pages/user/help/index","icon":"help"}}
         */

        private int rm;
        private int tm;
        private DealerBean dealer;
        private int cn;
        private UserInfoBean userInfo;
        private OrderCountBean orderCount;
        private SettingBean setting;
        private int couponCount;
        private String userBgColor;
        private MenusBean menus;

        public int getRm() {
            return rm;
        }

        public void setRm(int rm) {
            this.rm = rm;
        }

        public int getTm() {
            return tm;
        }

        public void setTm(int tm) {
            this.tm = tm;
        }

        public DealerBean getDealer() {
            return dealer;
        }

        public void setDealer(DealerBean dealer) {
            this.dealer = dealer;
        }

        public int getCn() {
            return cn;
        }

        public void setCn(int cn) {
            this.cn = cn;
        }

        public UserInfoBean getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoBean userInfo) {
            this.userInfo = userInfo;
        }

        public OrderCountBean getOrderCount() {
            return orderCount;
        }

        public void setOrderCount(OrderCountBean orderCount) {
            this.orderCount = orderCount;
        }

        public SettingBean getSetting() {
            return setting;
        }

        public void setSetting(SettingBean setting) {
            this.setting = setting;
        }

        public int getCouponCount() {
            return couponCount;
        }

        public void setCouponCount(int couponCount) {
            this.couponCount = couponCount;
        }

        public String getUserBgColor() {
            return userBgColor;
        }

        public void setUserBgColor(String userBgColor) {
            this.userBgColor = userBgColor;
        }

        public MenusBean getMenus() {
            return menus;
        }

        public void setMenus(MenusBean menus) {
            this.menus = menus;
        }

        public static class DealerBean {
            /**
             * user_id : 17137
             * real_name : 一⃰无⃰白⃰衣⃰
             * mobile :
             * money : 0.00
             * freeze_money : 0.00
             * total_money : 0.00
             * referee_id : 0
             * first_num : 0
             * second_num : 0
             * third_num : 0
             * is_delete : 0
             * wxapp_id : 10001
             * user : {"user_id":17137,"union_id":"","open_id":"ocVLJ5TCbaI0iJl272V28VWa2Pkc","app_openid":"","pid":16820,"nickName":"一\u20f0无\u20f0白\u20f0衣\u20f0","avatarUrl":"https://thirdwx.qlogo.cn/mmopen/vi_32/DYAIOgq83eowXq4W2OXOiar4ULicT7uBv0XBzLaG24ox9cFIiaG3jgj7bYFBia1ia56M945IVK5nVacnPwaVek5DicuQ/132","gender":"男","country":"中国","province":"安徽","city":"合肥","address_id":0,"balance":"0.00","points":0,"pay_money":"0.00","expend_money":"0.00","grade_id":0,"is_new_user":1,"is_delete":0,"wxapp_id":10001,"create_time":"2021-02-26 13:51:09","update_time":"2021-02-26 17:36:47","phone":"13956934659","fid":0,"mid":1,"role":null,"smile":0,"weixin":null,"job":null,"source_name":null,"source_text":null,"source_cardid":null,"lasttime":null,"group_tags":null,"company":null,"position":null,"source_type":1,"scene":null,"source_id":null,"phonemodel":null,"address":null,"username":null,"password":"","tree_prize":"0.00","register_prize":"0.00"}
             * referee : null
             */

            private int user_id;
            private String real_name;
            private String mobile;
            private String money;
            private String freeze_money;
            private String total_money;
            private int referee_id;
            private int first_num;
            private int second_num;
            private int third_num;
            private int is_delete;
            private int wxapp_id;
            private UserBean user;
            private Object referee;

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public String getReal_name() {
                return real_name;
            }

            public void setReal_name(String real_name) {
                this.real_name = real_name;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getMoney() {
                return money;
            }

            public void setMoney(String money) {
                this.money = money;
            }

            public String getFreeze_money() {
                return freeze_money;
            }

            public void setFreeze_money(String freeze_money) {
                this.freeze_money = freeze_money;
            }

            public String getTotal_money() {
                return total_money;
            }

            public void setTotal_money(String total_money) {
                this.total_money = total_money;
            }

            public int getReferee_id() {
                return referee_id;
            }

            public void setReferee_id(int referee_id) {
                this.referee_id = referee_id;
            }

            public int getFirst_num() {
                return first_num;
            }

            public void setFirst_num(int first_num) {
                this.first_num = first_num;
            }

            public int getSecond_num() {
                return second_num;
            }

            public void setSecond_num(int second_num) {
                this.second_num = second_num;
            }

            public int getThird_num() {
                return third_num;
            }

            public void setThird_num(int third_num) {
                this.third_num = third_num;
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

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public Object getReferee() {
                return referee;
            }

            public void setReferee(Object referee) {
                this.referee = referee;
            }

            public static class UserBean {
                /**
                 * user_id : 17137
                 * union_id :
                 * open_id : ocVLJ5TCbaI0iJl272V28VWa2Pkc
                 * app_openid :
                 * pid : 16820
                 * nickName : 一⃰无⃰白⃰衣⃰
                 * avatarUrl : https://thirdwx.qlogo.cn/mmopen/vi_32/DYAIOgq83eowXq4W2OXOiar4ULicT7uBv0XBzLaG24ox9cFIiaG3jgj7bYFBia1ia56M945IVK5nVacnPwaVek5DicuQ/132
                 * gender : 男
                 * country : 中国
                 * province : 安徽
                 * city : 合肥
                 * address_id : 0
                 * balance : 0.00
                 * points : 0
                 * pay_money : 0.00
                 * expend_money : 0.00
                 * grade_id : 0
                 * is_new_user : 1
                 * is_delete : 0
                 * wxapp_id : 10001
                 * create_time : 2021-02-26 13:51:09
                 * update_time : 2021-02-26 17:36:47
                 * phone : 13956934659
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
                 * address : null
                 * username : null
                 * password :
                 * tree_prize : 0.00
                 * register_prize : 0.00
                 */

                private int user_id;
                private String union_id;
                private String open_id;
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
                private int is_delete;
                private int wxapp_id;
                private String create_time;
                private String update_time;
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
                private Object address;
                private Object username;
                private String password;
                private String tree_prize;
                private String register_prize;

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

                public String getOpen_id() {
                    return open_id;
                }

                public void setOpen_id(String open_id) {
                    this.open_id = open_id;
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

                public Object getAddress() {
                    return address;
                }

                public void setAddress(Object address) {
                    this.address = address;
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
            }
        }

        public static class UserInfoBean {
            /**
             * user_id : 17137
             * union_id :
             * app_openid :
             * pid : 16820
             * nickName : 一⃰无⃰白⃰衣⃰
             * avatarUrl : https://thirdwx.qlogo.cn/mmopen/vi_32/DYAIOgq83eowXq4W2OXOiar4ULicT7uBv0XBzLaG24ox9cFIiaG3jgj7bYFBia1ia56M945IVK5nVacnPwaVek5DicuQ/132
             * gender : 男
             * country : 中国
             * province : 安徽
             * city : 合肥
             * address_id : 0
             * balance : 0.00
             * points : 0
             * pay_money : 0.00
             * expend_money : 0.00
             * grade_id : 0
             * is_new_user : 1
             * phone : 13956934659
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
             * address : []
             * username : null
             * password :
             * tree_prize : 0.00
             * register_prize : 0.00
             * address_default : null
             * grade : null
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
            private Object address_default;
            private Object grade;
            private List<?> address;

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

            public Object getAddress_default() {
                return address_default;
            }

            public void setAddress_default(Object address_default) {
                this.address_default = address_default;
            }

            public Object getGrade() {
                return grade;
            }

            public void setGrade(Object grade) {
                this.grade = grade;
            }

            public List<?> getAddress() {
                return address;
            }

            public void setAddress(List<?> address) {
                this.address = address;
            }
        }

        public static class OrderCountBean {
            /**
             * payment : 0
             * delivery : 0
             * received : 0
             * comment : 0
             */

            private int payment;
            private int delivery;
            private int received;
            private int comment;

            public int getPayment() {
                return payment;
            }

            public void setPayment(int payment) {
                this.payment = payment;
            }

            public int getDelivery() {
                return delivery;
            }

            public void setDelivery(int delivery) {
                this.delivery = delivery;
            }

            public int getReceived() {
                return received;
            }

            public void setReceived(int received) {
                this.received = received;
            }

            public int getComment() {
                return comment;
            }

            public void setComment(int comment) {
                this.comment = comment;
            }
        }

        public static class SettingBean {
            /**
             * points_name : 积分
             */

            private String points_name;

            public String getPoints_name() {
                return points_name;
            }

            public void setPoints_name(String points_name) {
                this.points_name = points_name;
            }
        }

        public static class MenusBean {
            /**
             * address : {"name":"收货地址","url":"pages/address/index","icon":"map"}
             * coupon : {"name":"领券中心","url":"pages/coupon/coupon","icon":"lingquan"}
             * my_coupon : {"name":"我的优惠券","url":"pages/user/coupon/coupon","icon":"youhuiquan"}
             * sharing_order : {"name":"拼团订单","url":"pages/sharing/order/index","icon":"pintuan"}
             * my_bargain : {"name":"我的秒助","url":"pages/bargain/index/index?tab=1","icon":"kanjia"}
             * points_mall : {"name":"积分商城","url":"pages/exchange/list","icon":"jifen"}
             * help : {"name":"我的帮助","url":"pages/user/help/index","icon":"help"}
             */

            private AddressBean address;
            private CouponBean coupon;
            private MyCouponBean my_coupon;
            private SharingOrderBean sharing_order;
            private MyBargainBean my_bargain;
            private PointsMallBean points_mall;
            private HelpBean help;

            public AddressBean getAddress() {
                return address;
            }

            public void setAddress(AddressBean address) {
                this.address = address;
            }

            public CouponBean getCoupon() {
                return coupon;
            }

            public void setCoupon(CouponBean coupon) {
                this.coupon = coupon;
            }

            public MyCouponBean getMy_coupon() {
                return my_coupon;
            }

            public void setMy_coupon(MyCouponBean my_coupon) {
                this.my_coupon = my_coupon;
            }

            public SharingOrderBean getSharing_order() {
                return sharing_order;
            }

            public void setSharing_order(SharingOrderBean sharing_order) {
                this.sharing_order = sharing_order;
            }

            public MyBargainBean getMy_bargain() {
                return my_bargain;
            }

            public void setMy_bargain(MyBargainBean my_bargain) {
                this.my_bargain = my_bargain;
            }

            public PointsMallBean getPoints_mall() {
                return points_mall;
            }

            public void setPoints_mall(PointsMallBean points_mall) {
                this.points_mall = points_mall;
            }

            public HelpBean getHelp() {
                return help;
            }

            public void setHelp(HelpBean help) {
                this.help = help;
            }

            public static class AddressBean {
                /**
                 * name : 收货地址
                 * url : pages/address/index
                 * icon : map
                 */

                private String name;
                private String url;
                private String icon;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }
            }

            public static class CouponBean {
                /**
                 * name : 领券中心
                 * url : pages/coupon/coupon
                 * icon : lingquan
                 */

                private String name;
                private String url;
                private String icon;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }
            }

            public static class MyCouponBean {
                /**
                 * name : 我的优惠券
                 * url : pages/user/coupon/coupon
                 * icon : youhuiquan
                 */

                private String name;
                private String url;
                private String icon;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }
            }

            public static class SharingOrderBean {
                /**
                 * name : 拼团订单
                 * url : pages/sharing/order/index
                 * icon : pintuan
                 */

                private String name;
                private String url;
                private String icon;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }
            }

            public static class MyBargainBean {
                /**
                 * name : 我的秒助
                 * url : pages/bargain/index/index?tab=1
                 * icon : kanjia
                 */

                private String name;
                private String url;
                private String icon;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }
            }

            public static class PointsMallBean {
                /**
                 * name : 积分商城
                 * url : pages/exchange/list
                 * icon : jifen
                 */

                private String name;
                private String url;
                private String icon;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }
            }

            public static class HelpBean {
                /**
                 * name : 我的帮助
                 * url : pages/user/help/index
                 * icon : help
                 */

                private String name;
                private String url;
                private String icon;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }
            }
        }
    }
}
