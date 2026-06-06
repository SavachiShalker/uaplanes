package com.example.uaplanes.controller;

import com.example.uaplanes.model.Flight;
import com.example.uaplanes.service.FlightService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/search")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    public List<Flight> getFlightsByNumber(@RequestParam String flightNumber) {
        return flightService.getFlightsByNumber(flightNumber);
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.createFlight(flight);
    }
}