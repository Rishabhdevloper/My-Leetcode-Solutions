class Solution {
     private static int f(int[] arr, int start, int end, int key) {
        int low = start, high = (int) end;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1]>=target){
         int ans=f(nums,0,nums.length-1,target);
         return ans;
        }
        
        return nums.length; 
    }
}