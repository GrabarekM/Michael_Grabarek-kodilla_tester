//package com.kodilla.collections.adv.exercises.homework;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class FlightFinderTestSuite {
//
//    @Test
//    public void testFlightsTo(){
//        // given
//        FlightFinder flightFinder = new FlightFinder();
//        // when
//        List<Flight> flights = flightFinder.findFlightsTo("Paris");
//        // then
//        assertEquals(3, flights.size());
//        assertEquals(List.of(new Flight("Warsaw", "Paris"),
//                new Flight("Paris", "Krakow")
//                ), flights);
//    }
//
//    @Test
//    public void testFlightsFrom(){
//        // given
//        FlightFinder flightFinder = new FlightFinder();
//        // when
//        List<Flight> flights = flightFinder.findFlightsFrom("Krakow");
//        // then
//        assertEquals(4, flights.size());
//    }
//    @Test
//    public void testNoArrivals(){
//        // given
//        FlightFinder flightFinder = new FlightFinder();
//        // when
//        List<Flight> flight = flightFinder.findFlightsFrom("Paris");
//        // then
//        assertEquals(0, flight.size());
//    }
//    @Test
//    public void testNoDepartures(){
//        // given
//        FlightFinder flightFinder = new FlightFinder();
//        // when
//        List<Flight> flight = flightFinder.findFlightsTo("Krakow");
//        // then
//        assertEquals(0, flight.size());
//    }
//
//
//}