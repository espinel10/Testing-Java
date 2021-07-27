package com.platzi.javatest.payments;

public interface PaymentsGateways {
    PaymentResponse requestPayment(PaymentRequest request);


}
