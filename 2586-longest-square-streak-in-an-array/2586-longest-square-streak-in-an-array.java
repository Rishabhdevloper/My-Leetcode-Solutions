class Solution {
    public int longestSquareStreak(int[] nums) {
      int n=nums.length;
      HashSet<Integer>set=new HashSet<>();
      for(int i=0;i<n;i++){
        set.add(nums[i]);
      }
      Arrays.sort(nums);
     long maxi=-1;
      boolean flag=false;
      for(int i=0;i<n;i++){
        long curr=nums[i];
        long count=1;
        while(set.contains((int)Math.pow(curr,2))){
            flag=true;
            count++;
            curr=(long)Math.pow(curr,2);
        }   
        maxi=Math.max(count,maxi);    
      }

      if(flag){
        return (int)maxi;
      }
      return -1;
    }
}