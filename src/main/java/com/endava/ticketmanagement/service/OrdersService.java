package com.endava.ticketmanagement.service;

import com.endava.ticketmanagement.model.Order;
import com.endava.ticketmanagement.model.TicketCategory;
import com.endava.ticketmanagement.model.User;
import com.endava.ticketmanagement.repository.OrdersRepository;
import com.endava.ticketmanagement.repository.TicketCategoryRepository;
import com.endava.ticketmanagement.repository.UserRepository;
import com.endava.ticketmanagement.service.dto.OrderDTO;
import exception.TicketCategoryNotValid;
import exception.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrdersService {
    private OrdersRepository ordersRepository;
    private TicketCategoryRepository ticketCategoryRepository;
    private UserRepository userRepository;

    public OrdersService(OrdersRepository ordersRepository, TicketCategoryRepository ticketCategoryRepository, UserRepository userRepository) {
        this.ordersRepository = ordersRepository;
        this.ticketCategoryRepository = ticketCategoryRepository;
        this.userRepository = userRepository;
    }

    public List<Order> ordersFindAll() {
        return ordersRepository.findAll();
    }

    public Order createOrder(OrderDTO orderDTO) throws Exception {
        Order order = new Order();

        Optional<TicketCategory> ticketCategory = ticketCategoryRepository.findById(orderDTO.getTicketCategoryID());
        if (ticketCategory.isEmpty()) {
            throw new TicketCategoryNotValid("Ticket category not valid!");
        } else {
            order.setTicketCategory(ticketCategory.get());
            order.setNumberOfTickets(orderDTO.getNumberOfTickets());

            Double totalPrice = order.getNumberOfTickets() * ticketCategory.get().getPrice();
            order.setTotalPrice(totalPrice);

            order.setOrderedAt(LocalDate.now());
            if (userRepository.findById(1).isEmpty()) {
                throw new UserNotFoundException("User does not exist!");
            } else {
                order.setUser(userRepository.findById(1));
                return ordersRepository.save(order);
            }
        }
    }
}
