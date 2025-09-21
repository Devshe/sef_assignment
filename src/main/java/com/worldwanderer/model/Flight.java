package com.worldwanderer.model;

//Devmini Sheronie Perera Attapttuge S4183290 implemented this class
public class Flight extends ServiceProvider {
    private String origin;
    private String destination;

    public Flight(int id, String name, double price, double rating, String origin, String destination) {
        super(id, name, price, rating);
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public String addService() {
        return "Flight '" + getName() + "' added: " + origin + " → " + destination;
    }

    @Override
    public String updateService(String newName, double newPrice, double newRating) {
        return "Flight '" + getName() + "' updated → Name: " + newName +
                ", Price: $" + newPrice + ", Rating: " + newRating;
    }

    @Override
    public String deleteService() {
        return "Flight '" + getName() + "' deleted.";
    }

    public String getFlightDetails() {
        return "Flight Details → " +
                "Airline: " + getName() +
                ", Origin: " + origin +
                ", Destination: " + destination +
                ", Price: $" + getPrice() +
                ", Rating: " + getRating();
    }

    @Override
    public String toString() {
        return super.toString() + " [Flight: " + origin + " → " + destination + "]";
    }
}
