package pl.gornik.shape.model;

public class Square implements Shape {
    public static final String NAME = "Square";
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return Math.pow(a, 2);
    }

    @Override
    public double calculateCircumference() {
        return 4.00 * a;
    }
}
