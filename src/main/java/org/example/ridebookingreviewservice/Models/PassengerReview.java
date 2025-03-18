package org.example.ridebookingreviewservice.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name ="passenger_review_id")
public class PassengerReview extends Review{
    @Column(nullable = false)
    private String passengerReviewContent;

    @Column(nullable = false)
    private double passengerReviewRating;
}
