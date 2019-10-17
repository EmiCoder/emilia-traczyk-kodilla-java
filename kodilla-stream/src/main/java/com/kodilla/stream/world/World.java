package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> listOfAllContinent = new ArrayList<>();

    public void addContinent (Continent continent) {
        listOfAllContinent.add(continent);
    }

    public boolean removeContinent (Continent continent) {
        return listOfAllContinent.remove(continent);
    }

    public List<Continent> getListOfAllContinent() {
        return listOfAllContinent;
    }

    public BigDecimal getPeopleQuantity() {
        return listOfAllContinent.stream()
                .flatMap(continent -> continent.getListOfCountryPerContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
