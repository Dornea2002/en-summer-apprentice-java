package com.endava.ticketmanagement.service;

import com.endava.ticketmanagement.model.Order;
import com.endava.ticketmanagement.repository.OrdersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {
    private OrdersRepository ordersRepository;

    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<Order> ordersFindAll(){
        return ordersRepository.findAll();
    }

    public Order createOrder(Order order){
        return ordersRepository.save(order);
    }
}
