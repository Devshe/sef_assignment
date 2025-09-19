package com.worldwanderer.app;

import com.worldwanderer.model.Booking;
import com.worldwanderer.model.Payment;
import com.worldwanderer.model.Review;
import com.worldwanderer.model.User;

//From here Devmini Sheronie Perera Attapttuge S4183290 implemented (the end code-line is also marked with a comment)
public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Sheronie Perera", "sheronie@email.com", "hashedPassword", "000-111-222");

        System.out.println(user.register());
        System.out.println(user.login());

        // Add Booking
        Booking b1 = new Booking(1001, user.getUserId(), "Flight", "Flight AA123 from A->B", 499.99);
        user.addBooking(b1);

        // Confirm booking
        System.out.println(b1.confirmBooking());

        // Cancel booking (dummy flow)
        System.out.println(b1.cancelBooking());

        Payment p1 = new Payment(2001, b1.getBookingId(), b1.calculateTotalPriceForABooking());
        System.out.println(p1.processPayment());

        // Attempt Refund (dummy scenario)
        System.out.println(p1.refundPayment());

        //Add Review
        Review r1 = new Review(501, user.getUserId(), 1001, 5, "Great service and on-time flight!");
        user.leaveReview(r1);

        // Edit review
        System.out.println(r1.editReview(3, "Average service, flight was delayed."));

        // Edit Profile
        System.out.println(user.editProfile("Sheronie Silva", "sheronie.silva@email.com", "999-888-777"));

        // Display history
        System.out.println("\nBookings:");
        user.viewBookingHistory().forEach(b -> System.out.println(b.getSummary()));

        System.out.println("\nReviews:");
        user.getReviews().forEach(r -> System.out.println(r.getSummary()));

        System.out.println(user.logout());

        // To here Devmini Sheronie Perera Attapttuge S4183290 implemented this class
    }
}