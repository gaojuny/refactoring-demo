package com.example.movie;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author: gaojun
 * @date: 2019/4/26 10:25
 * @description: 顾客
 */
public class Customer {
    private String name;
    private Vector<Rental> rentals = new Vector<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        Enumeration<Rental> rentalsEnumeration = rentals.elements();
        StringBuilder result = new StringBuilder("Rental Record for ").append(getName()).append("\n");
        while (rentalsEnumeration.hasMoreElements()) {
            Rental each = rentalsEnumeration.nextElement();
            // 取得一笔租借记。
            // show figures for this rental（显示此笔租借记录）
            result.append("\t").append(each.getMovie().getTitle()).append("\t")
                    .append(each.getThisAmount()).append("\n");
        }
        // add footer lines（结尾打印）
        result.append("Amount owed is ").append(getTotalAmount()).append("\n");
        result.append("You earned ").append(getTotalRenterPoints())
                .append(" frequent renter points");
        return result.toString();
    }

    public double getTotalAmount(){
        double result = 0;
        Enumeration<Rental> rentalEnumeration = rentals.elements();
        while (rentalEnumeration.hasMoreElements()){
            result += rentalEnumeration.nextElement().getThisAmount();
        }
        return result;
    }

    public int getTotalRenterPoints(){
        int result = 0;
        Enumeration<Rental> rentalEnumeration = rentals.elements();
        while (rentalEnumeration.hasMoreElements()){
            result += rentalEnumeration.nextElement().getTotalRenterPoints();
        }
        return result;
    }

}
