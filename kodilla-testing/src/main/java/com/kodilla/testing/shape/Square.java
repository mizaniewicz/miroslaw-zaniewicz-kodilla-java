package com.kodilla.testing.shape;

/**
 * Created by mizan on 18.07.2017.
 */
public class Square extends Figure {
    private static final String figureName = "square";
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getFigureName() {
        return figureName;
    }

    @Override
    public double getField() {
        return side * side;
    }
}
