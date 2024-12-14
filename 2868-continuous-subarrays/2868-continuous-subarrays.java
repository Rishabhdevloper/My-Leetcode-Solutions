import java.util.*;

class Solution {
    public long continuousSubarrays(int[] nums) {
        int n = nums.length;
        long count = 0;
        int i = 0; // Left pointer
        TreeMap<Integer, Integer> freqMap = new TreeMap<>();

        for (int j = 0; j < n; j++) {
            // Add current element to the frequency map
            freqMap.put(nums[j], freqMap.getOrDefault(nums[j], 0) + 1);

            // While the difference between max and min exceeds 2, shrink the window
            while (freqMap.lastKey() - freqMap.firstKey() > 2) {
                freqMap.put(nums[i], freqMap.get(nums[i]) - 1);
                if (freqMap.get(nums[i]) == 0) {
                    freqMap.remove(nums[i]);
                }
                i++; // Move left pointer
            }

            // All subarrays ending at j are valid
            count += (j - i + 1);
        }

        return count;
    }
}
