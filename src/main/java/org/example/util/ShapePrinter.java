package org.example.util;

import org.example.shapes.Shape;

/**
 * This class provides a method to print the name of a shape.
 */
public class ShapePrinter {
    public static void printShapeName(Shape shape) {
        System.out.println("Shape name: " + shape.getName());
    }
}
