class Solution {
    public int maxAscendingSum(int[] nums) {
      int n=nums.length;
      int sum=nums[0];
      int maxi=nums[0];
      for(int i=1;i<n;i++){
        if(nums[i]<=nums[i-1]){
            maxi=Math.max(sum,maxi);
            sum=nums[i];

        }
        else{
            sum+=nums[i];
        }
      }
      maxi=Math.max(maxi,sum);
      return maxi;

    }
}