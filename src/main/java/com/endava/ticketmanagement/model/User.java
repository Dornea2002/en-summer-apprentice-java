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

//    @OneToMany(mappedBy = "user")
//    private List<Order> ordersList;

//    public List<Order> getOrdersList() {
//        return ordersList;
//    }
//
//    public void setOrdersList(List<Order> ordersList) {
//        this.ordersList = ordersList;
//    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
