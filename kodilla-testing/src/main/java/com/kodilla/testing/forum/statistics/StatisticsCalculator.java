package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StatisticsCalculator {

    Statistics statistics;

    private int amountOfUsers;
    private int amountOfPosts;
    private int amountOfComments;
    private int avergeOfPostsForSingleUser;
    private int averageOfCommentsForSingleUser;
    private int averageOfCommentsForSinglePost;

    public StatisticsCalculator () {

    }

    public StatisticsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < statistics.usersNames().size(); i++) {
            list.add(statistics.usersNames().get(i));
        }
        this.amountOfUsers = list.size();
        this.amountOfPosts = statistics.postsCount();
        this.amountOfComments = statistics.commentsCount();

        if (statistics.usersNames().size() != 0) {
            this.avergeOfPostsForSingleUser = statistics.postsCount() / statistics.usersNames().size();
            this.averageOfCommentsForSingleUser = statistics.commentsCount() / statistics.usersNames().size();
        } else {
            this.avergeOfPostsForSingleUser = 0;
            this.averageOfCommentsForSingleUser = 0;
        }

        if (statistics.postsCount() != 0) {
            this.averageOfCommentsForSinglePost = statistics.commentsCount() / statistics.postsCount();
        } else {
            this.averageOfCommentsForSinglePost = 0;
        }
    }

    public String showStatistics() {

        return "AmountOfUser: " + statistics.usersNames().size() + "\n" +
                            "AmountOfPosts: " + statistics.postsCount() + "\n" +
                            "AmountOfComments: " + statistics.commentsCount() + "\n" +
                            "AvergeOfPostsForSingleUser: " + statistics.postsCount() / statistics.usersNames().size() + "\n" +
                            "AverageOfCommentsForSingleUser: " + statistics.commentsCount() / statistics.usersNames().size() + "\n" +
                            "AverageOfCommentsForSinglePost: " + statistics.commentsCount() / statistics.postsCount();
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

    public int getAvergeOfPostsForSingleUser() {
        return avergeOfPostsForSingleUser;
    }

    public int getAverageOfCommentsForSingleUser() {
        return averageOfCommentsForSingleUser;
    }

    public int getAverageOfCommentsForSinglePost() {
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
