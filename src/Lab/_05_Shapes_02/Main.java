package src.Lab._05_Shapes_02;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2.0, 4.0);
        Shape circle = new Circle(6.00);

        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());

        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
    }
}
