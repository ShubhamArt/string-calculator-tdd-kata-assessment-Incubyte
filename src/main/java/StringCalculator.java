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


        // Process each token
        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }

        return sum;
    }
}
