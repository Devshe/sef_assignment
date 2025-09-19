package com.worldwanderer.model;

import java.time.LocalDateTime;

//Devmini Sheronie Perera Attapttuge S4183290 implemented this class
public class Payment {
    private int paymentId;
    private int bookingId;
    private double amount;
    private String paymentStatus;
    private LocalDateTime paymentDate;

    public Payment(int paymentId, int bookingId, double amount) {
        this.paymentId = paymentId;
        this.bookingId = bookingId;
        this.amount = amount;
        this.paymentStatus = "Pending";
        this.paymentDate = null;
    }

    // --- Actions ---
    public String processPayment() {
        this.paymentStatus = "Completed";
        this.paymentDate = LocalDateTime.now();
        return "Payment " + paymentId + " processed successfully for booking " + bookingId + ".";
    }

    public String refundPayment() {
        if ("Completed".equals(paymentStatus)) {
            this.paymentStatus = "Refunded";
            return "Payment " + paymentId + " refunded successfully.";
        } else {
            return "Cannot refund payment " + paymentId + " with status: " + paymentStatus;
        }
    }

    // --- Getters ---
    public int getPaymentId() { return paymentId; }
    public int getBookingId() { return bookingId; }
    public double getAmount() { return amount; }
    public String getPaymentStatus() { return paymentStatus; }
    public LocalDateTime getPaymentDate() { return paymentDate; }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", bookingId=" + bookingId +
                ", amount=" + amount +
                ", status='" + paymentStatus + '\'' +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
