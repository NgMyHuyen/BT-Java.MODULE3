/*package session14.BT1;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class StreamOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create an array of integers (for demonstration purposes, hardcoded)
        int[] numbers = {4, 7, 2, 9, 5, 8, 6, 3, 1, 10};

        // Step 2: Use Stream API to perform operations
        // Finding the maximum number in the array
        int maxNumber = Arrays.stream(numbers).max().orElseThrow();
        System.out.println("Max number: " + maxNumber);

        // Filtering even numbers
        List<Integer> evenNumbers = Arrays.stream(numbers)
                .filter(num -> num % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // Filtering numbers greater than a specified value (user input)
        System.out.print("Enter a number to filter by: ");
        int threshold = scanner.nextInt();
        List<Integer> filteredNumbers = Arrays.stream(numbers)
                .filter(num -> num > threshold)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Numbers greater than " + threshold + ": " + filteredNumbers);

        // Sum of all numbers
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of all numbers: " + sum);

        // Checking if any number is even
        boolean anyEven = Arrays.stream(numbers).anyMatch(num -> num % 2 == 0);
        System.out.println("Contains at least one even number: " + anyEven);

        // Creating a range of numbers from x to y
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        List<Integer> range = IntStream.rangeClosed(start, end)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Range from " + start + " to " + end + ": " + range);

        // Sorting strings alphabetically (convert to uppercase)
        System.out.print("Enter strings separated by spaces: ");
        scanner.nextLine(); // consume newline character
        String input = scanner.nextLine();
        List<String> sortedStrings = Arrays.stream(input.split("\\s+"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted strings in uppercase: " + sortedStrings);
    }
}*/
