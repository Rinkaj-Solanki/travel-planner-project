package com.cloud.travelplanner.service;

import com.cloud.travelplanner.model.Trip;
import com.cloud.travelplanner.repository.TripRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class TripService {

    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public void saveTrip(Trip trip) throws ExecutionException, InterruptedException {
        tripRepository.saveTrip(trip);
    }

    public Trip getTripById(String id) throws ExecutionException, InterruptedException {
        return tripRepository.getTripById(id);
    }

    public List<Trip> getAllTrips() throws ExecutionException, InterruptedException {
        return tripRepository.getAllTrips();
    }
}

