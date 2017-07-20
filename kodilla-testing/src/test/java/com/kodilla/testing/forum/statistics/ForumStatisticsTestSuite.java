package com.kodilla.testing.forum.statistics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by mizan on 18.07.2017.
 */
public class ForumStatisticsTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testPostsCountIsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usernameList = new ArrayList<String>();
        usernameList.add("TestUser");
        int posts = 0;
        when(statisticsMock.usersNames()).thenReturn((usernameList));
        when(statisticsMock.postsCount()).thenReturn((posts));
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getAmountOfPosts());
    }
    @Test
    public void testPostsCountIs1K() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usernameList = new ArrayList<String>();
        usernameList.add("TestUser");
        int posts = 1000;
        when(statisticsMock.usersNames()).thenReturn((usernameList));
        when(statisticsMock.postsCount()).thenReturn((posts));
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000, forumStatistics.getAmountOfPosts());
    }
    @Test
    public void testCommentsCountIsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usernameList = new ArrayList<String>();
        usernameList.add("TestUser");
        int comments = 0;
        when(statisticsMock.usersNames()).thenReturn((usernameList));
        when(statisticsMock.commentsCount()).thenReturn((comments));
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getAmountOfComments());
    }
    @Test
    public void testPostsCountIsHigherThanCommentsCount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usernameList = new ArrayList<String>();
        usernameList.add("TestUser");
        int posts = 20;
        int comments = 10;
        when(statisticsMock.usersNames()).thenReturn((usernameList));
        when(statisticsMock.postsCount()).thenReturn((posts));
        when(statisticsMock.commentsCount()).thenReturn((comments));
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.5, forumStatistics.getAverageCommentsPerPost(), 0.01);
        Assert.assertEquals(10, forumStatistics.getAvarageCommentsPerUser(), 0.01);
    }
    @Test
    public void testPostsCountIsLessThanCommentsCount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usernameList = new ArrayList<String>();
        usernameList.add("TestUser");
        int posts = 10;
        int comments = 20;
        when(statisticsMock.usersNames()).thenReturn((usernameList));
        when(statisticsMock.postsCount()).thenReturn((posts));
        when(statisticsMock.commentsCount()).thenReturn((comments));
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(2, forumStatistics.getAverageCommentsPerPost(), 0.01);
        Assert.assertEquals(20, forumStatistics.getAvarageCommentsPerUser(), 0.01);
    }
    @Test
    public void testUsersAmountIsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usernameList = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn((usernameList));
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getAmountOfUsers());
        Assert.assertEquals(0, forumStatistics.getAvaragePostsPerUser(), 0.01);
    }
    @Test
    public void testUserAmountIs100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usernameList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usernameList.add("a" + i);
        }
        when(statisticsMock.usersNames()).thenReturn((usernameList));
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, forumStatistics.getAmountOfUsers());
    }
}
