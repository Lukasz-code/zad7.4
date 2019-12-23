package com.kodilla.exception.test;

import java.util.Map;

public class FlightFindRunner {

    public static void main(String[] args)  {

        Flight flight = null;

        FlightRoute flightRoute = new FlightRoute();

        try {
            Map<String, Boolean> newRoute = flightRoute.findFlight(flight);

        } catch (RouteNotFoundException e) {
            System.out.println(" Error: " + e);
        }
        finally {
            System.out.println("Please give another destination");
        }
    }
}
