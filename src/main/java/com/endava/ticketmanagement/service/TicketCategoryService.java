package com.endava.ticketmanagement.service;

import com.endava.ticketmanagement.model.TicketCategory;
import com.endava.ticketmanagement.repository.TicketCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketCategoryService {
    private TicketCategoryRepository ticketCategoryRepository;

    public TicketCategoryService(TicketCategoryRepository ticketCategoryRepository) {
        this.ticketCategoryRepository = ticketCategoryRepository;
    }

    public List<TicketCategory> ticketCategoryFindAll(){
        return ticketCategoryRepository.findAll();
    }
}
