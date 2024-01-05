package shape;

public class Shape {
    private double x, y;
    private String name;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;

    }

    static class ShapeNamePrinter {
        public static String printShapeName(Shape shape) {
            return "Shape name: " + shape.getName();
        }
    }

    public void drawShape() {
        //drawing...
    }
    public String getName() {
        return name;
    }
}
