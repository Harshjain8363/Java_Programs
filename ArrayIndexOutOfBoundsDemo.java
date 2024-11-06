public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        // Declare and initialize an array with 5 elements
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Loop through the array, deliberately going out of bounds
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println("Accessing element at index " + i + ": " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the ArrayIndexOutOfBoundsException and print an error message
            System.out.println("Error: Attempted to access index " + e.getMessage() + " which is out of bounds.");
        }

        System.out.println("Program continues after catching the exception.");
    }
}
