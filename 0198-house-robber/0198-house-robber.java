class Solution {
    public int f(int indx,int nums[],int dp[]){
        if(indx==0)return nums[indx];
        if(indx<0)return 0;
        if(dp[indx]!=-1)return dp[indx];
        int pick=nums[indx]+f(indx-2,nums,dp);
        int npick=0+f(indx-1,nums,dp);
        return dp[indx]=Math.max(pick,npick);
    }





    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return f(n-1,nums,dp);
    }
}