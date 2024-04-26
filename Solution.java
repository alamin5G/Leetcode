class Solution {
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
        }
        if (isLeftRightMatched(s, left, right)) {
            return palindrome(s, left+1, right-1);
        }
        
        return false;
    }

    public static boolean isLeftRightMatched(String s, int left, int right){
        if (s.charAt(left) == s.charAt(right)) {
            return true;
        }
        return false;
    }
}