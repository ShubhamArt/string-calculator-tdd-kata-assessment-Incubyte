import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    /**
     * Adds the numbers in the provided string.
     *
     * @param numbers a string containing numbers to be added
     * @return the sum of the numbers
     */
    public int add(String numbers) {
        // If the input string is empty, return 0
        if (numbers.isEmpty()) {
            return 0;
        }
        String delimiter = "[,\n]";

        // Check for custom delimiter
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf('\n');
            // Extract the custom delimiter
            delimiter = numbers.substring(2, delimiterIndex);
            // Remove the custom delimiter part
            numbers = numbers.substring(delimiterIndex + 1);
        }

        // Split the numbers using the delimiter
        String[] tokens = numbers.split(delimiter);
        int sum = 0;

        List<Integer> negatives = new ArrayList<>();

        // Process each token
        for (String part : tokens) {
            try {
                int number = Integer.parseInt(part);
                if (number < 0) {
                    negatives.add(number);
                } else {
                    sum += number;
                }
            } catch (NumberFormatException e) {
                // Handle the case where a part isn't a valid number
                throw new IllegalArgumentException("Invalid number format: " + part, e);
            }
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + String.join(", ", negatives.toString()));
        }

        return sum;
    }
}
