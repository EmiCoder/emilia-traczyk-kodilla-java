package com.kodilla.testing.forum.statistics.mock;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCalculator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatiscticsTestSuite {

    @Test
    public void doesCalculateCorrectlyStatistics () {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("Basia");
        usersList.add("Marek");
        usersList.add("Bolek");
        usersList.add("Ania");
        usersList.add("Honorata");
        when(statisticsMock.usersNames()).thenReturn(usersList);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        Assert.assertEquals(5, statisticsCalculator.getAmountOfUsers());
    }
}
