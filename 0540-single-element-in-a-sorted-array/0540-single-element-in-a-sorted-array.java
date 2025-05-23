class Solution {
    public int singleNonDuplicate(int[] nums) {
         int n=nums.length;
         if(n==1)return nums[0];
         if(nums[0]!=nums[1])return nums[0];
         if(nums[n-1]!=nums[n-2])return nums[n-1];
         int low=0;
         int high=n-1;
         while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1])return nums[mid];
            if(mid%2==0){
                if(nums[mid]==nums[mid+1]){
                    low=mid+2;
                }
                else{
                    high=mid;
                }
            }
            else{
                if(nums[mid]==nums[mid-1]){
                    low=mid+1;
                }
               else{
                 high=mid;
               }
            }
         }

       return -1;  
    }
}