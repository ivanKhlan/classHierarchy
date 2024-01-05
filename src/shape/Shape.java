package shape;

public class Shape {
    private double x, y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void drawShape() {
        //drawing...
    }


    public void printNameShape(String nameShape) {
        System.out.println(nameShape);
    }
}
