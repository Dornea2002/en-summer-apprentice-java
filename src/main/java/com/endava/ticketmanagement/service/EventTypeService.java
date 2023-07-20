package com.endava.ticketmanagement.service;

import com.endava.ticketmanagement.model.EventType;
import com.endava.ticketmanagement.repository.EventTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventTypeService {
    private EventTypeRepository eventTypeRepository;

    public EventTypeService(EventTypeRepository eventTypeRepository) {
        this.eventTypeRepository = eventTypeRepository;
    }

    public List<EventType> eventTypeFindAll(){
        return eventTypeRepository.findAll();
    }
}
