class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
          int n=nums.length;
        int dif[]=new int[n+1];
        
        for(int arr[]:queries){
        int left=arr[0];
        int right=arr[1];
         dif[left]--;
         dif[right+1]++;
        }
        int current=0;
        for(int i=0;i<n;i++){
          current=current+dif[i];
          nums[i]+=current;
          if(nums[i]>0)return false;
        }
        return true;
    }
}