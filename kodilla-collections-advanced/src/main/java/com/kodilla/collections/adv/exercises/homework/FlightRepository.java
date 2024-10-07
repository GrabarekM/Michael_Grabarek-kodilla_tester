package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

public static List<Flight> getFlightsTable(){
    List<Flight> flights = new ArrayList<>();
    flights.add(new Flight("Warsaw", "Krakow"));
    flights.add(new Flight("Paris", "Krakow"));
    flights.add(new Flight("Paris", "Stockholm"));
    flights.add(new Flight("Paris", "Krakow"));
    flights.add(new Flight("Warsaw", "Krakow"));
    flights.add(new Flight("Stockholm", "Warsaw"));

    return flights;
}
}
