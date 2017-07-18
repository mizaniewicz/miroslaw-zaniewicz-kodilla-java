package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by mizan on 18.07.2017.
 */
public class ForumStatisticsTestSuite {
    @Test
    public void test1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 0;
        when(statisticsMock.postsCount()).thenReturn((posts));
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getAmountOfPosts());
    }
    @Test
    public void test2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 1000;
        when(statisticsMock.postsCount()).thenReturn((posts));
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000, forumStatistics.getAmountOfPosts());
    }
    @Test
    public void test3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int comments = 0;
        when(statisticsMock.commentsCount()).thenReturn((comments));
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getAmountOfComments());
    }
    @Test
    public void test4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 20;
        int comments = 10;
        when(statisticsMock.postsCount()).thenReturn((posts));
        when(statisticsMock.commentsCount()).thenReturn((comments));
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.5, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }
    @Test
    public void test5() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 10;
        int comments = 20;
        when(statisticsMock.postsCount()).thenReturn((posts));
        when(statisticsMock.commentsCount()).thenReturn((comments));
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(2, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }
    @Test
    public void test6() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usernameList = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn((usernameList));
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getAmountOfUsers());
    }
    @Test
    public void test7() {
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
