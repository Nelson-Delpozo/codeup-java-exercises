import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.print("Enter an integer: ");
        int userInteger = scanner.nextInt();

        System.out.println("You entered: --> \"" + userInteger + "\" <--");

        System.out.print("Enter first word: ");
        String userFirstWord = scanner.next();
        System.out.print("Enter second word: ");
        String userSecondWord = scanner.next();
        System.out.print("Enter third word: ");
        String userThirdWord = scanner.next();

        System.out.println("You entered: --> \"" + userFirstWord + "\" <--");
        System.out.println("You entered: --> \"" + userSecondWord + "\" <--");
        System.out.println("You entered: --> \"" + userThirdWord + "\" <--");

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String userSentence = scanner2.nextLine();
        System.out.println("You said: " + userSentence);






    }




}
