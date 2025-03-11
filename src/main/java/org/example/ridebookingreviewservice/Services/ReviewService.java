package org.example.ridebookingreviewservice.Services;


import org.example.ridebookingreviewservice.Models.Review;
import org.example.ridebookingreviewservice.Repository.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ReviewService implements CommandLineRunner {
    private final ReviewRepository reviewRepository;
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public void run(String... args) throws Exception {
        Review r = Review.builder()
                .content("this is a review")
                .rating(2.6)
                .build();
        System.out.println(r);

        reviewRepository.save(r);
    }

}
