package org.chenerywoman.exercises.shapes;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.css.Rect;

import static org.junit.Assert.assertEquals;

public class ShapesTest {

    Rectangle myRectangle = new Rectangle(5, 8);
    Square mySquare = new Square(10);
    Shape myShape = new Shape();
    Circle myCircle = new Circle(7);

    @Test
    public void getRectangleArea(){
        assertEquals(40,myRectangle.getArea());
    }

    @Test
    public void getRectanglePerimeter(){
        assertEquals(26, myRectangle.getPerimeter());
    }

    @Test
    public void printRectangleShape(){
        assertEquals("This is a rectangle shape", myRectangle.printShape());
    }

    @Test
    public void getSquareArea(){
        assertEquals(100, mySquare.getArea());
    }

    @Test
    public void getSquarePerimeter(){
        assertEquals(40, mySquare.getPerimeter());
    }

    @Test
    public void getShapeShape(){
        assertEquals("This is a shape", myShape.printShape());
    }

    @Test
    public void getCircleShape(){
        assertEquals("This is a circle shape",myCircle.printShape());
    }



}
