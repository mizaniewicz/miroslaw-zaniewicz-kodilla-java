package com.kodilla.testing.shape;

/**
 * Created by mizan on 18.07.2017.
 */
public class Triangle extends Figure {
    private static final String figureName = "triangle";
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public String getFigureName() {
        return figureName;
    }

    @Override
    public double getField() {
        return ((base * height) / 2);
    }
}
