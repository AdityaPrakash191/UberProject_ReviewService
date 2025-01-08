package com.example.UberReviewService.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Setter
@Builder
@NoArgsConstructor
@Getter
@AllArgsConstructor
public class Booking extends BaseModel {

    @OneToOne(cascade = {CascadeType.PERSIST ,CascadeType.REMOVE})
    private Review review;

    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;

    @Temporal(value = TemporalType.DATE)
    private Date StartDate;

    @Temporal(value = TemporalType.DATE)
    private Date EndDate;

    private Long TotalDistanceTravelled;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Passenger passenger;
}
