package org.example.ridebookingreviewservice.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name ="passenger_review_id")
public class PassengerReview extends Review{
    private String passengerReviewContent;
}
