package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.APPLES);
        shopping.executeTask();
        //Then
        Assert.assertTrue(shopping.isTaskExecuted());
        Assert.assertEquals("buy apples", shopping.getTaskName());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.RED);
        painting.executeTask();
        //Then
        Assert.assertTrue(painting.isTaskExecuted());
        Assert.assertEquals("paint the room", painting.getTaskName());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.CAR);
        driving.executeTask();
        //Then
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("drive to the airport", driving.getTaskName());
    }
}
