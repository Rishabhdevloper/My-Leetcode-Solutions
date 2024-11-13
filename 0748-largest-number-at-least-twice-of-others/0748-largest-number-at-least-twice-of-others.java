class Solution {
    public int dominantIndex(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int maxi1 = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (maxi < nums[i]) {
                maxi = nums[i];
                index = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (maxi1 < nums[i] && nums[i] < maxi) {
                maxi1 = nums[i];

            }
        }
        System.out.print(maxi1);
        return 2 * maxi1 <= maxi ? index : -1;

    }
}