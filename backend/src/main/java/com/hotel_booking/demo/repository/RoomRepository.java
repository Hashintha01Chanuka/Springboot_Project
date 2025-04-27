package com.hotel_booking.demo.repository;

import com.hotel_booking.demo.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
