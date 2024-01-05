package shape;

public class Circle extends Shape {

    private String nameShape = "Circle";
    private double radiusCircle;

    public Circle(double x, double y, double radiusCircle) {
        super(x,y);
        this.radiusCircle = radiusCircle;

    }

    @Override
    public void drawShape() {
        //drawing...
    }
}
