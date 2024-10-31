public class CumulativeSum {

    // Method to compute cumulative sum of each parameter and the total sum
    public static int cumulativeSum(int... numbers) {
        int totalSum = 0;
        
        for (int num : numbers) {
            int cumulativeSum = 0;
            // Calculate the cumulative sum for the current parameter
            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
            }
            System.out.println("Cumulative sum for " + num + ": " + cumulativeSum);
            // Add the cumulative sum to the total sum
            totalSum += cumulativeSum;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        // Example usage
        int total = cumulativeSum(4, 5, 10);
        System.out.println("Total cumulative sum: " + total);
    }
}