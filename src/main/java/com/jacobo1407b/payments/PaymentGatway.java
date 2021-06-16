package com.jacobo1407b.payments;

public interface PaymentGatway {

   PaymemtResponse requestPayment(PaymentRequest request);
}
