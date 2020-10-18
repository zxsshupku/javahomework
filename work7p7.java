
public class work7p7 {
	public static void main(String[] args) {
		int a;
		int[] count = new int[10];
		for(int i = 0; i < 100; i++) {
			a = (int)(Math.random()*10);
			count[a]++;
		}
		for(int j = 0; j < 10; j++) {
			System.out.print(count[j]+" ");
		}
	}
}
