package com.example.UberReviewService.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import java.util.Date;


@Entity
@Table(name = "bookingreview")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel {


    @Column(nullable = false)
    private String content;

    private double rating;

    @Override
    public String toString(){
        return this.content+" "+this.rating+" "+this.createdAt;
    }
}
