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
    public String toString() {
        return super.toString() + " [Flight: " + origin + " → " + destination + "]";
    }
}
