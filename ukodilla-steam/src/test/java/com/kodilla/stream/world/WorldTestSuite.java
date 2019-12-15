package com.kodilla.stream.world;

import com.kodilla.steam.world.Continent;
import com.kodilla.steam.world.Country;
import com.kodilla.steam.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

        @Test
        public void testGetPeopleQuantity() {
            //Given
            List<Country> europeContinent = new ArrayList<>();
            europeContinent.add(new Country("Polnad", new BigDecimal("11111111111111111111")));
            europeContinent.add(new Country("Spain", new BigDecimal("11111111111111111111")));

            List<Country> asiaContinent = new ArrayList<>();
            asiaContinent.add(new Country("Russian", new BigDecimal("11111111111111111111")));
            asiaContinent.add(new Country("China", new BigDecimal("11111111111111111111")));

            List<Country> africaContinent = new ArrayList<>();
            africaContinent.add(new Country("Egypt", new BigDecimal("11111111111111111111")));
            africaContinent.add(new Country("Algeria", new BigDecimal("11111111111111111111")));

            Continent europe = new Continent(europeContinent);
            Continent asia = new Continent(asiaContinent);
            Continent africa = new Continent(africaContinent);

            List<Continent> continents = new ArrayList<>();
            continents.add(europe);
            continents.add(asia);
            continents.add(africa);

            World world = new World(continents);
            //When
            BigDecimal peopleQuantity = world.getPeopleQuantity();

            //Then
            BigDecimal expectedNumberOfPeople = new BigDecimal("66666666666666666666");
            Assert.assertEquals(expectedNumberOfPeople, peopleQuantity);
        }
    }

