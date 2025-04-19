class Solution {
    public static int l(int nums[],int start,int end,int target){
        int n=nums.length;
        int ans=n;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>=target){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static int u(int nums[],int start,int end,int target){
        int n=nums.length;
        int ans=n;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>target){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n=nums.length;
        Arrays.sort(nums);
        long cnt=0;
        for(int i=0;i<n;i++){
            int indx1=l(nums, i+1,n-1,lower-nums[i]);
            int indx2=u(nums,i+1,n-1,upper-nums[i]);
            cnt+=(indx2-indx1);
        }
        return cnt;
    }
}