package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightRoute {
    public Map<String, Boolean> findFlight (Flight flight) throws RouteNotFoundException{

        if (flight != null) {

            Map<String, Boolean> getAvaiableAirports = new HashMap<>();

            getAvaiableAirports.put(flight.getArrivalAirport(), true);

            return getAvaiableAirports;

        }else {
            throw new RouteNotFoundException();
        }
    }
}
