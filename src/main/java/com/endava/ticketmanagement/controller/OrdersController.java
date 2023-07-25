package com.endava.ticketmanagement.controller;

import com.endava.ticketmanagement.model.Order;
import com.endava.ticketmanagement.service.OrdersService;
import com.endava.ticketmanagement.service.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class OrdersController {
    private OrdersService ordersService;

    @Autowired
    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping("/orders")
    @ResponseBody
    public List<Order> ordersGetAll(){
        return ordersService.ordersFindAll();
    }

    @PostMapping("/orders/create")
    public Order createOrder(@RequestBody OrderDTO orderDTO) throws Exception {
        return ordersService.createOrder(orderDTO);
    }

    @GetMapping("/orders/findBy")
    @ResponseBody
    public List<OrderDTO> orderFindByID(@RequestParam int customerID){
        List<Order> orders=ordersService.findByUserID(customerID);
        return orders.stream().map(OrdersService::orderFindById).collect(Collectors.toList());
    }
}
