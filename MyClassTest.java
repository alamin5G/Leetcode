import java.util.Scanner;

public class MyClassTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(Math.sqrt(n));

    }


    public static String isPrime(int num) {
		//Your code goes here

	// Write your code here.
		int x = num;
		if(x<=1){
			return "NO";
		}else{
			for(int i=2; i<=Math.sqrt(num); i++){
				if(x%i==0){
					return "NO";
				}
			}
		}
		
		return "YES";
	}
}
