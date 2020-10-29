import java.util.ArrayList;

public class sort {
	
	public static void sort(ArrayList<Number> list) {
		for(int i = 0; i < list.size() - 1; i++) {
			for(int j = 0; j < list.size() - 1; j++) {
				if(list.get(i).intValue() > list.get(i+1).intValue()) {
					int temp = list.get(i).intValue();
					list.set(i+1, list.get(i));
					list.set(i, temp);
				}
			}
		}
	}
}
