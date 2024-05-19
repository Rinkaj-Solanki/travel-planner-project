package com.cloud.travelplanner.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ItineraryItem {
    private String id;
    private String tripId;
    private String title;
    private String description;
    private String date;
}

