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

    public TicketCategoryDTO(){

    }

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public TicketCategoryDTO conversion(TicketCategory ticketCategory){

        TicketCategoryDTO ticketCategoryDTO=new TicketCategoryDTO();

        ticketCategoryDTO.setTicketCategoryID(ticketCategory.getTicketCategoryID());
        ticketCategoryDTO.setDescription(ticketCategory.getDescription());
        ticketCategoryDTO.setPrice(ticketCategory.getPrice());
        ticketCategoryDTO.setEventID(ticketCategory.getEvent().getEventID());

        return ticketCategoryDTO;

    }
}
