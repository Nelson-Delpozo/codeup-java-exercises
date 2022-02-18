import java.util.Scanner;

public class MethodsExercises {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println(sayHello("Nelson"));
//        System.out.println(getPower(3, 5));
//        System.out.println(addition(5, 10));
//        System.out.println(subtraction(5, 10));
//        System.out.println(multiplication(5, 10));
//        System.out.println(division(5, 10));
//        System.out.println(modulus(5, 10));
//        System.out.println(multiplicationWithLoop(5, 10));
//        System.out.println(multiplicationWithRecursion(10, 67));
//        System.out.println(factorial());
//        System.out.println(factorialWithRecursion());
        System.out.println(sayHello());

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

    public static long addition(int a, int b) {
        return a + b;
    }

    public static long subtraction(long a, long b) {
        return a - b;
    }

    public static long multiplication(long a, long b) {
        return a * b;
    }

    public static long division(long a, long b) {
        return a / b;
    }

    public static long modulus(long a, long b) {
        return a % b;
    }

    public static long multiplicationWithLoop(int a, int b) {
        int multiple = a;
        for (int i = a; i <= b; i++) {
            multiple += i;
        }
        return multiple;
    }

    public static long multiplicationWithRecursion(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else if (a == 1) {
            return b;
        } else if (b == 1) {
            return a;
        }
        return a + multiplicationWithRecursion(a, b - 1);
    }

    public static long factorial() {

            System.out.print("Enter a number between 1-10: ");
            int userInput = Integer.parseInt(scanner.nextLine());
            System.out.println("You entered: " + userInput);
            if (userInput > 10 | userInput < 1) {
                System.out.println("That's not between 1-10");
                factorial();
            }
            long factored = 1;
            for (long i = 1; i < userInput; i++) {
                factored *= (i + 1);
            }
            return factored;
    }

    public static long factorialWithRecursion(){
        long factor = 1;
        System.out.print("Enter a number between 1-10: ");
        int userInput = Integer.parseInt(scanner.nextLine());
        return factor * userInput;

    }

    public static String sayHello(){
        System.out.print("What's your name? ");
        String userInput = scanner.nextLine();
        return "Hello, " + userInput;
    }

//END OF MAIN CLASS
}

