package com.kodilla.testing.forum.statistics;

import java.util.Objects;

public class StatisticsCalculator {

    Statistics statistics;

    private int amountOfUsers;
    private int amountOfPosts;
    private int amountOfComments;
    private double avergeOfPostsForSingleUser;
    private double averageOfCommentsForSingleUser;
    private double averageOfCommentsForSinglePost;

    public StatisticsCalculator(Statistics statistics) {
        this.amountOfUsers = statistics.usersNames().size();
        this.amountOfPosts = statistics.postsCount();
        this.amountOfComments = statistics.commentsCount();
        calculateAdvStatistics(statistics);
    }

    private void calculateAdvStatistics(Statistics statistics) {
        if (amountOfUsers != 0) {
            this.avergeOfPostsForSingleUser = amountOfPosts / amountOfUsers;
            this.averageOfCommentsForSingleUser = amountOfComments / amountOfUsers;
        } else {
            this.avergeOfPostsForSingleUser = 0;
            this.averageOfCommentsForSinglePost = 0;
        }
        if (amountOfPosts != 0) {
            this.averageOfCommentsForSinglePost = amountOfComments / amountOfPosts;
        } else {
            this.averageOfCommentsForSinglePost = 0;
        }

    }

    public String showStatistics() {
        return "AmountOfUser: " + this.amountOfUsers + "\n" +
                            "AmountOfPosts: " + this.amountOfPosts + "\n" +
                            "AmountOfComments: " + this.amountOfComments + "\n" +
                            "AvergeOfPostsForSingleUser: " + this.avergeOfPostsForSingleUser + "\n" +
                            "AverageOfCommentsForSingleUser: " + this.averageOfCommentsForSingleUser + "\n" +
                            "averageOfCommentsForSinglePost: " + this.averageOfCommentsForSinglePost;
    }



    public int getAmountOfUsers() {
        return amountOfUsers;
    }

    public int getAmountOfPosts() {
        return amountOfPosts;
    }

    public int getAmountOfComments() {
        return amountOfComments;
    }

    public double getAvergeOfPostsForSingleUser() {
        return avergeOfPostsForSingleUser;
    }

    public double getAverageOfCommentsForSingleUser() {
        return averageOfCommentsForSingleUser;
    }

    public double getAverageOfCommentsForSinglePost() {
        return averageOfCommentsForSinglePost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StatisticsCalculator)) return false;
        StatisticsCalculator that = (StatisticsCalculator) o;
        return getAmountOfUsers() == that.getAmountOfUsers() &&
                getAmountOfPosts() == that.getAmountOfPosts() &&
                getAmountOfComments() == that.getAmountOfComments() &&
                Double.compare(that.getAvergeOfPostsForSingleUser(), getAvergeOfPostsForSingleUser()) == 0 &&
                Double.compare(that.getAverageOfCommentsForSingleUser(), getAverageOfCommentsForSingleUser()) == 0 &&
                Double.compare(that.getAverageOfCommentsForSinglePost(), getAverageOfCommentsForSinglePost()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAmountOfUsers(), getAmountOfPosts(), getAmountOfComments(), getAvergeOfPostsForSingleUser(), getAverageOfCommentsForSingleUser(), getAverageOfCommentsForSinglePost());
    }
}
