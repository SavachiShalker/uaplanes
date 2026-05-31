package com.example.uaplanes.repository;

import com.example.uaplanes.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, String> {
    java.util.List<Ticket> findByUserProfileUserProfileId(String userProfileId);
}