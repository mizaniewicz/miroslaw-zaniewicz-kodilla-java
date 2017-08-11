package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("test1");
        board.getInProgressList().addTask("test2");
        board.getDoneList().addTask("test3");
        //Then
        Assert.assertEquals("[test1]", board.getToDoList().toString());
        Assert.assertEquals("[test2]", board.getInProgressList().toString());
        Assert.assertEquals("[test3]", board.getDoneList().toString());
    }
}
