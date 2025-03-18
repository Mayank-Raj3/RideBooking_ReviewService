package org.example.ridebookingreviewservice.Services;


import org.example.ridebookingreviewservice.Models.Booking;
import org.example.ridebookingreviewservice.Models.Review;
import org.example.ridebookingreviewservice.Repository.BookingRepository;
import org.example.ridebookingreviewservice.Repository.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReviewService implements CommandLineRunner {
    private final ReviewRepository reviewRepository;
    private final BookingRepository bookingRepository;

    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository) {
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
    }

    public void run(String... args) throws Exception {
        Review r = Review.builder()
                .content("this is a review")
                .rating(2.6)
                .build();
        System.out.println(r);

        Booking b = Booking.builder().review(r).endTime(new Date()).build();
        bookingRepository.save(b);

        reviewRepository.save(r);
    }


}
