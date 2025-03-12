class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int neg=0;
         int pos=0;
        for(int i=0;i<n;i++){
           if(nums[i]<0)neg++;
           if(nums[i]>0)pos++;
        }
        int maxi=Math.max(neg,pos);
        return maxi;
    }
}