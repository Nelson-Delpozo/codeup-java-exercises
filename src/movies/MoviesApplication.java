package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input inputChoice = new Input();
        Movie[] movieArray = MoviesArray.findAll();

do {
    System.out.println("What would you like to do?");
    System.out.println("0 - exit");
    System.out.println("1 - view all movies");
    System.out.println("2 - view movies in the animated category");
    System.out.println("3 - view movies in the drama category");
    System.out.println("4 - view movies in the horror category");
    System.out.println("5 - view movies in the sci-fi category");
    System.out.println("6 - add a movie");
    System.out.print("Enter your choice: ");

    int choice = inputChoice.getInt();
    System.out.println("choice = " + choice);



    if (choice == 1) {

        for (Movie movie : movieArray) {
            System.out.println(movie.getTitle() + " -- " + movie.getCategory());
            System.out.println();
        }

    } else if (choice == 2) {

        for (Movie movie : movieArray) {
            if (movie.getCategory().equals("animated")) {
                System.out.println(movie.getTitle() + " -- " + movie.getCategory());
                System.out.println();
            }
        }

    } else if (choice == 3) {
        for (Movie movie : movieArray) {
            if (movie.getCategory().equals("drama")) {
                System.out.println(movie.getTitle() + " -- " + movie.getCategory());
                System.out.println();
            }
        }

    } else if (choice == 4) {

        for (Movie movie : movieArray) {
            if (movie.getCategory().equals("horror")) {
                System.out.println(movie.getTitle() + " -- " + movie.getCategory());
                System.out.println();
            }
        }

    } else if (choice == 5) {

        for (Movie movie : movieArray) {
            if (movie.getCategory().equals("sci-fi")) {
                System.out.println(movie.getTitle() + " -- " + movie.getCategory());
                System.out.println();
            }
        }
    }else if (choice == 6){
        Movie[] newArray = Arrays.copyOf(movieArray, movieArray.length + 1);
        System.out.print("Enter a title: ");
        String title = scanner.nextLine();
        System.out.print("Enter a category: ");
        String category = scanner.nextLine();
        Movie newMovie = new Movie(title, category);

        System.out.println(newMovie);
        newArray[newArray.length - 1] = newMovie;

        for (Movie value : newArray) {
            System.out.println(value.getTitle() + " -- " + value.getCategory());
        }



    }else if(choice == 0){
//        return;
        System.exit(0);
    }

}while(true);


    }


//    END OF MAIN





}
//END OF CLASS