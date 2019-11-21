package com.codilla.testing.shape;

import java.util.ArrayList;

interface Shape {
    String getShapeName();
    int getField();
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
    public int collectedShapesQuantity(){
        return 1;
    }
}
