package com.worldwanderer.model;
//Devmini Sheronie Perera Attapttuge S4183290 implemented this class
public class Vehicle extends ServiceProvider {
    private String type;

    public Vehicle(int id, String name, double price, double rating, String type) {
        super(id, name, price, rating);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + " [Vehicle Type: " + type + "]";
    }
}
