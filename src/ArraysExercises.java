public class ArraysExercises {

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = {new Person("Mr. Pink"), new Person("Mr. White"), new Person("Nice Guy Eddie")};

        for (int i = 0; i < people.length; i++) {
            System.out.println("people[" + i + "] = " + people[i].getName());
        }

    }




}










