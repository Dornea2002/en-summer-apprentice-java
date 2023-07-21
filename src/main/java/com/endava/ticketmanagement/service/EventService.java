package com.endava.ticketmanagement.service;

import com.endava.ticketmanagement.model.Event;
import com.endava.ticketmanagement.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> eventFindAll(){
        return eventRepository.findAll();
    }

    public Event createEvent(Event event){
        return eventRepository.save(event);
    }

    public List<Event> eventFindBy(Integer venueID, String eventType){
        return eventRepository.findEventByVenueVenueIDAndEventType_EventTypeName(venueID, eventType);
    }
}
