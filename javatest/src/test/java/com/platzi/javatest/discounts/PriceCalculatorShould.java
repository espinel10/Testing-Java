package com.platzi.javatest.discounts;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorShould {


    @Test
    public void total_zero_when_there_are_prices(){
        PriceCalculator calculator=new PriceCalculator();
        assertTrue(calculator.getTotal()==0.0);
    }

    @Test
    public void total_is_sum_of_prices(){
        PriceCalculator calculator=new PriceCalculator();
        calculator.addPrice(10.2);
        calculator.addPrice(15.5);
        assertTrue(calculator.getTotal()==25.7);
    }

    @Test
    public void aplly_discont_to_prize(){
        PriceCalculator calculator=new PriceCalculator();
        calculator.addPrice(14.2);
        calculator.addPrice(85.8);
        calculator.setDiscount(25);
        assertTrue(calculator.getTotal()==75.0);
    }


}