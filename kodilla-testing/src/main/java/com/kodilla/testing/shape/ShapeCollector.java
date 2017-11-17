package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> figures = new ArrayList<>();

    public ShapeCollector(ArrayList<Shape> figures) {
        this.figures = figures;
    }

    public ArrayList<Shape> getFigures() {
        return figures;
    }

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        for (int i = 0; i < figures.size(); i++) {
            if (shape.equals(figures.get(i))) {
                figures.remove(i);
            }
        }
    }

    public Shape getFigure(int n) {
        return getFigures().get(n);
    }

    public Shape showFigure() {
        for (Shape figures : figures) {
            return figures;
        }
        return null;
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "figures=" + figures +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShapeCollector that = (ShapeCollector) o;

        return figures != null ? figures.equals(that.figures) : that.figures == null;
    }

    @Override
    public int hashCode() {
        return figures != null ? figures.hashCode() : 0;
    }
}
