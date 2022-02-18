import java.util.Scanner;



public class HighLow {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        guessMe();
    }


    public static void guessMe() {
        int guess;
        int guesses = 0;

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
                System.out.println("It took you " + guesses + " guesses");

            } else if (guess < numberToGuess) {
                System.out.println("Higher!");
                guesses++;
                System.out.println("Guesses so far: " + guesses);
            } else if(guess > numberToGuess) {
                System.out.println("Lower!");
                guesses++;
                System.out.println("Guesses so far: " + guesses);
            }
        }while(guess != numberToGuess);
    }
}
