package shape;

public class Circle extends Shape {

    private String nameShape;
    private double radiusCircle;

    public Circle(double x, double y, double radiusCircle, String nameShape) {
        super(x,y);
        this.radiusCircle = radiusCircle;
        this.nameShape = nameShape;

    }

    @Override
    public void drawShape() {
        //drawing...
    }

    @Override
    public String getName() {
        return nameShape;
    }
}
