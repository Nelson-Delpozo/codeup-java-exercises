public class ControlFlowExercises {

    public static void main(String[] args) {

//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }

        int i = 5;
        while ( i <= 15){
            System.out.println("i is: " + i);
            i++;
        }

        int z = 2;
        do {
           System.out.println("z is: " + z);
            z += 2;
        }while(z <= 100);

        int b = 100;
        do {
            System.out.println("b is: " + b);
            b -= 5;
        }while(b >= -10);

        long s = 2;
        do {
            System.out.println("s is: " + s);
            s *= s;
        }while(s <= 1000000);






    }
}


