package com.endava.ticketmanagement.service;

import com.endava.ticketmanagement.model.Event;
import com.endava.ticketmanagement.model.EventType;
import com.endava.ticketmanagement.model.TicketCategory;
import com.endava.ticketmanagement.model.Venue;
import com.endava.ticketmanagement.repository.EventRepository;
import com.endava.ticketmanagement.repository.EventTypeRepository;
import com.endava.ticketmanagement.repository.VenueRepository;
import com.endava.ticketmanagement.service.dto.EventDTO;
import com.endava.ticketmanagement.service.dto.TicketCategoryDTO;
import com.endava.ticketmanagement.service.dto.VenueDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    private EventRepository eventRepository;
    private VenueRepository venueRepository;
    private EventTypeRepository eventTypeRepository;

    public EventService(EventRepository eventRepository, VenueRepository venueRepository, EventTypeRepository eventTypeRepository) {
        this.eventRepository = eventRepository;
        this.venueRepository = venueRepository;
        this.eventTypeRepository = eventTypeRepository;
    }

    public List<Event> eventFindAll() {
        return eventRepository.findAll();
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> eventFind(int venueID, String type){
        return eventRepository.findEventByVenueVenueIDAndEventType_EventTypeName(venueID, type);
    }

    public static EventDTO eventFindBy(Event event) {
        EventDTO eventDTO= new EventDTO();
         eventDTO.setEventID(event.getEventID());
         eventDTO.setEventName(event.getEventName());
         eventDTO.setEventDescription(event.getEventDescription());
         eventDTO.setVenueDTO(new VenueDTO(event.getVenue()));
         eventDTO.setStartDate(event.getStartDate());
         eventDTO.setEndDate(event.getEndDate());
         List<TicketCategoryDTO> ticketCategoryDTOs=new ArrayList<>();
         for(TicketCategory t:event.getTicketCategoryList()){
             TicketCategoryDTO ticketCategoryDTO=new TicketCategoryDTO();
             ticketCategoryDTO=ticketCategoryDTO.conversion(t);
             ticketCategoryDTOs.add(ticketCategoryDTO);
         }
         eventDTO.setTicketCategoryDTOList(ticketCategoryDTOs);
        return eventDTO;
    }
}
