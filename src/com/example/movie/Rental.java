package com.example.movie;

/**
 * @author: gaojun
 * @date: 2019/4/26 10:11
 * @description: 租赁
 */
public class Rental {
    Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public double getThisAmount(){
        return movie.getThisAmount(daysRented);
    }

    public int getTotalRenterPoints(){
        return movie.getFrequentRenterPoints(daysRented);
    }

}
