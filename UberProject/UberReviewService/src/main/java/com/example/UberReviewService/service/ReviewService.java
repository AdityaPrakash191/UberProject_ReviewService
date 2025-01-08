package com.example.UberReviewService.service;

import com.example.UberReviewService.models.Booking;
import com.example.UberReviewService.models.Driver;
import com.example.UberReviewService.models.Review;
import com.example.UberReviewService.repository.BookingRepository;
import com.example.UberReviewService.repository.DriverRepository;
import com.example.UberReviewService.repository.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;
    private BookingRepository bookingRepository;
    private DriverRepository driverRepository;

    public ReviewService(ReviewRepository reviewRepository , BookingRepository bookingRepository , DriverRepository driverRepository){
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
        this.driverRepository =  driverRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {


//        Review r = Review.builder()
//                .content("Amazing Ride Quality")
//                .rating(4.5)
//                .build();
//
//        Booking b = Booking.builder().StartDate(new Date()).review(r).build();
//
//
//        System.out.println(r);
//
////        reviewRepository.save(r);
//        bookingRepository.save(b);
//           Optional<Driver> driver = driverRepository.findById(1L);
//        Optional<Driver> driver = driverRepository.findByIdAndLicenseNumber(2L,"A1A2");
//        if(driver.isPresent()){
//            Optional<Booking> driverBooking = bookingRepository.findBookingByDriver(driver.get());
//            Booking b = driverBooking.get();
//            System.out.println(b.getReview() +" "+ b.getTotalDistanceTravelled() + " " + b. + " " + b.getPassenger() + b.getTotalDistanceTravelled());
//            List<Booking> bookings = bookingRepository.findAllByDriverId(2L);
//            for(Booking booking : bookings){
//               System.out.println(booking.getBookingStatus());
//            }

//        }

//        Optional <Driver> driver = driverRepository.findById(1L);
//        if(driver.isPresent()){
//            System.out.println(driver.get().getName());
//            List<Booking> bookings = driver.get().getBooking();
//            for(Booking b : bookings){
//                System.out.println(b.getId());
//            }
//        }
//        List<Driver> drivers = driverRepository.findAllByIdIn(new ArrayList<>(Arrays.asList(1L,2L,3L,4L)));
//        System.out.println("******************"+drivers);
//        for(Driver driver : drivers){
//            List <Booking> b = driver.getBooking();
//            System.out.println(b.);

        }
//        driverRepository.FindByIdAndLicenseNumber();





    }
//}
