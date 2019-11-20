package com.codilla.testing.shape;

import java.util.ArrayList;

interface Shape {

    String getShapeName();
    int getField();
}

class Square implements Shape {
    public String getShapeName() {
        return "square";
    }
    public int getField() {
        return 21;
    }

}
class Triangle implements Shape {
    public String getShapeName(){
        return "triangle";
    }
    public int getField() {
        return 14;
    }
}
class Circle implements Shape {
    public String getShapeName() {
        return "circle";
    }
    public int getField() {
        return 314;
    }

}
public class ShapeCollector {
    private ArrayList<Shape> collectedShapes = new ArrayList<>();

    public void addFigure (Shape shape) {
        collectedShapes.add(shape);
    }
    public void removeFigure (Shape shape) {
        collectedShapes.remove(shape);
    }
    public Shape getFigure (int n) {
       return collectedShapes.get(n);
    }
    public void showFigures() {
        collectedShapes.toArray();
    }
}
