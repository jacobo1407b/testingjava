package com.jacobo1407b.payments;

public class PaymemtResponse {

    public PaymemtResponse(PaymentStatus status) {
        this.status = status;
    }

    enum PaymentStatus {
        OK,ERROR
    }

    private PaymentStatus status;

    public PaymentStatus getStatus() {
        return status;
    }
}