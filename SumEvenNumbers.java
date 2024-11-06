import java.util.ArrayList;
import java.util.List;

public class SumEvenNumbers {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        
        // Add some numbers to the list
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);

        // Call the method to calculate the sum of even numbers
        int sum = calculateSumOfEvenNumbers(numbers);
        
        // Print the result
        System.out.println("The sum of all even numbers is: " + sum);
    }

    // Method to calculate the sum of even numbers
    public static int calculateSumOfEvenNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) { // Check if the number is even
                sum += number; // Add to the sum if it's even
            }
        }
        return sum;
    }
}
