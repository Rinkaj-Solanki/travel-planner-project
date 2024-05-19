package com.cloud.travelplanner.dto;

import com.cloud.travelplanner.model.Review;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class FlightDto {
    private String id;
    private String tripId;
    private String flightNumber;
    private String departure;
    private String arrival;
    private String departureTime;
    private String arrivalTime;
    private List<Review> reviews;
}

