package com.kodilla.testing.shape;

import java.util.HashSet;

/**
 * Created by mizan on 18.07.2017.
 */
public class ShapeCollector {
    private HashSet<Figure> figures = new HashSet<Figure>();

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void removeFigure(Figure figure) {
        figures.remove(figure);
    }

    public String showFigures() {
        String result = "";
        for (Figure f: figures) {
            result += (f.getFigureName() + " " + f.getField() + "\n").toString();
        }
        return result;
    }

    public boolean containFigure(Figure figure) {
        return figures.contains(figure);
    }

    public int getSize() {
        return figures.size();
    }
}
