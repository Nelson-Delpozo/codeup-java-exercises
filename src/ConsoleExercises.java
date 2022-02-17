import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.print("Enter an integer: ");
        int userInteger = scanner.nextInt();

        System.out.println("You entered: --> \"" + userInteger + "\" <--");

        System.out.print("Enter three words: ");
        String userFirstWord = scanner.next();
        String userSecondWord = scanner.next();
        String userThirdWord = scanner.next();

        System.out.printf(userFirstWord + "%n" + userSecondWord + "%n" + userThirdWord + "%n");


        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String userSentence = scanner2.nextLine();
        System.out.println("You said: " + userSentence);


        System.out.print("Enter width: ");
        String userWidth = scanner2.nextLine();
        System.out.print("Enter length: ");
        String userLength = scanner2.nextLine();
        System.out.print("Enter length: ");
        String userHeight = scanner2.nextLine();
//        System.out.print("Enter a sentence: ");
//        String userSentence = scanner2.nextLine();
        float userWidthInt = Float.parseFloat(userWidth);
        float userLengthInt = Float.parseFloat(userLength);
        float userHeightInt = Float.parseFloat(userHeight);

        System.out.printf("The area of your room is: %.2f%s%n", (userLengthInt * userWidthInt), " square feet");
        System.out.printf("The perimeter of your room is: %.2f%s%n", (userLengthInt * 2) +( userWidthInt * 2), " linear feet");
        System.out.printf("The volume of your room is: %.2f%s%n", (userLengthInt * userWidthInt * userHeightInt), " cubic feet");





    }


}
