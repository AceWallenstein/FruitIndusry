package com.pinnoocle.fruitindustryoptimization.bean;

public class GoodListBean {
    private String title;
    private String price;
    private String pic;

    public GoodListBean(String title, String price, String pic) {
        this.title = title;
        this.price = price;
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
