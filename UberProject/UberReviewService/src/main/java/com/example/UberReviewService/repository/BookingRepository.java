package com.example.UberReviewService.repository;

import com.example.UberReviewService.models.Booking;
import com.example.UberReviewService.models.Driver;
import com.example.UberReviewService.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking,Long> {

//    List<Booking> findAllByDriverId(Long id);
//
//    List<Booking> findAllByDriverIn(List<Driver> drivers);

    @Query("select r from Booking b inner join Review r where b.id = :bookingId")
    Review findReviewByBookingId(Long bookingId);
}
