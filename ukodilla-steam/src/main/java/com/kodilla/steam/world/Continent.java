package com.kodilla.steam.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private List<Country> countries = new ArrayList<>();

    public Continent(List<Country> countries) {
        this.countries = countries;
    }

    public void addContinent (Country country){
        countries.add(country);
    }

    public List<Country> getCountries() {
        return countries;
    }

}
