package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input input = new Input();

        System.out.println("Enter a radius: ");
        double userRadius = input.getDouble();
        Circle userCircle = new Circle(userRadius);

        System.out.println(userCircle);
        System.out.println("userCircle.getArea() = " + userCircle.getArea());
        System.out.println("userCircle.getCircumference() = " + userCircle.getCircumference());


    }





}
