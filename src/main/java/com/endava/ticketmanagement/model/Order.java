package com.endava.ticketmanagement.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderid")
    private int orderID;

    @ManyToOne
    @JoinColumn(name = "userid", referencedColumnName = "userid")
    private User user;

    @ManyToOne
    @JoinColumn(name = "ticket_categoryid", referencedColumnName = "ticket_categoryid")
    private TicketCategory ticketCategory;

    @Column(name = "ordered_at")
    private LocalDate orderedAt;

    @Column(name = "number_of_tickets")
    private int numberOfTickets;

    @Column(name = "total_price")
    private Double totalPrice;
}
