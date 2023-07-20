package com.endava.ticketmanagement.controller;

import com.endava.ticketmanagement.model.EventType;
import com.endava.ticketmanagement.service.EventTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventTypeController {
    private EventTypeService eventTypeService;

    @Autowired
    public EventTypeController(EventTypeService eventTypeService) {
        this.eventTypeService = eventTypeService;
    }

    @GetMapping("/eventType")
    public List<EventType> eventTypeGetAll(){
        return eventTypeService.eventTypeFindAll();
    }
}
