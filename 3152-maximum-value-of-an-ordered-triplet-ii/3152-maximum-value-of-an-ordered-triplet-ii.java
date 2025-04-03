class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long ans=0;
        long diff=0;
        long maxi=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,diff*nums[i]);
            diff=Math.max(diff,maxi-nums[i]);
            maxi=Math.max(maxi,nums[i]);
        }
        return ans;
    }
}