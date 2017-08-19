package com.kodilla.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class TasksList {
    final String name;
    final List<Task> tasks = new ArrayList<>();

    public TasksList(final String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("   List [" + name + "]" + "\n");
        for(Task task : tasks) {
            s = s.append(task + "\n");
        }
        return s.toString();
    }
}
