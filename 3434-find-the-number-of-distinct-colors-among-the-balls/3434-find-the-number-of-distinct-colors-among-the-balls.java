import java.util.*;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> map = new HashMap<>();//Ball-Colour
        HashMap<Integer, Integer> countMap = new HashMap<>();//Colour-Count
        int n = queries.length;
        int[] ans = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            int x = queries[i][0];
            int y = queries[i][1];

            if (map.containsKey(x)) {
                int prevValue = map.get(x);
                countMap.put(prevValue, countMap.get(prevValue) - 1);
                if (countMap.get(prevValue) == 0) {
                    countMap.remove(prevValue);
                }
            }

            map.put(x, y);
            countMap.put(y, countMap.getOrDefault(y, 0) + 1);


            ans[i] = countMap.size();
        }

        return ans;
    }
}
