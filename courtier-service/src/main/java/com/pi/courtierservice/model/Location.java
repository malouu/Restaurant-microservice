package com.pi.courtierservice.model;

public class Location {
    // id: auto incremented id
    // longitude: longitude of the location
    // latitude: latitude of the location

    private Long id;
    private double longitude;
    private double latitude;

    public Location(Long id, double longitude, double latitude) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Location(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Location() {
    }

    public Long getId() {
        return id;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;

    }

    @Override
    public String toString() {
        return "Location [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + "]";
    }
    
}
