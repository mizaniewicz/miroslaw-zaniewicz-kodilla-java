package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public final static String APPLES = "APPLES";
    public final static String RED = "RED";
    public final static String CAR = "CAR";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case APPLES:
                return new ShoppingTask("buy apples", "apples", 10);
            case RED:
                return new PaintingTask("paint the room", "red", "salon");
            case CAR:
                return new DrivingTask("drive to the airport", "chopin airport", "car");
            default:
                return null;
        }
    }
}
