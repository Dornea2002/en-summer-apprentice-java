package com.endava.ticketmanagement.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Optional;

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


    @JoinColumn(name = "ticket_categoryid", referencedColumnName = "ticket_categoryid")
    @ManyToOne(cascade = CascadeType.ALL)
    private TicketCategory ticketCategory;

    @Column(name = "ordered_at")
    private LocalDate orderedAt;

    @Column(name = "number_of_tickets")
    private int numberOfTickets;

    @Column(name = "total_price")
    private Double totalPrice;
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(Optional<User> user) {
        this.user = user.get();
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public LocalDate getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(LocalDate orderedAt) {
        this.orderedAt = orderedAt;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }


}
