package com.endava.ticketmanagement.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private int userID;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Order> ordersList;
}
