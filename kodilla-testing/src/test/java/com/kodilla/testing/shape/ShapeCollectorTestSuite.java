package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests!");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTests() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new ArrayList<>());
        ArrayList<Shape> expectedList = new ArrayList<>();
        expectedList.add(new Triangle("Triangle", 5.0));
        //When
        shapeCollector.addFigure(new Triangle("Triangle", 5.0));
        //Then
        Assert.assertEquals(expectedList.size(), shapeCollector.getFigures().size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new ArrayList<>());
        ArrayList<Shape> expectedList = new ArrayList<>();
        expectedList.add(new Triangle("Triangle", 5.0));
        expectedList.add(new Square("Square", 4.0));
        expectedList.remove(0);
        //When
        shapeCollector.addFigure(new Triangle("Triangle", 5.0));
        shapeCollector.addFigure(new Square("Square", 4.0));
        shapeCollector.removeFigure(new Triangle("Triangle", 5.0));
        //Then
        Assert.assertEquals(expectedList.size(), shapeCollector.getFigures().size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new ArrayList<>());
        ArrayList<Shape> expectedList = new ArrayList<>();
        expectedList.add(new Triangle("Triangle", 5.0));
        //When
        shapeCollector.addFigure(new Triangle("Triangle", 5.0));
        //Then
        Assert.assertEquals(expectedList.get(0), shapeCollector.getFigure(0));
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new ArrayList<>());
        ArrayList<Shape> expectedList = new ArrayList<>();
        expectedList.add(new Triangle("Triangle", 5.0));
        //When
        shapeCollector.addFigure(new Triangle("Triangle", 5.0));
        //Then
        Assert.assertEquals(expectedList.get(0), shapeCollector.showFigure());
    }
}


