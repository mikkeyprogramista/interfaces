package pl.gornik.shape.model;

public class Circle implements Shape {
    public static final String NAME = "Circle";
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateCircumference() {
        return 2.00 * Math.PI * radius;
    }
}
