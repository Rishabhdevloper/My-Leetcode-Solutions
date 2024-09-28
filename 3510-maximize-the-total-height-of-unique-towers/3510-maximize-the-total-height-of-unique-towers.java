import java.util.*;

class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        // Sort the array in descending order
        Arrays.sort(maximumHeight);
        int n = maximumHeight.length;
        
        // Traverse from the largest to the smallest
        long sum = maximumHeight[n - 1];
        int prev = maximumHeight[n - 1]; // Store the last valid unique height

        for (int i = n - 2; i >= 0; i--) {
            // Ensure the current element is strictly less than the previous one
            if (maximumHeight[i] >= prev) {
                maximumHeight[i] = prev - 1;
            }
            if (maximumHeight[i] <= 0) {
                return -1;  // If any height becomes zero or negative, return -1
            }
            sum += maximumHeight[i];
            prev = maximumHeight[i];  // Update the previous unique value
        }

        return sum;
    }
}
