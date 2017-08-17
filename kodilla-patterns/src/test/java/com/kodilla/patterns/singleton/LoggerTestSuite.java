package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void addLogMessage() {
        Logger.getInstance().log("test log");
    }

    @Test
    public void testLastLog() {
        //Given
        //When
        String myLastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("test log", myLastLog);
    }
}
