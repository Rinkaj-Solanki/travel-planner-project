package com.cloud.travelplanner.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TripDto {
    private String id;
    private String name;
    private String destination;
    private String startDate;
    private String endDate;
    private List<ItineraryItemDto> itinerary;
}

