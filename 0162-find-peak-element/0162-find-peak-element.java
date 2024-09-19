class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
       int low=1;
       int high=nums.length-2;
       if(nums.length==1)return 0;
       if(nums.length==2){
        if(nums[0]>nums[1]){
            return 0;
        }
        else{
            return 1;
        }
       }
       int indx=0;
       if(nums[0]>nums[n-1]){
           indx=0;
       }
       else{
        indx=n-1;
       }
       while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                if(nums[indx]>nums[mid])return indx;
              return mid;  
            }
            
            if(nums[mid]>nums[mid-1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
       }
        if(nums[0]>=nums[n-1]){
           return 0;
       }
       if(nums[0]<nums[n-1])return n-1;

       

        return -1;
}
}
