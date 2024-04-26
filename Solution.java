public class Solution {
    public static void main(String[] args) {
        int n = 3; // Sample input
        int result = sumOfDivisorsInRange(n);
        System.out.println("Output: " + result);
    }

    public static int sumOfDivisorsInRange(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += sumOfDivisors(i);
        }
        return sum;
    }

    public static int sumOfDivisors(int i) {
        int sum = 0;
        for (int j = 1; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                if (i / j == j) { // If divisor is same, add once
                    sum += j;
                } else { // Otherwise, add both divisors
                    sum += j + i / j;
                }
            }
        }
        return sum;
    }
}
