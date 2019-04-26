package com.example.movie;

/**
 * @author: gaojun
 * @date: 2019/4/26 10:57
 * @description:
 */
public class MovieMain {
    public static void main(String[] args) {
        Customer customer = new Customer("Tom");
        Movie theAvengersFour = new Movie("The Avengers 4", Movie.NEW_RELEASE);
        Movie theAvengersThree = new Movie("The Avengers 3", Movie.REGULAR);
        Movie happyGoat = new Movie("The Happy Goat", Movie.CHILDREN);
        customer.addRental(new Rental(theAvengersFour, 5));
        customer.addRental(new Rental(theAvengersFour, 1));
        customer.addRental(new Rental(theAvengersThree, 4));
        customer.addRental(new Rental(happyGoat, 3));

        System.out.println(customer.statement());
    }
}
