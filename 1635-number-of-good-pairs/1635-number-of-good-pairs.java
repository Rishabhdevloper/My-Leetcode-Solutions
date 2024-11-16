class Solution {
    public int numIdenticalPairs(int[] nums) {
         int  n=nums.length;
         HashMap<Integer,Integer>map=new HashMap<>();
         int cnt=0;
       for(int i=0;i<n;i++){
        
           int counter=map.getOrDefault(nums[i], 0);
           if(counter>0){
            cnt+=counter;
           }
           map.put(nums[i],counter+1);
       }
       return cnt;
        }
}