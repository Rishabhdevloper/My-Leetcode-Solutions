class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100];  
        int ans = 0;
        for (int[] domino : dominoes) {
            int x = domino[0];
            int y = domino[1];
            int key = Math.min(x, y) * 10 + Math.max(x, y);
            ans += count[key];  
            count[key]++;
        }
        return ans;
    }
}
