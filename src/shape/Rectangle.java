package shape;

import Border.Borderable;

public class Rectangle extends Shape implements Borderable {
    private double sideA;
    private double sideB;
    private String nameShape;
    public Rectangle(double x, double y, double sideA, double sideB, String nameShape) {
        super(x, y);
        this.sideA = sideA;
        this.sideB = sideB;
        this.nameShape = nameShape;
    }

    @Override
    public String getName() {
        return nameShape;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
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
