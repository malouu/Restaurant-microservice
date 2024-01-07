package com.pi.courtierservice.model;

public class Courtier {
    private Long Cin;
    private String Name;
    private String Telephone;
    private boolean Available;
    private Location Location;

    public Courtier() {
    }

    public Courtier(Long cin, String name, String telephone, boolean available, Location location) {
        Cin = cin;
        Name = name;
        Telephone = telephone;
        Available = available;
        Location = location;
    }

    // Other getters and setters...

    public Location getLocation() {
        return Location;
    }

    public void setLocation(Location location) {
        Location = location;
    }

    public void edit(Courtier courtier) {
        this.Name = courtier.getName();
        this.Telephone = courtier.getTelephone();
        this.Available = courtier.isAvailable();
        this.Location = courtier.getLocation();
    }

    @Override
    public String toString() {
        return "Courtier [Cin=" + Cin + ", Name=" + Name + ", Telephone=" + Telephone + ", Available=" + Available + ", Location=" + Location + "]";
    }

    public Long getCin() {
        return Cin;
    }

    public void setCin(Long cin) {
        Cin = cin;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public boolean isAvailable() {
        return Available;
    }

    public void setAvailable(boolean available) {
        Available = available;
    }
}