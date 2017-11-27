package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import world.Continent;
import world.Country;
import world.World;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Set<Continent> continentsList = new HashSet<>();
        Continent asia = new Continent("Asia", new HashSet<>());
        Continent europe = new Continent("Europe", new HashSet<>());
        europe.getCountrySet().add(new Country("Poland", new BigDecimal("400000000")));
        europe.getCountrySet().add(new Country("Germany", new BigDecimal("120934342")));
        europe.getCountrySet().add(new Country("France", new BigDecimal("42134652")));
        asia.getCountrySet().add(new Country("China", new BigDecimal("123325156")));

        continentsList.add(europe);
        continentsList.add(asia);

        //When

        BigDecimal peopleQuantity = world.getPeopleQuantity(continentsList);
        BigDecimal expectedPeopleQuantity = new BigDecimal("686394150");

        //Then

        Assert.assertEquals(expectedPeopleQuantity, peopleQuantity);

    }
}
