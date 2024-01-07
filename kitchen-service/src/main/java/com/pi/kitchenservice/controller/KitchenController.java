package com.pi.kitchenservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.pi.kitchenservice.model.Ticket;
import com.pi.kitchenservice.repository.TicketRepository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/v1/tickets")
public class KitchenController {
    private static final Logger LOGGER =  LoggerFactory.getLogger(KitchenController.class);

    @Autowired
    private TicketRepository ticketRepository;

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        LOGGER.info("Ticket add: {}", ticket);
        return ticketRepository.addTicket(ticket);
    }

    @GetMapping
    public List<Ticket> findAll() {
        LOGGER.info("Ticket find");
        return ticketRepository.findAll();
    }

    @GetMapping("/{id}")
    public Ticket findById(@PathVariable Long id) {
        LOGGER.info("Ticket find: id={}", id);
        return ticketRepository.findById(id);
    }

    // edit ticket modifies the ticket
    @PutMapping("/{id}")
    public Ticket editTicket(@PathVariable Long id, @RequestBody Ticket ticket) {
        LOGGER.info("Ticket edit: id={}, ticket={}", id, ticket);
        return ticketRepository.editTicket(id, ticket);
    }

    // accept ticket changes the status of the ticket to accepted
    @PutMapping("/{id}/accept")
    public Ticket acceptTicket(@PathVariable Long id) {
        LOGGER.info("Ticket accept: id={}", id);
        return ticketRepository.acceptTicket(id);
    }

    // ready ticket changes the status of the ticket to ready
    @PutMapping("/{id}/ready")
    public Ticket readyTicket(@PathVariable Long id) {
        LOGGER.info("Ticket ready: id={}", id);
        return ticketRepository.readyTicket(id);
    }
    
}
