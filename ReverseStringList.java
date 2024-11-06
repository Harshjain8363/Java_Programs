import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringList {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");

        System.out.println("Original List: " + stringList);

        // Reverse the List
        Collections.reverse(stringList);

        System.out.println("Reversed List: " + stringList);
    }
}
