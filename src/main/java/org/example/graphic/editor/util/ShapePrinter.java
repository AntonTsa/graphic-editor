package org.example.graphic.editor.util;

import org.example.graphic.editor.shapes.Shape;

/**
 * This class provides a method to print the name of a shape.
 */
public class ShapePrinter {
    public static void printShapeName(Shape shape) {
        System.out.println("Shape name: " + shape.getName());
    }
}
