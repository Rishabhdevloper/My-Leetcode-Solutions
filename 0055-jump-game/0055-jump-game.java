class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int maxIndx=0;
        for(int i=0;i<n;i++){
            if(i>maxIndx)return false;
            maxIndx=Math.max(maxIndx,i+nums[i]);
        }
        return true;
    }
}