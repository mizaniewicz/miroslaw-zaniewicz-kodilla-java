package com.kodilla.testing.shape;

import org.junit.*;

/**
 * Created by mizan on 18.07.2017.
 */
public class ShapeCollectorTestSuite {
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector s = new ShapeCollector();
        Figure f = new Square(2);
        //When
        s.addFigure(f);
        //Then
        Assert.assertEquals(1, s.getSize());
        Assert.assertTrue(s.containFigure(f));
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector s = new ShapeCollector();
        Figure f1 = new Square(2);
        Figure f2 = new Circle(3);
        s.addFigure(f1);
        s.addFigure(f2);
        //When
        s.removeFigure(f1);
        //Then
        Assert.assertEquals(1, s.getSize());
        Assert.assertFalse(s.containFigure(f1));
    }
    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector s = new ShapeCollector();
        Figure f = new Square(2);
        s.addFigure(f);
        //When
        //Then
        Assert.assertTrue(s.showFigures().contains("square 4.0"));
    }
}
