class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        if(n==1)return 0;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid>0&&mid<n-1&&nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
               return mid;
            }
            if(mid==0){
                if(nums[mid]>nums[mid+1])return mid;
                else return mid+1;
            }
            if(mid==n-1){
                if(nums[mid]>nums[mid-1])return mid;
                else return mid-1;
            }
            if(nums[mid]>nums[mid-1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
}
}
