package assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatecharInString {

	public static void main(String[] args) {
		String str = "java";
		String[] chars = str.split("");
		System.out.println(Arrays.toString(chars));
		
		Map<String , Integer> map = new HashMap<>();
		
		for(String s : chars) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			}
			else {
				map.put(s,1);
			}
		}
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			if(m.getValue() == 1) {
				System.out.println(m.getKey());
			}
		}
		
	}
}
