import java.util.Scanner;


public class ControlFlowExercises {

    public static void main(String[] args) {

//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        Loop Basics
//
//        While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is: " + i);
//            i++;
//        }

//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536

//        int z = 2;
//        do {
//            System.out.println("z is: " + z);
//            z += 2;
//        } while (z <= 100);
//
//        int b = 100;
//        do {
//            System.out.println("b is: " + b);
//            b -= 5;
//        } while (b >= -10);
//
//        long s = 2;
//        do {
//            System.out.println("s is: " + s);
//            s *= s;
//        } while (s <= 1000000);

//        For
//        Refactor the previous two exercises to use a for loop instead.

//        for (int p = 5; p <= 15; p += 1) {
//            System.out.println("p is " + p);
//        }
//
//        for (int o = 2; o <= 100; o += 2) {
//            System.out.println("o is " + o);
//        }
//
//        for (int x = 100; x >= -10; x -= 5) {
//            System.out.println("x is " + x);
//        }
//
//        for (long w = 2; w < 1000000; w *= w) {
//            System.out.println("w is " + w);
//        }

//        Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print ???Fizz??? instead of the number.
//        For the multiples of five: print ???Buzz???.
//        For numbers which are multiples of both three and five: print ???FizzBuzz???.

//        for (int fizzBuzz = 1; fizzBuzz <= 100; fizzBuzz++) {
//            if (fizzBuzz % 3 == 0 && fizzBuzz % 5 == 0) {
//                System.out.println("FizzBuzz");
//
//            } else if (fizzBuzz % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (fizzBuzz % 3 == 0) {
//                System.out.println("Fizz");
//            }else System.out.println(fizzBuzz);
//        }

//        Display a table of powers.
//
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----
//                1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125

        Scanner scanner = new Scanner(System.in);


//        System.out.print("Enter an integer: ");
//        String userInput = scanner.nextLine();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//        String leftAlignFormat = "| %-6s | %-7d | %-6d |%n";
//
//        System.out.format("+-----------------+-------+%n");
//        System.out.format("| Number | Squared | Cubed |%n");
//        System.out.format("+-----------------+-------+%n");
//        int userInputInt = Integer.parseInt(userInput);
//        for (int i = 0; i <= userInputInt; i++) {
//            System.out.format(leftAlignFormat, i, i * i , i * i * i);
//        }
//        System.out.format("+-----------------+-------+%n");

        String confirm;
        do {
            System.out.print("Enter an grade(integer): ");
            String userGrade = scanner.nextLine();
            System.out.println("You entered: --> \"" + userGrade + "\" <--");
            int gradeInt = Integer.parseInt(userGrade);
            if (gradeInt >= 88) {
                System.out.println("You got an A!");
            } else if (gradeInt >= 80) {
                System.out.println("You got a B!");
            } else if (gradeInt >= 67) {
                System.out.println("You got a C!");
            } else if (gradeInt >= 60) {
                System.out.println("You got a D!");
            } else {
                System.out.println("You failed Bruh");
            }
            System.out.print("Try another grade?[y/N]: ");
            confirm = scanner.nextLine();
        }
        while (confirm.equals("y"));
    }
}
