package com.platzi.javatest.payments;

public class PaymentProcessor {
    private PaymentsGateways paymentsGateways;

    public PaymentProcessor(PaymentsGateways paymentsGateways) {
        this.paymentsGateways = paymentsGateways;
    }

    public boolean makePayment(double amount){
        PaymentResponse paymentResponse = paymentsGateways.requestPayment(new PaymentRequest(amount));
        if(paymentResponse.getStatus() == PaymentResponse.PaymentStatus.OK){
            return true;
        }else{
            return false;
        }
    }



}
