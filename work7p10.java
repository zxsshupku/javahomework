import java.util.Scanner;

public class work7p10 {
	
	public static int indexOfSmallestElement(double[] array) {
		double min = array[0];
		int index = 0;
		for(int i = 1; i < 10; i++) {
			if(array[i] < min) {
				index= i;
				min = array[i];
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers:");
		double[] array = new double[10];
		for(int i = 0; i< 10; i++) {
			array[i] = input.nextDouble();
		}
		int index = indexOfSmallestElement(array);
		System.out.println("The index of the smallest element is "+ index);
	}
}
