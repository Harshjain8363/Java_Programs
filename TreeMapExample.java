import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add some key-value pairs to the TreeMap
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        // Display the initial TreeMap
        System.out.println("Initial TreeMap: " + treeMap);

        // Remove the entry with the specified key
        String keyToRemove = "Two";
        Integer removedValue = treeMap.remove(keyToRemove);
        
        // Check if the entry is removed and display the removed value
        if (removedValue != null) {
            System.out.println("Removed value = " + removedValue);
        } else {
            System.out.println("No entry found with the key: " + keyToRemove);
        }

        // Check if another entry (key "Three") exists in the TreeMap
        String checkKey = "Three";
        boolean isKeyPresent = treeMap.containsKey(checkKey);
        System.out.println("Is the entry {" + checkKey + "=3} removed? " + !isKeyPresent);

        // Display the updated TreeMap
        System.out.println("Updated TreeMap: " + treeMap);
    }
}
