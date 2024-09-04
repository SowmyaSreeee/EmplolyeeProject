package assignments;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfWords {
    public static void main(String[] args) {
        String str = "Java is platform independent. Java is multithreaded, java is powerful!";
        
        str = str.toLowerCase();
        
        str = str.replaceAll("[^a-zA-Z\\s]", "");
        
        String[] splitString = str.split("\\s+");
        
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
