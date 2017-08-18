package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("User1");
        User user2 = new YGeneration("User2");
        User user3 = new ZGeneration("User3");
        //When
        System.out.println(user1.sharePost());
        System.out.println(user2.sharePost());
        System.out.println(user3.sharePost());
        //Then
        Assert.assertEquals("Snapchat", user1.sharePost());
        Assert.assertEquals("Facebook", user2.sharePost());
        Assert.assertEquals("Twitter", user3.sharePost());
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("User1");
        //When
        user1.setSocialPublisher(new FacebookPublisher());
        System.out.println(user1.sharePost());
        //Then
        Assert.assertEquals("Facebook", user1.sharePost());
    }
}
