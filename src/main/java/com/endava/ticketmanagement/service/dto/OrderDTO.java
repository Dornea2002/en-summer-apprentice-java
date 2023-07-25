package com.endava.ticketmanagement.service.dto;

import java.time.LocalDate;

public class OrderDTO {
    private int ticketCategoryID;
    private int numberOfTickets;

    public OrderDTO(int ticketCategoryID, int numberOfTickets, Double totalPrice) {
        this.ticketCategoryID = ticketCategoryID;
        this.numberOfTickets = numberOfTickets;
    }

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

}
