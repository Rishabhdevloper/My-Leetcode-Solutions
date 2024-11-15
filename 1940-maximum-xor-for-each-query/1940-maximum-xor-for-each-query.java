class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int z = (1 << maximumBit) - 1; // Maximum value representable with maximumBit bits
        int n = nums.length;
        int[] answer = new int[n];
        int xor = 0;
        
        // Compute the cumulative XOR for the array
        for (int num : nums) {
            xor ^= num;
        }
        
        // Generate the answers in reverse order
        for (int i = 0; i < n; i++) {
            answer[i] = xor ^ z; // XOR the cumulative XOR with the maximum possible value
            xor ^= nums[n - 1 - i]; // Remove the last element's effect from the XOR
        }
        
        return answer;
    }
}
