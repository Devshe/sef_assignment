package com.worldwanderer.app;

import com.worldwanderer.model.Accommodation;
import com.worldwanderer.model.Booking;
import com.worldwanderer.model.EmailNotification;
import com.worldwanderer.model.Filter;
import com.worldwanderer.model.Flight;
import com.worldwanderer.model.Message;
import com.worldwanderer.model.Payment;
import com.worldwanderer.model.PaymentGateway;
import com.worldwanderer.model.Review;
import com.worldwanderer.model.ServiceProvider;
import com.worldwanderer.model.User;
import com.worldwanderer.model.Vehicle;
import com.worldwanderer.model.WorldWandererAdmin;

import java.util.Arrays;
import java.util.List;

//From here Devmini Sheronie Perera Attapttuge S4183290 implemented this whole class
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

        // Cancel booking
        System.out.println(b1.cancelBooking());

        Payment p1 = new Payment(2001, b1.getBookingId(), b1.calculateTotalPriceForABooking());
        System.out.println(p1.processPayment());

        // Attempt Refund
        System.out.println(p1.refundPayment());

        //Add Review
        Review r1 = new Review(501, user.getUserId(), 1001, 5, "Great service and on-time flight!");
        user.leaveReview(r1);

        // Edit review
        System.out.println(r1.editReview(3, "Average service, flight was delayed."));

        // Edit Profile
        System.out.println(user.editProfile("Sheronie Silva", "sheronie.silva@email.com", "999-888-777"));

        List<ServiceProvider> allServices = Arrays.asList(
                new Flight(301, "SriLankan Airlines", 500.0, 4.5, "Colombo", "Sydney"),
                new Flight(302, "Qatar Airways", 650.0, 4.8, "Colombo", "London"),
                new Accommodation(401, "Hilton Hotel", 200.0, 4.2, "Sydney"),
                new Vehicle(501, "Toyota Corolla", 80.0, 4.0, "Sedan")
        );

        // --- Search by keyword ---
        List<ServiceProvider> searchResults = user.searchServices(allServices, "SriLankan");
        System.out.println("\nSearch Results:");
        searchResults.forEach(System.out::println);

        // --- Filter services by price <= 500 ---
        List<Filter> filters = Arrays.asList(new Filter("price", 500.0));
        List<ServiceProvider> filteredResults = user.filterOptions(allServices, filters);
        System.out.println("\nFiltered Results (price <= 500):");
        filteredResults.forEach(System.out::println);

        // --- Select specific service ---
        ServiceProvider selected = user.selectOption(allServices, 401);
        System.out.println("\nSelected Service:");
        System.out.println(selected);

        Flight f1 = (Flight) allServices.get(0);
        System.out.println("\n" + f1.getFlightDetails());

        Accommodation a1 = (Accommodation) allServices.get(2);
        System.out.println(a1.getAccommodationDetails());

        Vehicle v1 = (Vehicle) allServices.get(3);
        System.out.println(v1.getVehicleDetails());

        System.out.println("\n" + f1.addService());
        System.out.println(f1.updateService("SriLankan Airlines - Updated", 550.0, 4.7));
        System.out.println(f1.deleteService());

        System.out.println("\n" + a1.addService());
        System.out.println(a1.updateService("Hilton Deluxe", 250.0, 4.5));
        System.out.println(a1.deleteService());

        System.out.println("\n" + v1.addService());
        System.out.println(v1.updateService("Toyota Corolla Hybrid", 100.0, 4.6));
        System.out.println(v1.deleteService());

        // Display history
        System.out.println("\nBookings:");
        user.viewBookingHistory().forEach(b -> System.out.println(b.getSummary()));

        System.out.println("\nReviews:");
        user.getReviews().forEach(r -> System.out.println(r.getSummary()));

        // Messaging feature
        Message msg = new Message(701, user.getUserId(), 999, "Hello, I need help with my booking.");
        System.out.println("\n" + msg.sendMessage());
        System.out.println(msg.receiveMessage());

        // PaymentGateway
        PaymentGateway gateway = new PaymentGateway(1, "Stripe");
        System.out.println("\n" + gateway.processPayment(p1));
        System.out.println(gateway.refundPayment(p1));

        // Admin actions
        WorldWandererAdmin admin = new WorldWandererAdmin(100, "AdminUser", "Manager");
        System.out.println("\n" + admin.manageServiceProvider(selected, "Approve"));
        System.out.println(admin.setServiceFee("Flight", 25.0));
        System.out.println(admin.viewReports());

        // Email notifications
        EmailNotification email = new EmailNotification(9001, user.getEmail(),
                "Booking Confirmation", "Your booking has been confirmed!");
        System.out.println("\n" + email.sendConfirmation(b1));
        System.out.println(email.sendItinerary(b1));

        System.out.println(user.logout());
    }
}