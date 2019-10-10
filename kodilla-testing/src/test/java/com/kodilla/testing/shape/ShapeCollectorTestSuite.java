package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @Test
    public void addsCorrectlyFigureToTheList () {
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Triangle(4,5));
        Assert.assertEquals(1, shapeCollector.getList().size());
        Assert.assertEquals("triangle", shapeCollector.getList().get(0).getShapeName());
    }

    @Test
    public void removesCorrectlyFigureFromTheList () {
        ArrayList<Shape> list = new ArrayList<>();
        Shape sh = new Circle(4);
        Shape sq = new Square(4);
        list.add(sh);
        list.add(sq);
        ShapeCollector shapeCollector = new ShapeCollector(list);
        shapeCollector.removeFigure(sh);
        Assert.assertEquals(1, shapeCollector.getList().size());
    }

    @Test
    public void doesGetCorrectlyShape () {
        ArrayList<Shape> list = new ArrayList<>();
        list.add(new Circle(4));
        list.add(new Square(4));
        ShapeCollector shapeCollector = new ShapeCollector(list);
        Assert.assertEquals("square", shapeCollector.getFigure(1).getShapeName());
        Assert.assertEquals(16.0, shapeCollector.getFigure(1).getField(), 0);
    }

    @Test
    public void doesShowsShape () {
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(4));
        shapeCollector.addFigure(new Circle(4));
        shapeCollector.showFigures();
        Assert.assertEquals(2, shapeCollector.getList().size());

        String[] names = new String[] {"square", "circle"};
        for (int i = 0; i < shapeCollector.getList().size(); i++) {
            Assert.assertEquals(names[i], shapeCollector.getList().get(i).getShapeName());
        }
    }


  }
