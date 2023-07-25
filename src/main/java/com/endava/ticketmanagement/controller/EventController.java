package com.endava.ticketmanagement.controller;

import com.endava.ticketmanagement.model.Event;
import com.endava.ticketmanagement.service.EventService;
import com.endava.ticketmanagement.service.dto.EventDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EventController {

    private EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/event")
    public List<Event> eventGetAll(){
        return eventService.eventFindAll();
    }

    @PostMapping("/event/create")
    public Event createEvent(@RequestBody Event newEvent){
        return eventService.createEvent(newEvent);
    }

    @GetMapping("/event/findBy")
    public List<EventDTO> eventFindBy(@RequestParam int venueID, @RequestParam String eventTypeName){
            List<Event> events= eventService.eventFind(venueID, eventTypeName);
            //System.out.println(events);
            return events.stream().map(EventService::eventFindBy).collect(Collectors.toList());
    }
}
