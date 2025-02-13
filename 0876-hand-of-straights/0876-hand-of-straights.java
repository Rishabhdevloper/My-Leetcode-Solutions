import java.util.*;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;

        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        
        // Count occurrences of each number
        for (int num : hand) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        while (!countMap.isEmpty()) {
            int first = countMap.firstKey();  
            
            
            for (int i = 0; i < groupSize; i++) {
                int num = first + i;
                if (!countMap.containsKey(num)) return false;  
                
                countMap.put(num, countMap.get(num) - 1);
                if (countMap.get(num) == 0) {
                    countMap.remove(num);
                }
            }
        }
        
        return true;
    }
}
