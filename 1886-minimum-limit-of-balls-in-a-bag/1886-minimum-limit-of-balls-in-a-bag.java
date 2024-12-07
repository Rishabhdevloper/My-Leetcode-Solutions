class Solution {
    public int minimumSize(int[] nums, int maxOps) {
        int low = 1, high = Arrays.stream(nums).max().getAsInt();
        System.out.println(high);
        while (low < high) {
            int mid = (low + high) / 2;
            int ops = 0;
            for (int n : nums) {
                ops += (n - 1) / mid;
            }
            if (ops <= maxOps) high = mid;
            else low = mid + 1;
        }
        return high;
    }
}