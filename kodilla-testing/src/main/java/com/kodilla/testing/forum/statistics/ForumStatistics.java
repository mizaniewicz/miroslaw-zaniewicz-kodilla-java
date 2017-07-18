package com.kodilla.testing.forum.statistics;

/**
 * Created by mizan on 18.07.2017.
 */
public class ForumStatistics {
    private int amountOfUsers;
    private int amountOfPosts;
    private int amountOfComments;
    private double avaragePostsPerUser;
    private double avarageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        amountOfUsers = statistics.usersNames().size();
        amountOfPosts = statistics.postsCount();
        amountOfComments = statistics.commentsCount();
        avaragePostsPerUser = (double) amountOfPosts / (double) amountOfUsers;
        avarageCommentsPerUser = (double) amountOfComments / (double) amountOfUsers;
        averageCommentsPerPost = (double) amountOfComments / (double) amountOfPosts;
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

    public double getAvaragePostsPerUser() {
        return avaragePostsPerUser;
    }

    public double getAvarageCommentsPerUser() {
        return avarageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
