public class Solution {

    public static void main(String[] args) {
        int x = 1221;

        System.out.println(isPalindrome(x));
    }


    public static boolean isPalindrome(int x) {
        String convertedToString = Integer.toString(x);
        if (convertedToString.equals(String.valueOf(new StringBuilder().append(convertedToString).reverse()))) {
            return true;
        }

        return false;
    }
}
