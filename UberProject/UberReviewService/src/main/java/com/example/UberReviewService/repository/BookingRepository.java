package com.example.UberReviewService.repository;

import com.example.UberReviewService.models.Booking;
import com.example.UberReviewService.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking,Long> {

    List<Booking> findAllByDriverId(Long id);

    List<Booking> findAllByDriverIn(List<Driver> drivers);
}
