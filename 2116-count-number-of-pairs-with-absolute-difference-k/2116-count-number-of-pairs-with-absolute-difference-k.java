class Solution {
    public int countKDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(map.containsKey((nums[i]-k))){
              cnt+=map.get((nums[i]-k));
            }
            if(map.containsKey((nums[i]+k))){
              cnt+=map.get((nums[i]+k));
            }
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
        }
   return cnt;
    }
}