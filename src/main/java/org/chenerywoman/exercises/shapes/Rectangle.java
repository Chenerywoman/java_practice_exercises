package org.chenerywoman.exercises.shapes;

public class Rectangle extends Shape{

    private int length;
    private int width;

    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return this.length;
    }

    public int getWidth(){
        return this.width;
    }

    public int getArea(){
        return this.length * this.width;
    }

    public int getPerimeter(){
        return this.length * 2 + this.width * 2;
    }

    @Override
    public String printShape(){
        return "This is a rectangle shape";
    }



}
