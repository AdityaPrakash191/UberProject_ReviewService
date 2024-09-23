package com.example.UberReviewService.repository;

import com.example.UberReviewService.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
}
