package com.kodilla.testing.forum.statistics.stub;

import com.kodilla.testing.forum.statistics.Statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsStub implements Statistics {

    @Override
    public List<String> usersNames() {
        List<String> usersList = new ArrayList<>();
        usersList.add("Basia");
        usersList.add("Marek");
        usersList.add("Bolek");
        usersList.add("Ania");
        usersList.add("Honorata");
        return usersList;
    }

    @Override
    public int postsCount() {
        return 50;
    }

    @Override
    public int commentsCount() {
        return 300;
    }
}
