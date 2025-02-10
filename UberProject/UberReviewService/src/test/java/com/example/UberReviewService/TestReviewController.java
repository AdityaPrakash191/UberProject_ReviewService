package com.example.UberReviewService;

import com.example.UberReviewService.adapters.CreateReviewDtoToReviewAdapter;
import com.example.UberReviewService.controllers.ReviewController;
import com.example.UberReviewService.dtos.CreateReviewDto;
import com.example.UberReviewService.models.Booking;
import com.example.UberReviewService.models.Review;
import com.example.UberReviewService.service.ReviewService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TestReviewController {

    @InjectMocks
    private ReviewController reviewController;

    @Mock
    private ReviewService reviewService;

    @Mock
    private CreateReviewDtoToReviewAdapter createReviewDtoToReviewAdapter;


    @BeforeEach
    public void setUp() throws Exception{
        MockitoAnnotations.openMocks(this).close();
    }

    @Test
    public void testFindReviewById_Success(){
        Long reviewId = 1L;
        Review mockReview = Review.builder().build();
        mockReview.setId(reviewId);

        when(reviewService.findReviewById(reviewId)).thenReturn(Optional.of(mockReview));

        ResponseEntity<?> response = reviewController.findReviewById(reviewId);

        assertEquals(HttpStatus.OK , response.getStatusCode());
        Optional<Review> returnedReview = (Optional<Review>) response.getBody();
        assertEquals(reviewId , returnedReview.get().getId());
     }

    @Test
    public void testFindReviewById_NotFound(){
        Long reviewId = 1L;


        when(reviewService.findReviewById(reviewId)).thenReturn(Optional.empty());

        ResponseEntity<?> response = reviewController.findReviewById(reviewId);

        assertEquals(HttpStatus.NOT_FOUND , response.getStatusCode());

    }

     @Test
    public void testPublishReview(){

         CreateReviewDto reviewDto = new CreateReviewDto();
         Booking booking = new Booking();
         booking.setId(1L);
         reviewDto.setBookingId(booking.getId());

         Review review = Review.builder()
                         .content("Amzaing ride")
                         .rating(4.5)
                          .booking(booking).build();

         when(createReviewDtoToReviewAdapter.convertDto(reviewDto)).thenReturn(review);

        Review incomingReview = Review
                .builder()
                .content(review.getContent())
                .rating(review.getRating())
                .booking(review.getBooking())
                .build();

        when(reviewService.publishReview(review)).thenReturn(incomingReview);

        ResponseEntity<?> response = reviewController.publishReview(reviewDto);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());


     }

}
