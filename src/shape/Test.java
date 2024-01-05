package shape;

public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle(10,5, 2,"circle");
        Shape rhombus = new Rhombus(30, 40, 10,20,"rhombus");
        Shape triangle = new Triangle(5,5,10,10,5,"triangle");
        Shape rectangle = new Rectangle(10, 10 ,5,5,"rectangle");
        Shape point = new Point(5,5,"point");

        System.out.println(Shape.ShapeNamePrinter.printShapeName(circle));
        System.out.println(Shape.ShapeNamePrinter.printShapeName(rhombus));
        System.out.println(Shape.ShapeNamePrinter.printShapeName(triangle));
        System.out.println(Shape.ShapeNamePrinter.printShapeName(rectangle));
        System.out.println(Shape.ShapeNamePrinter.printShapeName(point));
    }
}
