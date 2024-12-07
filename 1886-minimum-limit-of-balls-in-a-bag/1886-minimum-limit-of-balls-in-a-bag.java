class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
         int maxi=Integer.MIN_VALUE;
         int n=nums.length;
         for(int i=0;i<n;i++){
             maxi=Math.max(nums[i],maxi);
         }
         int low=1;
         int high=maxi;
         while(low<=high){
            int mid=(low+high)/2;
            int og=0;
            for(int i:nums){
                //Iska mtlb kitne operations mein nums[i]ko mid bna dengne
                    og+=(i-1)/mid;
            }
            if(og<=maxOperations)high=mid-1;
            else {
                low=mid+1;
            }
         }
         return low;
    }
}