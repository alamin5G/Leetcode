public class PalindromeNumber9 {
    public boolean isPalindrome(int x) {
        String convertedToString = Integer.toString(x);
        if (convertedToString.equals(String.valueOf(new StringBuilder().append(convertedToString).reverse()))) {
            return true;
        }

        return false;
    }
}
