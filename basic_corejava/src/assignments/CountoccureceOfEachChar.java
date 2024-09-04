package assignments;

import java.util.HashMap;
import java.util.Map;

public class CountoccureceOfEachChar {
    public static void main(String[] args) {
        String str = "JavaJJ";
        
        str = str.toLowerCase();
        
        str = str.replaceAll("[^a-zA-Z\\s]", "");
        
        String[] splitString = str.split("");
        
        Map<String, Integer> count = new HashMap<>();
        
        for (String s : splitString) {
            if (count.containsKey(s)) {
                count.put(s, count.get(s) + 1);
            } else {
                count.put(s, 1);
            }
        }

        System.out.println("Occurrences of each word:");
        
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
