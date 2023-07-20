package com.endava.ticketmanagement.controller;

import com.endava.ticketmanagement.model.Venue;
import com.endava.ticketmanagement.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VenueController {
    private VenueService venueService;

    @Autowired
    public VenueController(VenueService venueService) {
        this.venueService = venueService;
    }

    @GetMapping("/venue")
    public List<Venue> venueGetAll(){
        return venueService.venueFindAll();
    }
}
