package com.kodilla.exception.test;

public class FlightFindRunner {

    public static void main(String[] args)  {

        Flight flight = new Flight("Toruń", "Toruń");

        FlightRoute flightRoute = new FlightRoute();

        try {
            boolean rizant = flightRoute.findFlight(flight);
            System.out.println(rizant);

        } catch (RouteNotFoundException e) {
            System.out.println(" Error: " + e);
        }
        finally {
            System.out.println("Please give another destination");
        }
    }
}
