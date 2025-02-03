class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int ans=1;
        int maxi=1;
        //Lets check the increasing subarray
        for(int i=1;i<n;i++){
           if(nums[i-1]<nums[i])ans++;
           else ans=1;
           maxi=Math.max(ans,maxi);
        }
        ans=1;
        for(int i=1;i<n;i++){
           if(nums[i-1]>nums[i])ans++;
           else ans=1;
           maxi=Math.max(ans,maxi);
        }
        return maxi;
    }
}