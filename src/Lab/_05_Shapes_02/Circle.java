package src.Lab._05_Shapes_02;

public class Circle extends Shape{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
        this.calculatePerimeter();
        this.calculateArea();
    }

    public final Double getRadius() {
        return radius;
    }

    @Override
    protected void calculatePerimeter() {
        Double perimeter = 2 * Math.PI * this.radius;
        super.setPerimeter(perimeter);
    }

    @Override
    protected void calculateArea() {
        Double area = Math.PI * this.radius * this.radius;
        super.setArea(area);
    }
}
