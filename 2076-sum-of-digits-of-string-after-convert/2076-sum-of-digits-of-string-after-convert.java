class Solution {
    public int getLucky(String s, int k) {
        // Step 1: Convert the string to the corresponding number
        StringBuilder number = new StringBuilder();
        for (char x : s.toCharArray()) {
            number.append(x - 'a' + 1);
        }

        // Step 2: Perform k iterations of summing digits
        String numStr = number.toString();
        int sum=0;
        while (k > 0) {
             sum = 0;
            // Sum the digits of the number represented as a String
            for (char c : numStr.toCharArray()) {
                sum += c - '0'; // Convert character to its integer value
            }
            numStr = Integer.toString(sum); // Convert sum back to String
            k--;
        }

        // The result is now a single digit number
        return sum;
    }
}
