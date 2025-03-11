package org.example.ridebookingreviewservice.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

import java.sql.Driver;


@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name ="driver_review_id")
public class DriverReview extends Review{
    private String driverReviewContent;
}
