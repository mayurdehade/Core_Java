package core.collections.map;
import java.util.Map;
import java.util.TreeMap;

//TreeSet: Can contain only unique values and it is sorted in ascending order
//TreeMap: Can contain only unique keys and keys are sorted in ascending order.

//TreeMap sort the key in their natural order
public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap instance
        Map<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put("Apple", 10);
        treeMap.put("Orange", 5);
        treeMap.put("Banana", 20);
        treeMap.put("Mango", 15);

        // TreeMap sorts the keys in their natural order (lexicographical for strings)
        System.out.println("TreeMap contents:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        
    }
}
