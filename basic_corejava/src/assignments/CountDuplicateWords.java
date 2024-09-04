package assignments;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWords {

	public static void main(String[] args) {
		int counter = 0;
		String str = "Java is platform independent. Java is multithreaded multithreaded";
		String [] splitString = str.split("\\s");

		Map<String, Integer> count = new HashMap<>();
		// map because it removes duplicates

		for(String s : splitString) {
			if(count.containsKey(s)) {
				count.put(s, count.get(s) + 1);
			}
			else {
				count.put(s, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry : count.entrySet()) {
			if(entry.getValue() > 1) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}