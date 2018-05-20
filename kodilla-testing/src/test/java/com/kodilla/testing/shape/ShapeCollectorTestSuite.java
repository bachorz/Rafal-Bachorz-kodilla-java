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
    public void testaddFigure(Shape shape) {
        //Given
        ShapeCollector collector = new ShapeCollector(new Square("square", 8.00));

        //When
        collector.addFigure(new Square("square", 8.00));

        //Then
        Assert.assertEquals(1,collector.getShapesQuantity());
    }
}
