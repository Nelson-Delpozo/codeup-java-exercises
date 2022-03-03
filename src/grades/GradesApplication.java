package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student bill = new Student("Bill", new ArrayList<>());
        bill.addGrade(50);
        bill.addGrade(80);
        bill.addGrade(90);

        Student ted = new Student("Ted", new ArrayList<>());
        ted.addGrade(50);
        ted.addGrade(80);
        ted.addGrade(90);

        Student napoleon = new Student("Napoleon", new ArrayList<>());
        napoleon.addGrade(50);
        napoleon.addGrade(80);
        napoleon.addGrade(90);

        Student socrates = new Student("Socrates", new ArrayList<>());
        socrates.addGrade(50);
        socrates.addGrade(80);
        socrates.addGrade(90);

        students.put("ghBill", bill);
        students.put("ghTed", ted);
        students.put("ghNapoleon", napoleon);
        students.put("ghSocrates", socrates);





    }


}
