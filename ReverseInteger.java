public class ReverseInteger {
    //https://leetcode.com/problems/reverse-integer/description/
    public int reverse(int x) {
        long sum = 0;
        while(x!=0){
            int rem = x % 10;
            sum = (sum * 10) + rem;
            x = x/10;
        }

        int max = Integer.MAX_VALUE;
        int low = Integer.MIN_VALUE;

        if (low <= sum && max>= sum) {
            return (int) sum;
        }else{
            return 0;
        }
    }
}