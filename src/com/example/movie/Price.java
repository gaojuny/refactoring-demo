package com.example.movie;

/**
 * @author: gaojun
 * @date: 2019/4/26 15:57
 * @description: 价格接口
 */
public abstract class Price {


    public int getFrequentRenterPoints(int daysRented){
        // add frequent renter points （累计常客积点。
        // add bonus for a two day new release rental
        return 1;
    }

    abstract int getPriceCode();

    abstract double getCharge(int daysRented);
}
