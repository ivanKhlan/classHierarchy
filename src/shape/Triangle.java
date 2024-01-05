package shape;

import Border.Borderable;


public class Triangle extends Shape implements Borderable {

    private String nameShape;
    private double base;
    private double firstEdge;
    private double secondEdge;

    public static final int sumOfThreeAngles = 180;
    public Triangle(double x, double y, double base, double firstEdge, double secondEdge, String nameShape) {
        super(x, y);
        this.base = base;
        this.firstEdge = firstEdge;
        this.secondEdge = secondEdge;
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

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(double firstEdge) {
        this.firstEdge = firstEdge;
    }

    public double getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(double secondEdge) {
        this.secondEdge = secondEdge;
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
