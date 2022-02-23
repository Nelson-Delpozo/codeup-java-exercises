package util;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.print("Enter a string: ");
        return this.scanner.nextLine();

    }

    public boolean yesNo() {
        System.out.print("yes or no? ");
        return this.scanner.nextLine().contains("y");
    }

    public int getInt(int min, int max) {
        int userInput;
        do {
            System.out.printf("Enter a number between %s and %s:  ", min, max);
            userInput = this.scanner.nextInt();
        } while (userInput <= min && userInput >= max);
        return userInput;
    }

    public int getInt() {
        System.out.println("Enter an integer: ");
        return this.scanner.nextInt();
    }


    public double getDouble(double min, double max) {
        double userInput;
        do {
            System.out.printf("Enter a double between %s and %s:  ", min, max);
            userInput = this.scanner.nextDouble();
        } while (userInput <= min && userInput >= max);
        return userInput;
    }

    public double getDouble() {
//        System.out.print("Enter a double: ");
        return this.scanner.nextDouble();
    }


}











