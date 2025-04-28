class Solution {
    public static boolean f(int nums[],int k,int pages){
        int no=1;
        int pagesofst=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(pagesofst+nums[i]<=pages){
              pagesofst+=nums[i];  
            }
            else{
                no++;
                pagesofst=nums[i];
            }
        }
        return no<=k;
    }



    public int splitArray(int[] nums, int k) {
        int sm=0;
        int mini=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sm+=nums[i];
            mini=Math.max(nums[i],mini);
        }
        int low=mini;
        int high=sm;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(f(nums,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
         return ans;
    }
}