import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Declare a Stack
        Stack<Integer> stack = new Stack<>();

        // Store 10 elements into the Stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);  // Add elements 1 to 10
        }

        // Display the Stack before removal
        System.out.println("Stack before removing elements: " + stack);

        // Remove 4 elements from the Stack
        for (int i = 0; i < 4; i++) {
            stack.pop();  // Removes the top element
        }

        // Display the Stack after removal
        System.out.println("Stack after removing 4 elements: " + stack);
    }
}
