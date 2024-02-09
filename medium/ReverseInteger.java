package medium;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));//0
        System.out.println(reverse(-2147483412));//-2143847412

    }

    public static int reverse(int x) {
        String x_input = String.valueOf(x);
        if(x < (-1 * Math.pow(2,31)) || x > (Math.pow(2,31)-1)) return 0;
        boolean sign = false;
        int result = 0;
        if(x < 0){
            sign = true;
            x = x * -1;
        }
        while(x > 0 ){
            if (result > (Integer.MAX_VALUE - x) / 10)
                return 0;
            result = result *10 + x % 10;
            x = x/10;
        }
        return sign ? (- result) : result;
    }

}
