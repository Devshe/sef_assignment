package com.worldwanderer.model;

import java.time.LocalDateTime;

//Devmini Sheronie Perera Attapttuge S4183290 implemented this class
public class Booking {
    private int bookingId;
    private int userId;
    private String serviceType;
    private String serviceDetails;
    private double price;
    private String status;
    private LocalDateTime reservedUntil;

    public Booking(int bookingId, int userId, String serviceType, String serviceDetails, double price) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.serviceType = serviceType;
        this.serviceDetails = serviceDetails;
        this.price = price;
        this.status = "Pending";
        this.reservedUntil = LocalDateTime.now().plusMinutes(30); // price locked for 30 minutes
    }

    public String confirmBooking() {
        this.status = "Confirmed";
        return "Booking " + bookingId + " confirmed.";
    }

    public String cancelBooking() {
        this.status = "Cancelled";
        return "Booking " + bookingId + " cancelled.";
    }

    // --- New: Calculate total price (for now just base price) ---
    public double calculateTotalPriceForABooking() {
        // Later: add taxes, extras, service fees here
        return price;
    }
    // Getters
    public int getBookingId() { return bookingId; }
    public int getUserId() { return userId; }
    public String getServiceType() { return serviceType; }
    public String getServiceDetails() { return serviceDetails; }
    public double getPrice() { return price; }
    public String getStatus() { return status; }
    public LocalDateTime getReservedUntil() { return reservedUntil; }

    public String getSummary() {
        return serviceType + " | " + serviceDetails + " | $" + price + " | " + status;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", userId=" + userId +
                ", serviceType='" + serviceType + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", reservedUntil=" + reservedUntil +
                '}';
    }
}
