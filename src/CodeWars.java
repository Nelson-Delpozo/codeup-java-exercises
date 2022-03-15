public class CodeWars {

    public static int makeNegative(final int x) {
        int y;
        if(x == 0){
            return 0;
        }else if(x > 0){
            y = x - (x * 2);
            return y;
        }else return x;
    }

}
