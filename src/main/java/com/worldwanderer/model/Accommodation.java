package com.worldwanderer.model;

//Devmini Sheronie Perera Attapttuge S4183290 implemented this class
public class Accommodation extends ServiceProvider {
    private String location;

    public Accommodation(int id, String name, double price, double rating, String location) {
        super(id, name, price, rating);
        this.location = location;
    }

    @Override
    public String addService() {
        return "Accommodation '" + getName() + "' added at location " + location;
    }

    @Override
    public String updateService(String newName, double newPrice, double newRating) {
        return "Accommodation '" + getName() + "' updated → Name: " + newName +
                ", Price: $" + newPrice + ", Rating: " + newRating;
    }

    @Override
    public String deleteService() {
        return "Accommodation '" + getName() + "' deleted.";
    }

    public String getAccommodationDetails() {
        return "Accommodation Details → " +
                "Name: " + getName() +
                ", Location: " + location +
                ", Price: $" + getPrice() +
                ", Rating: " + getRating();
    }

    @Override
    public String toString() {
        return super.toString() + " [Hotel in " + location + "]";
    }
}
