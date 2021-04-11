package org.chenerywoman.exercises.shapes;

public class Square extends Rectangle{

    public Square (int side){
        super(side, side);
    }

    @Override
    public String printShape(){
        return "This is a square shape";
    }
}
