import java.util.Date;

public class work9p3 {
	public static void main(String[] args) {
		long ms = 10000;
		Date date = new Date(ms);
		for(int i = 0; i < 8; i++) {
			date.setTime(ms);
			printDate(ms, date);
			ms = 10 * ms;
		}
	}
	
	public static void printDate(long ms, Date date) {
		System.out.println(date.toString());
	}
}
