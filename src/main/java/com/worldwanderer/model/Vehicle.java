package com.worldwanderer.model;

//Devmini Sheronie Perera Attapttuge S4183290 implemented this class
public class Vehicle extends ServiceProvider {
    private String type;

    public Vehicle(int id, String name, double price, double rating, String type) {
        super(id, name, price, rating);
        this.type = type;
    }

    @Override
    public String addService() {
        return "Vehicle '" + getName() + "' (" + type + ") added.";
    }

    @Override
    public String updateService(String newName, double newPrice, double newRating) {
        return "Vehicle '" + getName() + "' updated → Name: " + newName +
                ", Price: $" + newPrice + ", Rating: " + newRating;
    }

    @Override
    public String deleteService() {
        return "Vehicle '" + getName() + "' deleted.";
    }

    public String getVehicleDetails() {
        return "Vehicle Details → " +
                "Model: " + getName() +
                ", Type: " + type +
                ", Price: $" + getPrice() +
                ", Rating: " + getRating();
    }

    @Override
    public String toString() {
        return super.toString() + " [Vehicle Type: " + type + "]";
    }
}
