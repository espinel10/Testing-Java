package com.platzi.javatest.payments;

public class PaymentRequest {
    public double getAmount() {
        return amount;
    }

    private double amount;

    public PaymentRequest(double amount) {
        this.amount = amount;
    }
}
