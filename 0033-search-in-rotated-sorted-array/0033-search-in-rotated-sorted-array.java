class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int ans=-1;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
             if(nums[mid]==target)return mid;
             else if(nums[low]>target&&nums[mid]>target&&nums[mid]>=nums[low]){
                low=mid+1;
             }
             else if(nums[low]<target&&nums[mid]<target&&nums[mid]>=nums[low]){
                low=mid+1;
             }
             else if (nums[low]>target&&nums[mid]<target&&nums[mid]<nums[low]){
                low=mid+1;
             }
             else{
                high=mid-1;
             }
               
             
        }
        return ans;
    }
}