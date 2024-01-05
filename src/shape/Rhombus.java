package shape;

import Border.Borderable;
import scale.ScalableShape;




public class Rhombus extends Shape implements Borderable {

    private String nameShape;
    private double width;
    private double height;
    public Rhombus(double x, double y, double width, double height, String nameShape) {
        super(x, y);
        this.width = width;
        this.height = height;
        this.nameShape = nameShape;
    }

    @Override
    public String getName() {
        return nameShape;
    }

    public String getNameShape() {
        return nameShape;
    }


    public void setNameShape(String nameShape) {
        this.nameShape = nameShape;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
