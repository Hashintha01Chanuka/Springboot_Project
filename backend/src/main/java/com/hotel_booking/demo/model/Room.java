package com.hotel_booking.demo.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor

public class Room {
    private Long id;
    private  String roomType;
    private BigDecimal roomPrice;
    private boolean isBooked = false;

    private List<BookedRoom> bookings;

    public Room() {
        this.bookings = new ArrayList<>();

    }
}
