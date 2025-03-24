import java.util.*;

class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        
        List<int[]> result = new ArrayList<>();
        int x = meetings[0][0];
        int y = meetings[0][1];
        
        for (int i = 1; i < meetings.length; i++) {
            
            if (meetings[i][0] <= y) {
                y = Math.max(y, meetings[i][1]);
            } else {
               
                result.add(new int[]{x, y});
              
                x = meetings[i][0];
                y = meetings[i][1];
            }
        }
      
        result.add(new int[]{x, y});
        int answer=0;
        for(int i=1;i<result.size();i++){
            int[] second = result.get(i);
            int[] first = result.get(i-1);
           answer+=(second[0]-first[1]-1);
        }
       int arr[]= result.get(result.size()-1);
       int brr[]= result.get(0);
       answer+=(days-arr[1]);
        if(brr[0]>1){
            answer+=(brr[0]-1);
        }
       return answer;
    }
}
