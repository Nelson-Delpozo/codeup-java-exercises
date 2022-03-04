package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private final String name;
    ArrayList<Integer> grades;
    HashMap<String, String> attendance;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
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
        double avg = 0;

        for (Integer grade : grades) {
            avg += grade;
        }

        return avg / grades.size();
    }

    public void recordAttendance(String date, String value){
        attendance.put(date, value);
    }

    public HashMap<String, String> getAttendance(){
        return attendance;
    }

    public static void main(String[] args) {

        Student newStudent = new Student("Bob", new ArrayList<>());
        newStudent.addGrade(50);
        newStudent.addGrade(80);
        newStudent.addGrade(90);
        newStudent.recordAttendance("2022-03-03", "P");
        System.out.println("newStudent = " + newStudent.name + "\ngrades: " + newStudent.grades);
        System.out.println("newStudent.getGradeAverage() = " + newStudent.getGradeAverage());
        System.out.println("newStudent.getAttendance() = " + newStudent.getAttendance());


    }

}
