class Solution {
     private int lowerBound(int[] nums, int start, int end, int target) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    // Java equivalent of upper_bound in C++
    private int upperBound(int[] nums, int start, int end, int target) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }





    public long countFairPairs(int[] nums, int lower, int upper) {
       //pehle apan lowerbound nikalenge
       Arrays.sort(nums);
       int n=nums.length;
       long result=0;
      for(int i=0;i<n;i++){
          long indx1=lowerBound(nums,i+1,n,lower-nums[i]);
          long indx2=upperBound(nums,i+1,n,upper-nums[i]);
          long x=indx1-i-1;
          long y=indx2-i-1;
          result+=(y-x);
      }
       return result;
    }
}