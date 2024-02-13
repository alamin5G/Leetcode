import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        // Creating a HashMap
       Map<String, Integer> hasMap = new HashMap<>();

        // Adding key-value pairs
        hasMap.put("one", 1);
        hasMap.put("two", 2);
        hasMap.put("three", 3);

        // Displaying the HashMap

        System.out.println("HashMap list = " + hasMap.toString());
        int value = hasMap.get("two");
        System.out.println(value);

        // Iterating over entries
        for (Map.Entry<String, Integer> entry : hasMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " value = " + entry.getValue());
            
        }
    }
}