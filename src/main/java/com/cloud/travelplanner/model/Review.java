package com.cloud.travelplanner.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Review {
    private String id;
    private String userId;
    private String entityId; // Can be flightId or hotelId
    private String comment;
    private int rating;
    private String date;
}


