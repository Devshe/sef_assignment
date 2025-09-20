package com.worldwanderer.model;
//Devmini Sheronie Perera Attapttuge S4183290 implemented this class
public abstract class ServiceProvider {
    private int id;
    private String name;
    private double price;
    private double rating; // 1–5

    public ServiceProvider(int id, String name, double price, double rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getRating() { return rating; }

    @Override
    public String toString() {
        return name + " (ID: " + id + ", Price: $" + price + ", Rating: " + rating + ")";
    }
}
