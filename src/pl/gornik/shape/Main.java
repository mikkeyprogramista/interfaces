package pl.gornik.shape;

import pl.gornik.shape.model.Circle;
import pl.gornik.shape.model.Rectangle;
import pl.gornik.shape.model.Shape;
import pl.gornik.shape.model.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(15.00, 20.00));
        shapes.add(new Circle(12.00));
        shapes.add(new Square(10.00));

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.printf("Pole figury %s wynosi %.4f\n",
                        Circle.NAME,
                        shape.calculateArea());
                System.out.printf("Obwód figury %s wynosi %.4f\n",
                        Circle.NAME,
                        shape.calculateCircumference());
                System.out.println();
            } else if (shape instanceof Rectangle) {
                System.out.printf("Pole figury %s wynosi %.4f\n",
                        Rectangle.NAME,
                        shape.calculateArea());
                System.out.printf("Obwód figury %s wynosi %.4f\n",
                        Rectangle.NAME,
                        shape.calculateCircumference());
                System.out.println();
            } else if (shape instanceof Square) {
                System.out.printf("Pole figury %s wynosi %.4f\n",
                        Square.NAME,
                        shape.calculateArea());
                System.out.printf("Obwód figury %s wynosi %.4f\n",
                        Square.NAME,
                        shape.calculateCircumference());
                System.out.println();
            }
        }
    }
}
