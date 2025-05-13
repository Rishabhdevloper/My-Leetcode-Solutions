class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int MOD = 1_000_000_007;

       
        long[] freq = new long[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

       
        for (int i = 0; i < t; i++) {
            long[] next = new long[26];

            for (int j = 0; j < 26; j++) {
                if (j == 25) { // 'z'
                    next[0] = (next[0] + freq[j]) % MOD; // 'a'
                    next[1] = (next[1] + freq[j]) % MOD; // 'b'
                } 
                else {
                    next[j + 1] = (next[j + 1] + freq[j]) % MOD;
                }
            }
            freq = next;
        }

        
        long total = 0;
        for (int i = 0; i < 26; i++) {
            total = (total + freq[i]) % MOD;
        }

        return (int) total;
    }
}
