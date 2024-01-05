package shape;

public class Shape {
    private double x, y;
    private String name;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public void drawShape() {
        //drawing...
    }
    public String getName() {
        return name;
    }
}
