package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> list = new ArrayList<>();

    public ShapeCollector() {
    }

    public ShapeCollector(ArrayList<Shape> list) {
        this.list = list;
    }

    public void addFigure (Shape shape) {
        list.add(shape);
    }

    public void removeFigure (Shape shape) {
        list.remove(shape);
    }

    public Shape getFigure (int n) {
        return list.get(n);
    }

    public Shape[] showFigures() {
        Shape[] tmp = new Shape[this.list.size()];
        for (int i = 0; i < list.size(); i++) {
            tmp[i] = list.get(i);
        }
        return tmp;
    }

    public ArrayList<Shape> getList() {
        return list;
    }

}
