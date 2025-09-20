package com.worldwanderer.model;

//Devmini Sheronie Perera Attapttuge S4183290 implemented this class
public class Accommodation extends ServiceProvider {
    private String location;

    public Accommodation(int id, String name, double price, double rating, String location) {
        super(id, name, price, rating);
        this.location = location;
    }

    @Override
    public String toString() {
        return super.toString() + " [Hotel in " + location + "]";
    }
}
