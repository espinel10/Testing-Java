package com.platzi.javatest.payments;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {



    @Test
    public void payment_is_correct() {
        PaymentsGateways paymentsGateways = Mockito.mock(PaymentsGateways.class);
        Mockito.when(paymentsGateways.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentsGateways);
        assertTrue( paymentProcessor.makePayment(1000));
    }

    @Test
    public void payment_is_incorrect() {
        PaymentsGateways paymentsGateways = Mockito.mock(PaymentsGateways.class);
        Mockito.when(paymentsGateways.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentsGateways);
        assertFalse( paymentProcessor.makePayment(1000));
    }
}