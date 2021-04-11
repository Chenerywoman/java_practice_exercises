package org.chenerywoman.exercises.shapes;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.css.Rect;

import static org.junit.Assert.assertEquals;

public class ShapesTest {

    Rectangle myRectangle = new Rectangle(5, 8);

    @Test
    public void getRectangleArea(){
        assertEquals(40,myRectangle.getArea());
    }

    @Test
    public void getRectanglePerimeter(){
        assertEquals(26, myRectangle.getPermimeter());
    }

}