package com.endava.ticketmanagement.controller;

import com.endava.ticketmanagement.model.TicketCategory;
import com.endava.ticketmanagement.service.TicketCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketCategoryController {
    private TicketCategoryService ticketCategoryService;

    @Autowired
    public TicketCategoryController(TicketCategoryService ticketCategoryService) {
        this.ticketCategoryService = ticketCategoryService;
    }

    @GetMapping("/ticketCategory")
    public List<TicketCategory> ticketCategoryGetAll(){
        return ticketCategoryService.ticketCategoryFindAll();
    }
}
