package org.example.ridebookingreviewservice.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseModel {
    private String name;
    @OneToMany(mappedBy = "driver")
    private List<Booking> bookings = new ArrayList<>();
}
