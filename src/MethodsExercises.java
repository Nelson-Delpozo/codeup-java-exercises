public class MethodsExercises {

    public static void main(String[] args) {
        System.out.println(sayHello("Nelson"));
        System.out.println(getPower(3,5));
        System.out.println(addition(5,10));
        System.out.println(subtraction(5,10));
        System.out.println(multiplication(5,10));
        System.out.println(division(5,10));
        System.out.println(modulus(5,10));
        System.out.println(multiplicationWithLoop(5,10));
        System.out.println(multiplicationWithRecursion(10,67));

    }



    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }



    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return (long) base * base;
        }
        return base * getPower(base, exponent - 1);
    }

    public static long addition(int a, int b){
        return a + b;
    }

    public static long subtraction(long a, long b){
        return a - b;
    }

    public static long multiplication(long a, long b){
        return a * b;
    }

    public static long division(long a, long b){
        return a / b;
    }

    public static long modulus(long a, long b){
        return a % b;
    }

    public static long multiplicationWithLoop(int a, int b){
        int multiple = a;
        for (int i = a; i <= b; i++) {
            multiple += i;
        }return multiple;
    }

    public static long multiplicationWithRecursion(int a, int b){
        if(a == 0 || b == 0){
            return 0;
        }else if(a == 1){
            return b;
        }else if(b == 1){
            return a;
        }
        return a + multiplicationWithRecursion(a, b -1);
    }
}

