package org.example.graphic.editor;

import static org.example.graphic.editor.util.ShapePrinter.printShapeName;

import org.example.graphic.editor.shapes.Circle;
import org.example.graphic.editor.shapes.Octagon;
import org.example.graphic.editor.shapes.Quad;
import org.example.graphic.editor.shapes.Rectangle;
import org.example.graphic.editor.shapes.Shape;
import org.example.graphic.editor.shapes.Square;
import org.example.graphic.editor.shapes.Triangle;

/**
 * Main class to run the application.
 * <p>
 * This class creates an array of different shapes and prints their names
 * using the ShapePrinter utility.
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
