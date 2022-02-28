public class ClassExerciseArrays {

    public static void main(String[] args) {
        String[] weatherTypes = new String[3];

        weatherTypes[0] = "rainy";
        weatherTypes[1] = "sunny";
        weatherTypes[2] = "cloudy";

        System.out.println(weatherTypes[1]);
       sumAll();
    }


    public static void sumAll(){
        Integer[] nums = new Integer[5];
        int sum = 0;
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 15;
        nums[3] = 11;
        nums[4] = 8;

        for (Integer num : nums) {
            sum += num;
        }
        System.out.println(sum);
    }

}
