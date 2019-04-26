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
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public double getThisAmount(int daysRented) {
        double result = 0;
        switch (getPriceCode()) {
            // 取得影片出租价格
            case REGULAR:
                // 普通片
                result += 2;
                if (daysRented > 2) {
                    result += (daysRented - 2) * 1.5;
                }
                break;
            case NEW_RELEASE:
                // 新片
                result += daysRented * 3;
                break;
            case CHILDREN:
                // 儿童。
                result += 1.5;
                if (daysRented > 3) {
                    result += (daysRented - 3) * 1.5;
                }
                break;
            default:
                break;
        }
        return result;
    }

    public int getFrequentRenterPoints(int daysRented) {
        // add frequent renter points （累计常客积点。
        // add bonus for a two day new release rental
        if ((getPriceCode() == NEW_RELEASE)
                && daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
