package com.endava.ticketmanagement.repository;

import com.endava.ticketmanagement.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Order, Integer> {
    public List<Order> findByUser_UserID(int userID);
}
