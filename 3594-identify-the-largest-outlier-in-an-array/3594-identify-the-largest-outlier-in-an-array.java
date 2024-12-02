import java.util.*;

class Solution {
    public int getLargestOutlier(int[] nums) {
        HashSet<Integer> isPresent = new HashSet<>();
        int tot = Arrays.stream(nums).sum();
        int res = -1001;

        
        for (int elem : nums) {
            int outlier = tot - 2 * elem;
            int sum = (tot - elem) / 2;

            
            if (isPresent.contains(outlier)) {
                res = Math.max(res, outlier);
            }
            if ((2 * sum + elem == tot) && isPresent.contains(sum)) {
                res = Math.max(res, elem);
            }

            isPresent.add(elem);
        }
        return res;
    }
}
