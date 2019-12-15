package com.kodilla.steam.world;

import java.math.BigDecimal;

public class Country{
    final private String nameOfCountry;
    final private BigDecimal peopleQuantity;

    public Country(final String nameOfCountry, final BigDecimal peopleQuantity) {
        this.nameOfCountry = nameOfCountry;
        this.peopleQuantity = peopleQuantity;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public final BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameOfCountry='" + nameOfCountry + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }

}

