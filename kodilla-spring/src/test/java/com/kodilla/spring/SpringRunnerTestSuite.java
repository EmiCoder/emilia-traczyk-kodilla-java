package com.kodilla.spring;

import com.kodilla.spring.reader.ReaderConfig;
import com.kodilla.spring.shape.Shape;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestSuite {

//    @Test
//    public void testSquareLoadedIntoContainer() {
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Shape shape = (Shape) context.getBean("createSquare");
//        String name = shape.getShapeName();
//        Assert.assertEquals("This is a square.", name);
//    }
//
//    @Test
//    public void testCircleLoadedIntoContainer() {
//        //Given
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Shape shape = (Shape)context.getBean("circle");
//        //When
//        String name = shape.getShapeName();
//        //Then
//        Assert.assertEquals("This is a circle.", name);
//    }
//
//    @Test
//    public void testTriangleLoadedIntoContainer() {
//        //Given
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Shape shape = (Shape)context.getBean("triangle");
//        //When
//        String name = shape.getShapeName();
//        //Then
//        Assert.assertEquals("This is a triangle.", name);
//    }

    @Test
    public void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("chosenShape");
        //When
        String name = shape.getShapeName();
        //Then
        System.out.println("Chosen shape says: " + name);
    }

    @Test
    public void testConditional() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        boolean book2Exists = context.containsBean("book2");
        System.out.println("Bean book2 was found in the container: " + book2Exists);
    }
}
