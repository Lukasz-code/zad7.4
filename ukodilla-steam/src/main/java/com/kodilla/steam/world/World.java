package com.kodilla.steam.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private List<Continent> continents = new ArrayList<>();

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public void addContinent (Continent continent) {
        continents.add(continent);
    }

    public  List<Continent> getContinent() {
        return continents;
    }

    public BigDecimal getPeopleQuantity() {
        List<Continent> continents = getContinent();
        BigDecimal peopleQuantity = continents.stream()
                .flatMap(country -> country.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return peopleQuantity;
    }
}
