package com.example.uaplanes.repository;

import com.example.uaplanes.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, String> {
    java.util.List<Flight> findByFlightNumber(String flightNumber);
}