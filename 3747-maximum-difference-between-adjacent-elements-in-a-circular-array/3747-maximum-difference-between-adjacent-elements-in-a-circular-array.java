class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(i==n-1){
           int diff=Math.abs(nums[i]-nums[0]);
           int ciff=Math.abs(nums[i]-nums[i-1]);
                ans=Math.max(Math.max(diff,ciff),ans);
            }
            else{
                int diff=Math.abs(nums[i]-nums[i-1]);
                ans=Math.max(diff,ans);
            }
        }
        return ans;
    }
}