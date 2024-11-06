public class PrintArrayElements {
    public static void main(String[] args) {
        // Declare and initialize an array with 100 elements
        int[] numbers = new int[100];

        // Populate the array with numbers from 1 to 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; // Filling the array with values from 1 to 100
        }

        // Print the elements of the array
        System.out.println("Array elements from 1 to 100:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
