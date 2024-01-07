package com.pi.restaurantservice.controller;

import java.util.List;

import com.pi.restaurantservice.model.Adresse;

import com.pi.restaurantservice.repository.RestaurantRepository;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {
    private static final Logger LOGGER =  LoggerFactory.getLogger(RestaurantController.class);
    @Autowired
    private RestaurantRepository restaurantRepository;

    @PostMapping
    public Adresse createAdresse(@RequestBody Adresse adresse) {
        LOGGER.info("Adresse add: {}", adresse);
        return restaurantRepository.addAdresse(adresse);
    }

    @GetMapping
    public List<Adresse> findAll() {
        LOGGER.info("Adresse find");
        return restaurantRepository.findAll();
    }

    @GetMapping("/{id}")
    public Adresse findById(@PathVariable Long id) {
        LOGGER.info("Adresse find: id={}", id);
        return restaurantRepository.findById(id);
    }
    // find by city
    @GetMapping("/city/{city}")
    public List<Adresse> findByCity(@PathVariable String city) {
        LOGGER.info("Adresse find: city={}", city);
        return restaurantRepository.findByCity(city);
    }

    // edit adresse modifies the adresse
    @PutMapping("/{id}")
    public Adresse editAdresse(@PathVariable Long id, @RequestBody Adresse adresse) {
        LOGGER.info("Adresse edit: id={}, adresse={}", id, adresse);
        return restaurantRepository.editAdresse(id, adresse);
    }

    // delete adresse deletes the adresse
    @PutMapping("/{id}/delete")
    public Adresse deleteAdresse(@PathVariable Long id) {
        LOGGER.info("Adresse delete: id={}", id);
        return restaurantRepository.deleteAdresse(id);
    }

    // find menus by keyword
    @GetMapping("/menus/{keyword}")
    public List<Adresse> findMenusByKeyword(@PathVariable String keyword) {
        LOGGER.info("Adresse find: keyword={}", keyword);
        return restaurantRepository.findByKeyword(keyword);
    }
}
