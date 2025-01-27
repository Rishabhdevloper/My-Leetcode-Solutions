class Solution {
    public int search(int[] nums, int target) {
    int low=0;
    int high=nums.length-1;
    int ans=-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]==target)return mid;
        //sorted in left side 
        if(nums[mid]>=nums[low]){
             if(nums[low]<=target&&nums[mid]>=target){
                high=mid-1;
             }
             else{
                low=mid+1;
             }
        }
        else{
            if(nums[high]>=target&&nums[mid]<=target){
                low=mid+1;
             }
             else{
                high=mid-1;
             }
        }
        
    }
     return ans;
    }
}