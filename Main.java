import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] countArray = new int[9]; // Array to store the count of each value
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values between 1 and 9 (enter 0 to stop):");
        int value = scanner.nextInt();
        

        // Read values until 0 is entered
        while (value != 0) {
            if (value >= 1 && value <= 9) {
                // Increment the count of the corresponding value in the array
                countArray[value - 1]++;
            } else {
                System.out.println("Invalid input! Please enter a value between 1 and 9.");
            }

            // Read the next value
            value = scanner.nextInt();
        }

        // Print the counts for each value
        for (int i = 0; i < 9; i++) {
            System.out.println("Count of " + (i + 1) + ": " + countArray[i]);
        }

        scanner.close();
    }
}
