package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Homework patterns1 = new Homework("Design patterns 1");
        Homework patterns2 = new Homework("Design patterns 2");
        Mentor johnSmith = new Mentor("John Smith");
        Mentor markBrown = new Mentor("Mark Brown");
        patterns1.registerObserver(johnSmith);
        patterns1.registerObserver(markBrown);
        patterns2.registerObserver(johnSmith);
        //When
        patterns1.addTask("task 1");
        patterns1.addTask("task 2");
        patterns1.addTask("task 3");
        patterns2.addTask("task 1");
        patterns2.addTask("task 2");
        //Then
        assertEquals(5, johnSmith.getUpdateCount());
        assertEquals(3, markBrown.getUpdateCount());
    }

}