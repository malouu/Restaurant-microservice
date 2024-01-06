package com.pi.courtierservice.model;

public class Courtier {
//     Cin : le numéro de sa carte d’identité
// Nom : le nom du courtier
// Téléphone : le numéro de téléphone du
// courtier
// Disponible : booléen qui indique s’il est
// disponible

private Long Cin;
@Override
public String toString() {
    return "Courtier [Cin=" + Cin + ", Name=" + Name + ", Telephone=" + Telephone + ", Available=" + Available + "]";
}


private String Name;
private String Telephone;
private boolean Available;

public Courtier() {
}

public Courtier(Long cin, String name, String telephone, boolean available) {
    Cin = cin;
    Name = name;
    Telephone = telephone;
    Available = available;
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


public void edit(Courtier courtier) {
    this.Name = courtier.getName();
    this.Telephone = courtier.getTelephone();
    this.Available = courtier.isAvailable();




    
}
