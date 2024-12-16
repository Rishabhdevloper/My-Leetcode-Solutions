class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n=nums.length;
        while(k>0){
            int mini=Integer.MAX_VALUE;
            int ans=-1;
            for(int i=0;i<n;i++){
                if(mini>nums[i]){
                    mini=Math.min(mini,nums[i]);
                    ans=i;
                }
            }
            nums[ans]=nums[ans]*multiplier;
            k--;
        }
        return nums;
    }
}