package com.cloud.travelplanner.repository;

import com.cloud.travelplanner.model.Trip;
import java.util.List;
import java.util.concurrent.ExecutionException;

public interface TripRepository {
    void saveTrip(Trip trip) throws ExecutionException, InterruptedException;
    Trip getTripById(String id) throws ExecutionException, InterruptedException;
    List<Trip> getAllTrips() throws ExecutionException, InterruptedException;
}

