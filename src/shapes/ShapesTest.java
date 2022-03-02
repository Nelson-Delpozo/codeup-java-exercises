package shapes;

public class ShapesTest {

    public static void main(String[] args) {


        Measurable myShape = new Square(5, 10);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

        Measurable myOtherShape = new Rectangle(10, 15);
        System.out.println("myOtherShape.getArea() = " + myOtherShape.getArea());
        System.out.println("myOtherShape.getPerimeter() = " + myOtherShape.getPerimeter());



//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println("box1.getArea() = " + box1.getArea());
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//
//        Square box2 = new Square(7);
//        System.out.println("box2.getArea() = " + box2.getArea());
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());

    }



}
