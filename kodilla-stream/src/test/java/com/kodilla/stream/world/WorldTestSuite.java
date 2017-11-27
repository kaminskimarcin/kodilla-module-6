package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import world.Continent;
import world.Country;
import world.World;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testCoutryGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("40000000"));

        //When
        BigDecimal result = poland.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("400");

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Set<Continent> continentsList = new HashSet<>();
        Continent asia = new Continent("Asia", new HashSet<>());
        Continent europe = new Continent("Europe", new HashSet<>());
        europe.getCountryList().add(new Country("Poland", new BigDecimal("400000000")));
        europe.getCountryList().add(new Country("Germany", new BigDecimal("120934342")));
        europe.getCountryList().add(new Country("France", new BigDecimal("42134652")));
        asia.getCountryList().add(new Country("China", new BigDecimal("123325156")));

        continentsList.add(europe);
        continentsList.add(asia);

        for (Continent continent : continentsList) {
            System.out.println(continent);
        }

        //When

        BigDecimal peopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedPeopleQuantity = new BigDecimal("568740961");

        //Then

        Assert.assertEquals(expectedPeopleQuantity, peopleQuantity);

    }
}
