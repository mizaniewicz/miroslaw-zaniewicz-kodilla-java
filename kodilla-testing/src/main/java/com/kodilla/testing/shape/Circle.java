package com.kodilla.testing.shape;

/**
 * Created by mizan on 18.07.2017.
 */
public class Circle extends Figure {
    private static final String figureName = "circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getFigureName() {
        return figureName;
    }

    @Override
    public double getField() {
        return (Math.PI * radius * radius);
    }
}
