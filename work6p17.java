import java.util.Scanner;

public class work6p17 {
	public static void printMatrix(int n) {
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.print((int)(Math.random()*2)+" ");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer:");
		int n = input.nextInt();
		printMatrix(n);
	}
}
