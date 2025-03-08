class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int whiteCount = 0, minWhite = Integer.MAX_VALUE;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') whiteCount++;
        }
        minWhite = whiteCount; 

        for (int i = k; i < n; i++) {
           
            if (blocks.charAt(i - k) == 'W') whiteCount--;
          
            if (blocks.charAt(i) == 'W') whiteCount++;
          
            minWhite = Math.min(minWhite, whiteCount);
        }

        return minWhite;
    }
}
