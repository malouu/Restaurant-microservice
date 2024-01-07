package com.pi.courtierservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pi.courtierservice.model.Courtier;
import com.pi.courtierservice.repository.CourtierRepository;

import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/courtiers")
public class CourtierController {
    private static final Logger LOGGER =  LoggerFactory.getLogger(CourtierController.class);

    @Autowired
    private CourtierRepository courtierRepository;

    @PostMapping
    public Courtier createCourtier(@RequestBody Courtier courtier) {
        LOGGER.info("Courtier add: {}", courtier);
        return courtierRepository.addCourtier(courtier);
    }

    @GetMapping
    public List<Courtier> findAll() {
        LOGGER.info("Courtier find");
        return courtierRepository.findAll();
    }

    @GetMapping("/{id}")
    public Courtier findById(@PathVariable Long id) {
        LOGGER.info("Courtier find: id={}", id);
        return courtierRepository.findById(id);
    }

    // edit courtier modifies the courtier
    @PutMapping("/{id}")
    public Courtier editCourtier(@PathVariable Long id, @RequestBody Courtier courtier) {
        LOGGER.info("Courtier edit: id={}, courtier={}", id, courtier);
        return courtierRepository.editCourtier(id, courtier);
    }
    
    // edit courtier location modifies the courtier location
    @PutMapping("/{id}/location")
    public Courtier editLocationCourtier(@PathVariable Long id, @RequestBody Courtier courtier) {
        LOGGER.info("Courtier edit: id={}, courtier={}", id, courtier);
        return courtierRepository.editLocationCourtier(id, courtier);
    }

    // delete courtier deletes the courtier
    @DeleteMapping("/{id}")
    public Courtier deleteCourtier(@PathVariable Long id) {
        LOGGER.info("Courtier delete: id={}", id);
        return courtierRepository.deleteCourtier(id);
    }
    // Other API methods can be added here
    
}
