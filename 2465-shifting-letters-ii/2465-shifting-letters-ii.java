class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
       int n = s.length();
       int diff[] = new int[n];
       int m = shifts.length;
       
       for (int i = 0; i < m; i++) {
         int start = shifts[i][0];
         int end = shifts[i][1];
         int dir = shifts[i][2];

         if (dir == 0) {
            diff[start] += -1;
            if (end + 1 < n) {
                diff[end + 1] += 1;
            }
         } else {
             diff[start] += 1;
            if (end + 1 < n) {
                diff[end + 1] += -1;
            }
         }
       }

       // Compute prefix sum to get the final shift values
       for (int i = 1; i < n; i++) {
        diff[i] = diff[i - 1] + diff[i];
       }

       // Normalize values to stay within 0-25 range
       for (int i = 0; i < n; i++) {
         diff[i] = ((diff[i] % 26) + 26) % 26;  // Handles negative values properly
       }

       StringBuilder str = new StringBuilder();
       for (int i = 0; i < n; i++) {
         char newChar = (char) (((s.charAt(i) - 'a' + diff[i]) % 26) + 'a');
         str.append(newChar);
       }

       return str.toString();
    }
}
