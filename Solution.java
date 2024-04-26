import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            long n = scanner.nextLong();
            long reversedBits = reverseBits(n);
            System.out.println(reversedBits);
        }
        scanner.close();
    }

    public int reverse(int x) {
        

    }
   
    
}
