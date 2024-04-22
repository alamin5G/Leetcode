class Solution {

    public static void main(String[] args) {
        
        int max = Integer.MAX_VALUE;
        int low = Integer.MIN_VALUE;
        System.out.println("Out : " + reverse(1534236469));
        System.out.println("Max : " + max);
        System.out.println("Min : " + low);
    }

    public static int reverse(int x) {
        
        int reversedNum = doReverse(x);

       return reversedNum;
        
    }

    public static int doReverse(int actual){

        long sum = 0;
        while(actual!=0){
            int rem = actual % 10;
            sum = (sum * 10) + rem;
            actual = actual/10;
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