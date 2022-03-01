import java.util.Arrays;

public class ClassExerciseArrays {

    public static void main(String[] args) {
        String[] weatherTypes = new String[3];

        weatherTypes[0] = "rainy";
        weatherTypes[1] = "sunny";
        weatherTypes[2] = "cloudy";

        System.out.println(weatherTypes[1]);
        System.out.println("sumAll() = " + sumAll());
        System.out.println(Arrays.toString(sumOddAndEven()));
    }
//END OF MAIN

    public static int sumAll(){
        Integer[] nums = new Integer[5];
        Integer sum = 0;
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 15;
        nums[3] = 11;
        nums[4] = 8;

        for (Integer num : nums) {
            sum += num;
        }
        return sum;
    }


    public static int[] sumOddAndEven(){
        Integer[] numbers = new Integer[10];
        int sumOfEvens = 0;
        int sumOfOdds = 0;
        int[] finalArray = new int[2];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;

        for (Integer num : numbers) {
            if(num % 2 == 0){
                sumOfEvens += num;
            }else
            sumOfOdds += num;
        }
        finalArray[0] = sumOfOdds;
        finalArray[1] = sumOfEvens;
        return finalArray;
    }


//END OF CLASS
}
