package com.worldwanderer.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Devmini Sheronie Perera Attapttuge S4183290 implemented this class
public class User {
    private int userId;
    private String name;
    private String email;
    private String passwordHash;
    private String phoneNumber;

    private List<Booking> bookings = new ArrayList<>();
    private List<Review> reviews = new ArrayList<>();

    public User(int userId, String name, String email, String passwordHash, String phoneNumber) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
        this.phoneNumber = phoneNumber;
    }

    public String register() {
        return "User " + name + " registered with email " + email;
    }

    public String login() {
        return "User " + email + " logged in.";
    }

    public String logout() {
        return "User " + email + " logged out.";
    }

    public String editProfile(String newName, String newEmail, String newPhoneNumber) {
        this.name = newName;
        this.email = newEmail;
        this.phoneNumber = newPhoneNumber;
        return "Profile updated: " + this.toString();
    }

    public java.util.List<ServiceProvider> searchServices(java.util.List<ServiceProvider> services, String criteria) {
        java.util.List<ServiceProvider> results = new java.util.ArrayList<>();
        for (ServiceProvider s : services) {
            if (s.getName().toLowerCase().contains(criteria.toLowerCase())) {
                results.add(s);
            }
        }
        return results;
    }

    public java.util.List<ServiceProvider> filterOptions(java.util.List<ServiceProvider> services, java.util.List<Filter> filters) {
        java.util.List<ServiceProvider> filtered = new java.util.ArrayList<>(services);

        for (Filter f : filters) {
            switch (f.getType().toLowerCase()) {
                case "price":
                    double maxPrice = (double) f.getValue();
                    filtered.removeIf(s -> s.getPrice() > maxPrice);
                    break;
                case "rating":
                    double minRating = (double) f.getValue();
                    filtered.removeIf(s -> s.getRating() < minRating);
                    break;
            }
        }
        return filtered;
    }

    public ServiceProvider selectOption(java.util.List<ServiceProvider> services, int optionID) {
        for (ServiceProvider s : services) {
            if (s.getId() == optionID) {
                return s;
            }
        }
        return null;
    }

    // --- Booking operations ---
    public List<Booking> viewBookingHistory() {
        return Collections.unmodifiableList(bookings);
    }

    public boolean addBooking(Booking booking) {
        return bookings.add(booking); // true if successfully added
    }

    public boolean leaveReview(Review review) {
        return reviews.add(review); // true if successfully added
    }

    public List<Review> getReviews() {
        return Collections.unmodifiableList(reviews);
    }

    public int getUserId() { return userId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }

    public void setName(String name) { this.name = name; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
