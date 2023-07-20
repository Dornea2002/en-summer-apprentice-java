package com.endava.ticketmanagement.service;

import com.endava.ticketmanagement.model.Venue;
import com.endava.ticketmanagement.repository.VenueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueService {
    private VenueRepository venueRepository;

    public VenueService(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    public List<Venue> venueFindAll(){
        return venueRepository.findAll();
    }
}
