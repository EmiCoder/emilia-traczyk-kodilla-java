package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{

    int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "square";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return sideLength == square.sideLength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideLength);
    }
}
