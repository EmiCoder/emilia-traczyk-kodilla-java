package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    int sideLength;
    int high;

    public Triangle(int sideLength, int high) {
        this.sideLength = sideLength;
        this.high = high;
    }


    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return (sideLength * high) / 2;
    }

    @Override
    public String toString() {
        return "triangle";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return sideLength == triangle.sideLength &&
                high == triangle.high;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideLength, high);
    }
}
