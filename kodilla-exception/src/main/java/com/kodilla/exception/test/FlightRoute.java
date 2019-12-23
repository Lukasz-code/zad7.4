package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightRoute {
    public Boolean findFlight (Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> getAvaiableAirports = new HashMap<>();
        getAvaiableAirports.put("Toruń", true );
        getAvaiableAirports.put("Bydgoszcz", false);


        if (getAvaiableAirports.containsKey(flight.getArrivalAirport()) && getAvaiableAirports.get(flight.getArrivalAirport())) {

            return true ;

        }else {
            throw new RouteNotFoundException();
        }
    }
}
