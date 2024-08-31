package core.collections.map;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap instance
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding key-value pairs to the LinkedHashMap
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Orange", 5);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Mango", 15);

        // LinkedHashMap maintains the order of insertion
        System.out.println("LinkedHashMap contents:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Accessing an element doesn't change its position in the LinkedHashMap
        linkedHashMap.get("Banana");

        // Adding another element after accessing the map
        linkedHashMap.put("Grapes", 25);

        System.out.println("Updated LinkedHashMap contents:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        // output:
        // Apple -> 10
        // Orange -> 5
        // Banana -> 20
        // Mango -> 15
        // Grapes -> 25
    }
}
