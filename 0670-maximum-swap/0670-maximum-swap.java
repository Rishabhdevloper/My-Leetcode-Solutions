class Solution {
    public int maximumSwap(int num) {
         char[] digits = Integer.toString(num).toCharArray();
        int[] last = new int[10]; // Array to record the last occurrence of each digit

        // Fill the last occurrence of each digit in the number
        for (int i = 0; i < digits.length; i++) {
            last[digits[i] - '0'] = i;
        }

        // Traverse the digits and try to swap with a larger digit from the right
        for (int i = 0; i < digits.length; i++) {
            // Check if there's a larger digit to the right that we can swap with
            for (int d = 9; d > digits[i] - '0'; d--) {
                if (last[d] > i) {
                    // Swap digits[i] and digits[last[d]]
                    char temp = digits[i];
                    digits[i] = digits[last[d]];
                    digits[last[d]] = temp;
                    return Integer.parseInt(new String(digits));
                }
            }
        }

        // If no swap can make the number larger, return the original number
        return num;
    }
}