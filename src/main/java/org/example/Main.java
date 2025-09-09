package org.example;

import org.example.shapes.*;

import static org.example.util.ShapePrinter.printShapeName;

/**
 * Main class to run the application.
 * <p>
 * This class creates an array of different shapes and prints their names using the ShapePrinter utility.
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(),
                new Square(),
                new Triangle(),
                new Rectangle(),
                new Octagon(),
                new Shape(),
                new Quad()
        };

        for (Shape shape : shapes) {
            printShapeName(shape);
        }
    }
}