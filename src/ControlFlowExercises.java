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

        for(int p = 5; p <= 15; p += 1) {
            System.out.println("p is " + p);
        }

        for(int o = 2; o <= 100; o += 2) {
            System.out.println("o is " + o);
        }

        for(int x = 100; x >= -10; x -= 5) {
            System.out.println("x is " + x);
        }

        for(long w = 2; w < 1000000; w *= w) {
            System.out.println("w is " + w);
        }

    }
}


