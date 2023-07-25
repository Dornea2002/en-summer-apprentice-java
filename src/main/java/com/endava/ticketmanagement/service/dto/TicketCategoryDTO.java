package com.endava.ticketmanagement.service.dto;

import com.endava.ticketmanagement.model.Event;
import com.endava.ticketmanagement.model.TicketCategory;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class TicketCategoryDTO {
    private int ticketCategoryID;
    private int eventID;
    private String description;
    private Double price;

    public TicketCategoryDTO(TicketCategory ticketCategory) {
        this.ticketCategoryID = ticketCategory.getTicketCategoryID();
        this.eventID = ticketCategory.getEvent().getEventID();
        this.description = ticketCategory.getDescription();
        this.price = ticketCategory.getPrice();
    }
}
