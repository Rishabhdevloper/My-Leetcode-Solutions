import java.util.*;

class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int n = nums.size();
        
        // Count frequencies
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

       
        int mostFrequent = -1;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
         int cmp=n/2;
         if( maxFrequency<=(cmp))return -1;
         boolean flag=false;
         int cnt=0;
         for(int i=0;i<nums.size();i++){
            if(nums.get(i)==  mostFrequent)cnt++;
            if(cnt>((i+1)/2)&& (maxFrequency-cnt)>(n-(i+1))/2){
                return i;
            }
         }

    return -1;
    }
}
