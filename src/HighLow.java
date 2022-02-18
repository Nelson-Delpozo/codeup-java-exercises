import java.util.Scanner;



public class HighLow {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        guessMe();
    }



    public static void guessMe() {
        int guess;
        long numberToGuess = Math.round((java.lang.Math.random() * 100 - 1) + 1);
        System.out.println(numberToGuess);

        do {
            System.out.print("Pick a number from 1-100: ");
            guess = Integer.parseInt(scanner.nextLine());
            System.out.println(guess);

            if (guess > 100 | guess < 1) {
                System.out.println("That's not between 1-100");
                guessMe();
            }
            if (guess == numberToGuess) {
                System.out.println("You got it!");
//                break;
            } else if (guess < numberToGuess) {
                System.out.println("Higher!");
            } else if(guess > numberToGuess) {
                System.out.println("Lower!");
            }
        }while(guess != numberToGuess);
    }
}
