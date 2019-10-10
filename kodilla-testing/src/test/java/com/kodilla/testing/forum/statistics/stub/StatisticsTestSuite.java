package com.kodilla.testing.forum.statistics.stub;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCalculator;
import org.junit.Assert;
import org.junit.Test;

public class StatisticsTestSuite {

    @Test
    public void doesCalculateCorrectlyStatistics () {
        Statistics statistics = new StatisticsStub();
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statistics);
        Assert.assertEquals(5, statisticsCalculator.getAmountOfUsers());
        Assert.assertEquals(10, statisticsCalculator.getAvergeOfPostsForSingleUser(), 0);
        Assert.assertEquals(60, statisticsCalculator.getAverageOfCommentsForSingleUser(),0);
        Assert.assertEquals(6, statisticsCalculator.getAverageOfCommentsForSinglePost(),0);
        Assert.assertEquals(50, statisticsCalculator.getAmountOfPosts(),0);
        Assert.assertEquals(300, statisticsCalculator.getAmountOfComments(), 0);
    }

    @Test
    public void testShowStatistics () {
        Statistics statistics = new StatisticsStub();
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statistics);
        String string = "AmountOfUser: 5" + "\n" +
                "AmountOfPosts: 50"+ "\n" +
                "AmountOfComments: 300" + "\n" +
                "AvergeOfPostsForSingleUser: 10.0"  + "\n" +
                "AverageOfCommentsForSingleUser: 60.0"  + "\n" +
                "averageOfCommentsForSinglePost: 6.0";
        Assert.assertEquals(string, statisticsCalculator.showStatistics());
    }

}
