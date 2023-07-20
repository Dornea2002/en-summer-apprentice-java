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
}
