class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n < m) return "";  // Edge case: If s is smaller than t, return empty string

        int[] map = new int[128]; // To track frequency of characters in t
        for (char c : t.toCharArray()) {
            map[c]++;
        }

        int l = 0, r = 0; 
        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;
        int count = 0; // To track the number of matched characters

        while (r < n) {
            if (map[s.charAt(r)] > 0) {
                count++; // Increment count only if character is needed
            }
            map[s.charAt(r)]--; // Decrease the frequency
            r++; // Move right pointer
            
            // When a valid window is found
            while (count == m) {
                if (r - l < minLen) {
                    minLen = r - l; 
                    startIndex = l;
                }

                map[s.charAt(l)]++; // Restore the frequency of left char
                if (map[s.charAt(l)] > 0) {
                    count--; // Reduce matched count only if it's a required character
                }
                l++; // Shrink the window
            }
        }

        return (startIndex == -1) ? "" : s.substring(startIndex, startIndex + minLen);
    }
}
