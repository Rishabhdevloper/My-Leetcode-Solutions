class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int neg=0;
         int pos=0;
         //Binary search for positive value
         int ans=-1;
         int que=-1;
         while(low<=high){
             int mid=(low+high)/2;
             if(nums[mid]>0){
                ans=mid;
                high=mid-1;
             }
             else{
                low=mid+1;
             }
         }
         int cntp=0;
         int cntn=0;
         
         if(ans!=-1){
            cntp=n-ans;
         }
         else{
            cntp=0;
         }
         low=0;
         high=n-1;
          while(low<=high){
             int mid=(low+high)/2;
             if(nums[mid]<0){
                que=mid;
               low=mid+1;
             }
             else{
                high=mid-1;
             }
         }
         if(que!=-1){
            cntn=que+1;
         }
         else{
            que=0;
         }
         
         int maxi=Math.max(cntp,cntn);
         return maxi;
    }
}