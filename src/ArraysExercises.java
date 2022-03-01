import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = {new Person("Mr. Pink"), new Person("Mr. White"), new Person("Nice Guy Eddie")};

        for (int i = 0; i < people.length; i++) {
            System.out.println("people[" + i + "] = " + people[i].getName());
        }

        Person[] people1 = Arrays.copyOf(people, people.length + 1);
        System.out.println("people1 = " + Arrays.toString(people1));
        people1[3] = new Person("Mr. Yellow");
        System.out.println("people1 = " + Arrays.toString(people1));

        for (int i = 0; i < people1.length; i++) {
            System.out.println("people1[" + i + "] = " + people1[i].getName());
        }


    }
    //        END OF MAIN






//END OF CLASS
}










