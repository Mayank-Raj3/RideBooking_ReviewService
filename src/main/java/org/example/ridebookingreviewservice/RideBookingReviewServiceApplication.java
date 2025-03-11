package org.example.ridebookingreviewservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RideBookingReviewServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RideBookingReviewServiceApplication.class, args);
    }

}
