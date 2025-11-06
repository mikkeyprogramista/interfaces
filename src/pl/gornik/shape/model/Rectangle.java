package pl.gornik.shape.model;

public class Rectangle implements Shape {
    public static final String NAME = "Rectangle";
    private final double a;
    private final double b;

    public Rectangle(
            double a,
            double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculateCircumference() {
        return (2.00 * a) + (2.00 * b);
    }
}
