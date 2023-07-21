package com.endava.ticketmanagement.repository;

import com.endava.ticketmanagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    public List<Event> findEventByVenueVenueIDAndEventType_EventTypeName(Integer venueID, String eventType);
}
