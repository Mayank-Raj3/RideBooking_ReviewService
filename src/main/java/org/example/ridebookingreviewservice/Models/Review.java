package org.example.ridebookingreviewservice.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@ToString
@Table(name = "bookingreview")
public class Review extends BaseModel {

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private double rating ;

}
