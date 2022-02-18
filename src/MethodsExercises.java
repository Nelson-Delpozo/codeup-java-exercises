public class MethodsExercises {

    public static void main(String[] args) {
//        System.out.println(sayHello("Nelson"));
        System.out.println(getPower(3,5));

    }



    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }



    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return (long) base * base;
        }
        return base * getPower(base, exponent - 1);
    }





}

