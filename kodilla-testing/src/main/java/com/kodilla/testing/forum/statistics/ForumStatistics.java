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
        if (statistics.usersNames().size() == 0) {
            System.out.println("User list is empty");
            avaragePostsPerUser = 0;
            avarageCommentsPerUser = 0;
        } else {
            avaragePostsPerUser = (double) amountOfPosts / (double) amountOfUsers;
            avarageCommentsPerUser = (double) amountOfComments / (double) amountOfUsers;
        }
        if (statistics.postsCount() == 0) {
            System.out.println("This post has no comments");
            averageCommentsPerPost = 0;
        } else {
            averageCommentsPerPost = (double) amountOfComments / (double) amountOfPosts;
        }
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
