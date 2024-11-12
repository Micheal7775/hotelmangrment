package com.example.hotelMangement;

import com.example.hotelMangement.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;



public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
