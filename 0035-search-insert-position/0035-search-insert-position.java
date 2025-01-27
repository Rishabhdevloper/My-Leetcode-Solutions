class Solution {
     private static int f(int[] arr, int start, int end, int key) {
        int low = start, high = (int) end;
        int ans=arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid]>=key) {
                ans=mid;
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return ans;
    }
    public int searchInsert(int[] nums, int target) {
         int answer=f(nums,0,nums.length-1,target);
         return answer;
        
        
        
    }
}