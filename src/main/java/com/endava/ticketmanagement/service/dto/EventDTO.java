package com.endava.ticketmanagement.service.dto;

import com.endava.ticketmanagement.model.Event;
import com.endava.ticketmanagement.model.EventType;
import com.endava.ticketmanagement.model.TicketCategory;
import com.endava.ticketmanagement.model.Venue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@JsonSerialize
public class EventDTO {

    public EventDTO() {
    }

    private int eventID;
    private String eventDescription;
    private String eventName;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<TicketCategoryDTO> ticketCategoryDTOList;

    private VenueDTO venueDTO;
    private String eventTypeName;

    public EventDTO(Event event) {
        this.eventID = event.getEventID();
        this.eventDescription = event.getEventDescription();
        this.eventName = event.getEventName();
        this.startDate = event.getStartDate();
        this.endDate = event.getEndDate();
        this.venueDTO=new VenueDTO();
        this.eventTypeName=event.getEventType().getEventTypeName();
        this.ticketCategoryDTOList = new ArrayList<>();
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<TicketCategoryDTO> getTicketCategoryDTOList() {
        return ticketCategoryDTOList;
    }

    public void setTicketCategoryDTOList(List<TicketCategoryDTO> ticketCategoryDTOList) {
        this.ticketCategoryDTOList = ticketCategoryDTOList;
    }

    public VenueDTO getVenueDTO() {
        return venueDTO;
    }

    public void setVenueDTO(VenueDTO venueDTO) {
        this.venueDTO = venueDTO;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }
}
