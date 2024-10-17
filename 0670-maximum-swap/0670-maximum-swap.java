class Solution {
    public int maximumSwap(int num) {
        // Convert the number to a character array for easy manipulation
        char[] arr = Integer.toString(num).toCharArray();
        int n = arr.length;
        
        // Array to store the index of the largest digit from the right
        int[] maxIdx = new int[n];
        
        // Initialize the last position
        maxIdx[n - 1] = n - 1;
        
        // Fill the maxIdx array where maxIdx[i] holds the index of the largest digit to the right or at i
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[maxIdx[i + 1]]) {
                maxIdx[i] = i;
            } else {
                maxIdx[i] = maxIdx[i + 1];
            }
        }
        
        // Try to find the first position where a swap will increase the number
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[maxIdx[i]]) {
                // Swap the current digit with the largest possible digit
                char temp = arr[i];
                arr[i] = arr[maxIdx[i]];
                arr[maxIdx[i]] = temp;
                break;  // We only need to swap once, so break after the first swap
            }
        }
        
        // Convert the modified char array back to an integer and return
        return Integer.parseInt(new String(arr));
    }
}
