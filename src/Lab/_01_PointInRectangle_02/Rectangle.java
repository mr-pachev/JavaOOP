package src.Lab._01_PointInRectangle_02;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }


    public Point getBottomLeft() {
        return bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public boolean contains(Point point){
        boolean isXInside = this.bottomLeft.getX() <= point.getX() && this.topRight.getX() >= point.getX();
        boolean isYInside = this.bottomLeft.getY() <= point.getY() && this.topRight.getY() >= point.getY();
        return isXInside && isYInside;
    }

}
