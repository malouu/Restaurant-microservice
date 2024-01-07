package com.pi.kitchenservice.repository;

import org.springframework.stereotype.Repository;

import com.pi.kitchenservice.model.Ticket;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TicketRepository {
    private List<Ticket> tickets = new ArrayList<>();

    public Ticket addTicket(Ticket ticket) {
        tickets.add(ticket);
        return ticket;
    }

    public Ticket findById(Long id) {
        return tickets.stream().filter(ticket -> ticket.getId().equals(id)).findFirst().orElseThrow();
    }

    public List<Ticket> findAll() {
        return tickets;
    }

    public Ticket editTicket(Long id, Ticket ticket) {
        Ticket ticketToEdit = findById(id);
        ticketToEdit.edit(ticket);
        return ticketToEdit;
    }

    public Ticket readyTicket(Long id) {
        Ticket ticketToEdit = findById(id);
        ticketToEdit.ready();
        return ticketToEdit;
    }

    public Ticket acceptTicket(Long id) {
        Ticket ticketToEdit = findById(id);
        ticketToEdit.accepted();
        return ticketToEdit;
    }

    public Ticket deleteTicket(Long id) {
        Ticket ticketToDelete = findById(id);
        tickets.remove(ticketToDelete);
        return ticketToDelete;
    }

    
}
