package src.Lab._05_Shapes_02;

public class Rectangle extends Shape{
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
        this.calculatePerimeter();
        this.calculateArea();
    }

    public Double getHeight() {
        return height;
    }


    public Double getWidth() {
        return width;
    }

    @Override
    protected void calculatePerimeter() {
        Double perimeter = (this.height + this.width) * 2;
        super.setPerimeter(perimeter);
    }

    @Override
    protected void calculateArea() {
        Double area = this.width * this.height;
        super.setArea(area);
    }
}
