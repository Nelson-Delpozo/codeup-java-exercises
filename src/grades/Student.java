package grades;

import java.util.ArrayList;

public class Student {

    private final String name;
    ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
              return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        return 0;
    }

    public static void main(String[] args) {

        Student newStudent = new Student("Bob", new ArrayList<>());
        newStudent.addGrade(50);
        newStudent.addGrade(80);
        newStudent.addGrade(90);
        System.out.println("newStudent = " + newStudent.name + "\ngrades: " + newStudent.grades);



    }

}
