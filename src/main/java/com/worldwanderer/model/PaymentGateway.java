package com.worldwanderer.model;
//Devmini Sheronie Perera Attapttuge S4183290 implemented this class
public class PaymentGateway {
    private int gatewayId;
    private String providerName;

    public PaymentGateway(int gatewayId, String providerName) {
        this.gatewayId = gatewayId;
        this.providerName = providerName;
    }

    public String processPayment(Payment payment) {
        return "Payment " + payment.getPaymentId() + " processed through " + providerName;
    }

    public String refundPayment(Payment payment) {
        return "Refund for Payment " + payment.getPaymentId() + " handled by " + providerName;
    }

    @Override
    public String toString() {
        return "PaymentGateway{" +
                "id=" + gatewayId +
                ", providerName='" + providerName + '\'' +
                '}';
    }
}
