package com.platzi.javatest.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    private double discount=0;
    public void addPrice(double n){
        prices.add(n);
    }


    public void setDiscount(double discount){
        this.discount=discount;
    }


    public double getTotal(){
        double result=0;
        for (Double price : prices) {
            result+=price;
        }

        return result * ((100-discount)/100);
    }


}
