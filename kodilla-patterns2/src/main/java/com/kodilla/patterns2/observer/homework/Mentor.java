package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(Homework homework) {
        System.out.println("Topic: " + homework.getName());
        System.out.println("Task number " + homework.getTasks().size() + " in queue");
        updateCount++;
    }
}

