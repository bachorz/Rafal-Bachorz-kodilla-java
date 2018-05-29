package com.kodilla.testing.shape;


import org.junit.*;

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
    public void beforeEveryTest() {
        System.out.println("The test has been finished");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();

        //When
        collector.addFigure(new Square(8.00));

        //Then
        Assert.assertEquals(1,collector.getShapesQuantity());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square(8.00);
        collector.addFigure(new Square(8.00));
        //When
        boolean result = collector.removeFigure(square);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,collector.getShapesQuantity());
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape shape = new Square(8.00);
        collector.addFigure(new Square(8.00));

        //When
        Shape square = collector.getFigure(0);

        //Then
        Assert.assertEquals(shape, square);
    }
    @Test
    public void testShowFigures(){
        ShapeCollector collector = new ShapeCollector();
        Shape shape = new Square(8.00);
        collector.addFigure(new Square(8.00));

        collector.showFigures();
    }

    @Test
    public void testGetFigureOutOfRange(){
        ShapeCollector collector = new ShapeCollector();
        Shape shape = new Square(8.00);
        collector.addFigure(new Square(8.00));

        //When
        Shape square = collector.getFigure(1000000);

        //Then
        Assert.assertNotEquals(shape, square);
    }

    @Test
    public void testRemoveFigureOutCollection(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square(8.00);
        collector.addFigure(new Square(8.00));
        Circle circle = new Circle(5.21);

        //When
        boolean result = collector.removeFigure(circle);

        //Then
        Assert.assertFalse(result);
        Assert.assertEquals(1,collector.getShapesQuantity());
    }
}