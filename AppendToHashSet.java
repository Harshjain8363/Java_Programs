import java.util.HashSet;

public class AppendToHashSet {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Displaying the HashSet before appending
        System.out.println("HashSet before appending: " + set);

        // Appending a specified element to the HashSet
        set.add("Mango");

        // Displaying the HashSet after appending
        System.out.println("HashSet after appending: " + set);
    }
}
