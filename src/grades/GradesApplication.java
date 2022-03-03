package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {


    public static void main(String[] args) {
        Scanner studentChoice = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();

        Student bill = new Student("Bill", new ArrayList<>());
        bill.addGrade(50);
        bill.addGrade(80);
        bill.addGrade(90);

        Student ted = new Student("Ted", new ArrayList<>());
        ted.addGrade(59);
        ted.addGrade(88);
        ted.addGrade(100);

        Student napoleon = new Student("Napoleon", new ArrayList<>());
        napoleon.addGrade(60);
        napoleon.addGrade(85);
        napoleon.addGrade(99);

        Student socrates = new Student("Socrates", new ArrayList<>());
        socrates.addGrade(57);
        socrates.addGrade(87);
        socrates.addGrade(93);

        students.put("ghBill", bill);
        students.put("ghTed", ted);
        students.put("ghNapoleon", napoleon);
        students.put("ghSocrates", socrates);

        System.out.println("Welcome!");
        System.out.println("Here are the github usernames of our students: ");

        for (String i : students.keySet()) {

            System.out.format("| %s | ", i);

        }

        do {
            System.out.println();
            System.out.print("What student would you like to see more information about (username or ALL)? ");
            String choice = studentChoice.nextLine();
            System.out.println("choice = " + choice);

            if(choice.equalsIgnoreCase("all")){
                System.out.println("hello from all");

                for (String student : students.keySet()){
                    System.out.format("Name: %s%n", students.get(student).getName());
                    System.out.format("GitHub username: %s%n", student);
                    System.out.printf("Grades: %s%n", students.get(student).grades);
                    System.out.format("Average: %s%n", students.get(student).getGradeAverage());
                    System.out.println();


                }

                System.out.print("Would you like to see info on someone else? [y/N]: ");
                String response = studentChoice.nextLine();
                if(response.equalsIgnoreCase("n")){
                    System.out.println("Thanks, and have a great day!");
                    return;
                }

            }

            else if (!students.containsKey(choice)) {
                System.out.println("Sorry, no student found with that gh username..");
            }

            for (String student : students.keySet()) {

                if (student.equals(choice)) {
                    System.out.format("Name: %s%n", students.get(student).getName());
                    System.out.format("GitHub username: %s%n", student);
                    System.out.printf("Grades: %s%n", students.get(student).grades);
                    System.out.format("Average: %s%n", students.get(student).getGradeAverage());
                    System.out.println();
                    System.out.print("Would you like to see info on someone else? [y/N]: ");
                    String response = studentChoice.nextLine();
                    if(response.equalsIgnoreCase("n")){
                        System.out.println("Thanks, and have a great day!");
                        return;
                    }
                }
            }
        }while(true);
    }
}
