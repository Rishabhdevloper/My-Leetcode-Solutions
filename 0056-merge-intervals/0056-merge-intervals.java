import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Sort the intervals based on the starting times
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        List<int[]> result = new ArrayList<>();
        int x = intervals[0][0];
        int y = intervals[0][1];
        
        for (int i = 1; i < intervals.length; i++) {
            // If the current interval overlaps with the previous one
            if (intervals[i][0] <= y) {
                y = Math.max(y, intervals[i][1]);
            } else {
                // Add the merged interval to the result
                result.add(new int[]{x, y});
                // Update x and y to the current interval
                x = intervals[i][0];
                y = intervals[i][1];
            }
        }
        // Add the last interval
        result.add(new int[]{x, y});
        
        // Convert the list of arrays into a 2D array and return
        return result.toArray(new int[result.size()][]);
    }
}
