public class Assessment {

        public static double square(int num) {
            return num * num;
        }

        public static int sum(int num1, int num2) {
            return num1 + num2;
        }

        public static double sum(double num1, double num2) {
            return num1 + num2;
        }

        public static double average(int[] numbers){
            double sum = 0;
            for (double number : numbers) {
                sum += number;
            }
            return (double) (sum / numbers.length);
        }


//        static ArrayList<User> users = new ArrayList<>();
//        public static void namesToLeet(ArrayList<User> users) {
//
//            User mike = new User("Michael", "Brisket", true);
//            users.add(mike);
//            User louis = new User("Louis", "Elrato", true);
//            users.add(louis);
//            User thomas = new User("Thomas", "Etienne", true);
//            users.add(thomas);
//
//            for (User user : users) {
//                String firstName = user.getFirstName();
//                String lastName = user.getLastName();

//                for (int i = 0; i < firstName.length(); i++){
//                    firstName = firstName.replace("L", "1");
//                    firstName = firstName.replace("l", "1");
//                    firstName = firstName.replace("E", "3");
//                    firstName = firstName.replace("e", "3");
//                    firstName = firstName.replace("T", "7");
//                    firstName = firstName.replace("t", "7");
//
//                    lastName = lastName.replace("L", "1");
//                    lastName = lastName.replace("l", "1");
//                    lastName = lastName.replace("E", "3");
//                    lastName = lastName.replace("e", "3");
//                    lastName = lastName.replace("T", "7");
//                    lastName = lastName.replace("t", "7");
//                }
//                System.out.println(firstName + " " + lastName);
//            }
//        }

        public static void main(String[] args) {
            System.out.println("square(5) = " + square(5));
            System.out.println("sum(5, 6) = " + sum(5, 6));
            System.out.println("sum(4.5, 3.2) = " + sum(4.5, 3.2));
            int[] myArray = {1, 2};
            System.out.println("average(myArray) = " + average(myArray));
//            namesToLeet(users);
        }


    }




