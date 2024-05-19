package com.cloud.travelplanner.controller;

import com.cloud.travelplanner.model.Trip;
import com.cloud.travelplanner.service.TripService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api/trips")
public class TripController {

    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @PostMapping
    public void saveTrip(@RequestBody Trip trip) throws ExecutionException, InterruptedException {
        tripService.saveTrip(trip);
    }

    @GetMapping("/{id}")
    public Trip getTripById(@PathVariable String id) throws ExecutionException, InterruptedException {
        return tripService.getTripById(id);
    }

    @GetMapping
    public List<Trip> getAllTrips() throws ExecutionException, InterruptedException {
        return tripService.getAllTrips();
    }

}

