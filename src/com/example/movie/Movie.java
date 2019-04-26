package com.example.movie;

/**
 * @author: gaojun
 * @date: 2019/4/26 10:04
 * @description: 电影
 */
public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode){
            case REGULAR:
                // 普通片
                price = new RegularPrice();
                break;
            case NEW_RELEASE:
                // 新片
                price = new NewReleasePrice();
                break;
            case CHILDREN:
                // 儿童。
                price = new ChildrenPrice();
                break;
            default:
                break;
        }
    }

    public double getCharge(int daysRented){
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }
}
