package com.cloud.travelplanner.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReviewDto {
    private String id;
    private String userId;
    private String entityId;
    private String comment;
    private int rating;
    private String date;
}
