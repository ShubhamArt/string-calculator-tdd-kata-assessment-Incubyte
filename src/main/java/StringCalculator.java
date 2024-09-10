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
        // If there is only one number, return that number
        return Integer.parseInt(numbers);
    }
}
