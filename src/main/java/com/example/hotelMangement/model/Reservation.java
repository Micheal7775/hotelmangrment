package com.example.hotelMangement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long hotelId;
    private String guestName;
    private Date checkInDate;
    private Date checkOutDate;

    // Getters and setters
}

