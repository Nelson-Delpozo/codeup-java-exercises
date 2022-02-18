import java.util.Scanner;

//Create a class named Bob with a main method for the following exercise.
//
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
//        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

public class Bob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, I'm Bob the lackadaisical teenager just hangin' out in the console. You can talk to me if you want. You can also say 'stop' to end this torturous conversation");

        do {
            String userInput = scanner.nextLine();

            if (userInput.length() == 0) {
                System.out.println("Fine, be that way!");
            } else if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out man");
            } else if(userInput.equalsIgnoreCase("stop")){
                break;
            }else {
                System.out.println("Whatever");
            }
        }while(true);
    }
}
