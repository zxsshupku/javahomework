import java.util.Scanner;

public class work6p4 {
	public static int reverse(int number) {
	    int rev = 0;
	    while (number != 0) {
		    rev = rev * 10 + number % 10;
		    number = number / 10;
	    }
	    return rev;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer:");
		int number = input.nextInt();
		int ans = reverse(number);
		System.out.println("The reverse is " + ans);
	}
}