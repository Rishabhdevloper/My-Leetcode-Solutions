class Solution {
    public int minOperations(int[] nums, int k) {
      int ans=0;
      int n=nums.length;
      for(int i=0;i<n;i++){
        ans=ans^nums[i];
      }  
      int gautam=ans^k;
      int rishabh=Integer.bitCount(gautam);
      return rishabh;
    }
}