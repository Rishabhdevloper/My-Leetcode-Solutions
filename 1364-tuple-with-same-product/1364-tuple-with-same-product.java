import java.util.*;

class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productCount = new HashMap<>();
        int n = nums.length;
        int count = 0;

        // Step 1: Count occurrences of each product
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }

        // Step 2: Compute number of valid tuples
        for (int freq : productCount.values()) {
            if (freq > 1) {
                count += (freq * (freq - 1)) / 2 * 8; // Choose 2 pairs and multiply by 8 for permutations
            }
        }

        return count;
    }
}
