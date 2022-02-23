package shapes;

public class Circle {
    private final double radius;


    public Circle(double radius) {
       this.radius =  radius;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;

    }

    public double getCircumference(){
        return this.radius * (2 * Math.PI);

    }

}
