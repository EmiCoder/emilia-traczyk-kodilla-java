package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        World world = new World();

        Continent continent1 = new Continent();
        continent1.addCountry(new Country(new BigDecimal("12345")));
        continent1.addCountry(new Country(new BigDecimal("23456")));

        Continent continent2 = new Continent();
        continent2.addCountry(new Country(new BigDecimal("123")));
        continent2.addCountry(new Country(new BigDecimal("23676")));
        continent2.addCountry(new Country(new BigDecimal("76345")));

        Continent continent3 = new Continent();
        continent3.addCountry(new Country(new BigDecimal("987")));

        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        Assert.assertEquals(new BigDecimal("136932"), world.getPeopleQuantity());
    }
}
