package com.cloud.travelplanner.dto;

import com.cloud.travelplanner.model.Review;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class HotelDto {
    private String id;
    private String tripId;
    private String name;
    private String address;
    private String checkInDate;
    private String checkOutDate;
    private List<Review> reviews;
}

