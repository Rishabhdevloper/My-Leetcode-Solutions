import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Sort the intervals based on the starting times
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        List<List<Integer>> result = new ArrayList<>();
        int x = intervals[0][0];
        int y = intervals[0][1];
        
        for (int i = 1; i < intervals.length; i++) {
            // If the current interval overlaps with the previous one
            if (intervals[i][0] <= y) {
                y = Math.max(y, intervals[i][1]);
            }
             else {
                ArrayList<Integer>list=new ArrayList<>();
                list.add(x);
                list.add(y);
                result.add(list);
                // Update x and y to the current interval
                x = intervals[i][0];
                y = intervals[i][1];
            }
        }
        ArrayList<Integer>pist=new ArrayList<>();
        pist.add(x);
        pist.add(y);
        result.add(pist);
        // Add the last interval
        
        int ans[][]=new int[result.size()][2];
        for(int i=0;i<result.size();i++){
            ans[i][0]=result.get(i).get(0);
            ans[i][1]=result.get(i).get(1);
        }
        return ans;
        
        // Convert the list of arrays into a 2D array and return
        
    }
}
