class Solution {
    public int subarraySum(int[] nums, int k) {
          Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int N=nums.length;
        int count=0;
        map.put(0,1);
        for (int i = 0; i < N; i++) {
            //calculate the prefix sum till index i:
            sum += nums[i];

            // calculate the sum of remaining part i.e. x-k:
            int remove = sum - k;

            //Calculate the length and update maxLen:
           count += map.getOrDefault(remove, 0);

            // Update the count of prefix sum
            // in the map.
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            //Finally, update the map checking the conditions:
          
        }
        return count;

    }
    }
