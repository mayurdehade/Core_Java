package core.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        // A Map stores elements in key-value pairs, and it doesn't allow duplicate keys.
        // If a key is added again, its associated value will be updated.

        // Creating a HashMap instance with keys and values of type String.
        Map<String, String> map = new HashMap<String, String>();

        // Adding key-value pairs to the map
        map.put("us", "United States");
        // Overriding the value for the key "us" with a new value
        map.put("us", "United States of America");
        map.put("in", "India");
        map.put("en", "England");

        // Printing the entire map
        // Output will be: {in=India, en=England, us=United States of America}
        System.out.println(map);

        // Checking if the map contains a specific key
        System.out.println(map.containsKey("in")); // Output: true

        // Checking if the map contains a specific value
        System.out.println(map.containsValue("India")); // Output: true

        // Retrieving the value associated with a specific key
        System.out.println(map.get("us")); // Output: United States of America

        // Adding a key-value pair only if the key is not already present
        map.putIfAbsent("in", "India2"); // This will not be added as "in" is already present
        map.putIfAbsent("jp", "Japan");  // This will be added as "jp" is not present
        map.putIfAbsent("jp2", "Japan"); // This will be added as "jp2" is not present

        // Printing the updated map
        // Output: {in=India, jp=Japan, en=England, jp2=Japan, us=United States of America}
        System.out.println(map);

        // Removing a key-value pair based on the key
        map.remove("jp2"); // This will remove the entry with key "jp2"
        // Attempting to remove an entry only if both key and value match
        map.remove("jp", "Jpan"); // This will not remove anything as the value doesn't match

        // Printing the updated map
        System.out.println(map);

        // Getting the value associated with a key, or returning a default value if the key is not present
        System.out.println(map.getOrDefault("jp", "JP")); // Output: Japan (key "jp" is present)
        System.out.println(map.getOrDefault("jp1", "JAPAN2")); // Output: JAPAN2 (key "jp1" is not present)

        // Creating a new map with more entries
        Map<String, String> newMap = new HashMap<String, String>();
        newMap.put("sl", "Sri Lanka");
        newMap.put("np", "Nepal");

        // Adding all entries from newMap to the original map
        map.putAll(newMap);

        // Printing the updated map after merging
        // Output: {np=Nepal, in=India, jp=Japan, en=England, sl=Sri Lanka, us=United States of America}
        System.out.println(map);

        // Replacing the value associated with a key
        map.replace("sl", "Shree Lanka"); // Replaces "Sri Lanka" with "Shree Lanka"

        // Replacing the value only if both key and old value match
        map.replace("in", "India", "Great India"); // Replaces "India" with "Great India"

        // Printing the final updated map
        System.out.println(map);

        // Getting a set view of the keys contained in the map
        ArrayList<String> keys = new ArrayList<String>(map.keySet());
        System.out.println(keys); // Output: [np, in, jp, en, sl, us]

        // Getting a collection view of the values contained in the map
        ArrayList<String> values = new ArrayList<String>(map.values());
        System.out.println(values); // Output: [Nepal, Great India, Japan, England, Shree Lanka, United States of America]

        // Getting a set view of the key-value pairs contained in the map
        // Map.Entry<String, String> is an interface representing a single key-value pair in the Map
        List<Map.Entry<String, String>> newList = new ArrayList<>(map.entrySet());
        System.out.println(newList); // Output: [np=Nepal, in=Great India, jp=Japan, en=England, sl=Shree Lanka, us=United States of America]
        
        // newList would be an ArrayList containing these entries in the form of Map.Entry objects, allowing you to access them like:
        Map.Entry<String, String> entry = newList.get(0);
        String key = entry.getKey();   // e.g., "us"
        String value = entry.getValue(); // e.g., "United States"
        
        System.out.println(key+" "+ value); //np Nepal
    
        
        //Traverse HashMap
        for(Map.Entry<String, String> entry2: map.entrySet()) {
        	System.out.println(entry2.getKey() + " : " + entry2.getValue());
        }
        
        //output:
		// np : Nepal
		// in : Great India
		// jp : Japan
		// en : England
		// sl : Shree Lanka
		// us : United States of America
    }
}
