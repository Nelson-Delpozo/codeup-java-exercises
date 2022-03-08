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
//        System.out.println("Enter an integer: ");
        try {
            return Integer.parseInt(getString());
        }catch (NumberFormatException e){
            throw new NumberFormatException("Not an integer");
        }
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
        try {
            return Double.parseDouble(getString());
        }catch (NumberFormatException e){
            throw new NumberFormatException("Not a double");
        }
    }

    public int getBinary(){
        System.out.print("Enter a binary: ");
        String userInput = scanner.nextLine();
       return Integer.parseInt(userInput, 2);
    }

    public int getHex(){
        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();
        return (int) Long.parseLong(userInput, 16);
    }


}











