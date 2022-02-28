package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {


    public static void main(String[] args){

        Input inputChoice = new Input();

        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the sci-fi category");
        System.out.print("Enter your choice: ");

        int choice = inputChoice.getInt();
        System.out.println("choice = " + choice);

        Movie[] movieArray = MoviesArray.findAll();
        System.out.println(Arrays.toString(movieArray));

        System.out.println(movieArray[0].getTitle() + " -- " + movieArray[0].getCategory());


    }



}
