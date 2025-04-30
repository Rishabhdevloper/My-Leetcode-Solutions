import java.util.*;

class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        Map<Integer, Integer> mp = new HashMap<>();
        int c = 1;

        for (int i = 0; i < n - 1; i++) {
            mp.put(i, c);
            if (nums[i + 1] - nums[i] > maxDiff) {
                c++;
            }
        }
        mp.put(n - 1, c);

        boolean[] ans = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0];
            int v = queries[i][1];
            ans[i] = mp.get(u).equals(mp.get(v));
        }

        return ans;
    }
}
