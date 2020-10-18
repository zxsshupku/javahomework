import java.util.Scanner;
public class work8p2 {
	
	public static double sumMajorDiagnoal(double[][] m) {
		double ans = 0;
		for(int i = 0; i < m[0].length; i++)
			ans = ans + m[i][i];
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row:");
		double[][] array = new double[4][4];
		for(int i = 0; i< 4; i++) {
			for(int j = 0; j < 4; j++) {
			array[i][j] = input.nextDouble();
			}
		}
		double ans = sumMajorDiagnoal(array);
		System.out.println("Sum of the elements in the major diagonal is "+ ans);
	}
}
