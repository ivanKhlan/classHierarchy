package shape;

import border.Borderable;


public class Circle extends Shape implements Borderable {

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

    @Override
    public double getBorderWidth() {
        return 0;
    }

    @Override
    public double getBorderHeight() {
        return 0;
    }
}
