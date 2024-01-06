package com.pi.restaurantservice.model;

public class Adresse {
    // number: the number of the restaurant apartment
    // name: the name of the street
    // street: the street of the restaurant
    // city: the city of the restaurant
    // region: the region of the restaurant

    private Long id;
    private int number;
    private String name;
    private String street;
    private String city;
    private String region;
    public Adresse() {
    }
    public Adresse(Long id, int number, String name, String street, String city, String region) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.street = street;
        this.city = city;
        this.region = region;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    @Override
    public String toString() {
        return "Adresse [id=" + id + ", number=" + number + ", name=" + name + ", street=" + street + ", city=" + city
                + ", region=" + region + "]";
    }

    
    
}
