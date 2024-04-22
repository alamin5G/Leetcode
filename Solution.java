class Solution {
<<<<<<< HEAD

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
=======
    public boolean isPalindrome(int x) {

        String palindrom = Integer.toString(x);
        int left = 0;
        int right = palindrom.length()-1;

        boolean b = palindrome(palindrom, left, right);

        return b;
        
    }

    public static boolean palindrome(String s, int left, int right){

        if (left >= right) {
            return true;
>>>>>>> 31f113f7eb843fd9d94dd506bfbeff7444d28be1
        }
        if (isLeftRightMatched(s, left, right)) {
            return palindrome(s, left+1, right-1);
        }
        
        return false;
    }

<<<<<<< HEAD
        int max = Integer.MAX_VALUE;
        int low = Integer.MIN_VALUE;

        if (low <= sum && max>= sum) {
            return (int) sum;
        }else{
            return 0;
        }
=======
    public static boolean isLeftRightMatched(String s, int left, int right){
        if (s.charAt(left) == s.charAt(right)) {
            return true;
        }
        return false;
>>>>>>> 31f113f7eb843fd9d94dd506bfbeff7444d28be1
    }

}