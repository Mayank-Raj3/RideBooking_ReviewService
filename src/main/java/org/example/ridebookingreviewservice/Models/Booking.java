package org.example.ridebookingreviewservice.Models;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModel{

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startTime ;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endTime ;

    private Long totalDistance ;

    @OneToOne(cascade = CascadeType.ALL)
    private Review review; // 1:1 booking and review

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Passenger passenger;



}
