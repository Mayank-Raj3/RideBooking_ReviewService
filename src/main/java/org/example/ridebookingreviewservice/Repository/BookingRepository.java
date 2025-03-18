package org.example.ridebookingreviewservice.Repository;

import org.example.ridebookingreviewservice.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long > {
}
