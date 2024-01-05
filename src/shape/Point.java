package shape;

public class Point extends Shape {
    private String nameShape;
    public Point(double x, double y, String nameShape) {
        super(x, y);
        this.nameShape = nameShape;
    }

    @Override
    public String getName() {
        return nameShape;
    }
}
