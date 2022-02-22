package util;

public class InputTest {


    public static void main(String[] args) {

    Input input = new Input();
        System.out.println("input.getString() = " + input.getString());
        System.out.println("input.yesNo() = " + input.yesNo());
        System.out.println("input.getInt(2, 50) = " + input.getInt(2, 50));
        System.out.println(input.getInt());
        System.out.println("input.getDouble(2.5, 50.5) = " + input.getDouble(2.5, 50.5));
        System.out.println(input.getDouble());

    }
}
