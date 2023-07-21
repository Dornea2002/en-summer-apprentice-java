package com.endava.ticketmanagement.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "ticket_category")
public class TicketCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_categoryid")
    private int ticketCategoryID;

    @ManyToOne
    @JoinColumn(name = "eventid", referencedColumnName = "eventid")
    private Event event;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
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
}
