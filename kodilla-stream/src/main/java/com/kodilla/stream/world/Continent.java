package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> listOfCountryPerContinent = new ArrayList<>();

    public void addCountry(Country country) {
        listOfCountryPerContinent.add(country);
    }

    public boolean removeCountry (Country country) {
        return listOfCountryPerContinent.remove(country);
    }

    public List<Country> getListOfCountryPerContinent() {
        return listOfCountryPerContinent;
    }
}
