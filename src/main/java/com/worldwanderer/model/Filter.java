package com.worldwanderer.model;

//Devmini Sheronie Perera Attapttuge S4183290 implemented this class
public class Filter {
    private String type;
    private Object value;

    public Filter(String type, Object value) {
        this.type = type;
        this.value = value;
    }

    public String getType() { return type; }
    public Object getValue() { return value; }
}
