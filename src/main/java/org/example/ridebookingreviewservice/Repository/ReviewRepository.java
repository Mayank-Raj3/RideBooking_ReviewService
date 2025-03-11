package org.example.ridebookingreviewservice.Repository;

import org.example.ridebookingreviewservice.Models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}
