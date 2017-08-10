package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    @Autowired
    public void setToDoList(TaskList toDoList) {
        this.toDoList = toDoList;
    }

    @Autowired
    public void setInProgressList(TaskList inProgressList) {
        this.inProgressList = inProgressList;
    }

    @Autowired
    public void setDoneList(TaskList doneList) {
        this.doneList = doneList;
    }
}
