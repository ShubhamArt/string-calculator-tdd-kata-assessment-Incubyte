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
        // Split the input by commas or new lines
        String[] tokens = numbers.split("[,\n]");
        int sum = 0;

        // Process each token
        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }

        return sum;
    }
}
