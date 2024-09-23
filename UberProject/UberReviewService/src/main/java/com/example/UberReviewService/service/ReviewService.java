package com.example.UberReviewService.service;

import com.example.UberReviewService.models.Booking;
import com.example.UberReviewService.models.Review;
import com.example.UberReviewService.repository.BookingRepository;
import com.example.UberReviewService.repository.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;
    private BookingRepository bookingRepository;

    public ReviewService(ReviewRepository reviewRepository , BookingRepository bookingRepository){
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Review r = Review.builder()
                .content("Amazing Ride Quality")
                .rating(4.5)
                .build();

        Booking b = Booking.builder().StartDate(new Date()).review(r).build();


        System.out.println(r);

//        reviewRepository.save(r);
        bookingRepository.save(b);





    }
}
