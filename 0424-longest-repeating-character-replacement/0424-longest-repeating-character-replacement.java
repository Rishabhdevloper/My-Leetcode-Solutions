import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length(), maxl = 0, ans = 0;
        int l = 0, r = 0; 
        HashMap<Character, Integer> count = new HashMap<>();

        while (r < n) {
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
            maxl = Math.max(maxl, count.get(s.charAt(r)));

            if ((r - l + 1) - maxl > k) {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }

            ans = Math.max(ans, r - l + 1);
            r++;
        }

        return ans;
    }
}
