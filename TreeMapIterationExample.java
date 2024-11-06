import java.util.Map;
import java.util.TreeMap;

public class TreeMapIterationExample {
    public static void main(String[] args) {
        // Create and populate a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        // Iterate using entrySet() with a for-each loop
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
