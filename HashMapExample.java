import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Name", "John");
        map.put("City", "New York");
        map.put("Country", "USA");

        // Display the HashMap
        System.out.println("Initial HashMap: " + map);

        // Associate a specified value with a specified key
        String key = "Profession";
        String value = "Engineer";
        
        map.put(key, value);

        // Display the updated HashMap
        System.out.println("Updated HashMap: " + map);
    }
}
