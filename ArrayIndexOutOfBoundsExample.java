public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        // Declare and initialize an array with 5 elements
        int[] numbers = {10, 20, 30, 40, 50};

        // Intentionally access an out-of-bounds index
        try {
            // Loop through the array and attempt to access elements
            for (int i = 0; i <= numbers.length; i++) {  // Using <= will cause an out-of-bounds access
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception and print an error message
            System.out.println("Error: Attempted to access index " + e.getMessage() + " which is out of bounds.");
        }

        // Continue with the program after handling the exception
        System.out.println("Program continues after catching the exception.");
    }
}
