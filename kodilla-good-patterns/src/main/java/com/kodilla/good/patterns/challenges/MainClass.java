package com.kodilla.good.patterns.challenges;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {

        String collect = Stream.of(new MovieStore().getMovies())
                                        .map(Map::entrySet)
                                        .flatMap(entries -> entries.stream())
                                        .flatMap(stringListEntry -> stringListEntry.getValue().stream())
                                        .map(String::toString)
                                        .collect(Collectors.joining(", "));

        System.out.println(collect);

    }
}
