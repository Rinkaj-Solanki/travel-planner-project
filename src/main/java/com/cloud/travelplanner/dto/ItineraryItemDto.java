package com.cloud.travelplanner.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ItineraryItemDto {
    private String id;
    private String tripId;
    private String title;
    private String description;
    private String date;
}

