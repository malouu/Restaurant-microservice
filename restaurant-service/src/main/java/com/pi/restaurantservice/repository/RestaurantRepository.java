package com.pi.restaurantservice.repository;

import org.springframework.stereotype.Repository;

import com.pi.restaurantservice.model.Adresse;

import java.util.ArrayList;
import java.util.List;


@Repository
public class RestaurantRepository {
    private List<Adresse> adresses = new ArrayList<>();

    public Adresse addAdresse(Adresse adresse) {
        adresses.add(adresse);
        return adresse;
    }

    public Adresse findById(Long id) {
        return adresses.stream().filter(adresse -> adresse.getId().equals(id)).findFirst().orElseThrow();
    }

    public List<Adresse> findAll() {
        return adresses;
    }

    public Adresse editAdresse(Long id, Adresse adresse) {
        Adresse adresseToEdit = findById(id);
        adresseToEdit.edit(adresse);
        return adresseToEdit;
    }

    public Adresse deleteAdresse(Long id) {
        Adresse adresseToDelete = findById(id);
        adresses.remove(adresseToDelete);
        return adresseToDelete;
    }

    // find by city
    public List<Adresse> findByCity(String city) {
        return adresses.stream().filter(adresse -> adresse.getCity().equals(city)).toList();
    }

    // find menus by keyword
    public List<Adresse> findByKeyword(String keyword) {
        return adresses.stream().filter(adresse -> adresse.getCity().contains(keyword)).toList();
    }
    
    
}
