import java.util.Arrays;

class Solution {
    public static int f(int num){
        int sum = 0;
        while(num > 0){
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }

    public int maximumSum(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        // Store sum of digits and original number
        for(int i = 0; i < n; i++){
            arr[i][0] = f(nums[i]);
            arr[i][1] = nums[i];  // Store the number instead of index
        }

        // Sort by sum of digits, then by value in descending order
        Arrays.sort(arr, (a, b) -> (a[0] == b[0]) ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));

        int maxi = -1;
        for(int j = 1; j < n; j++){
            if(arr[j][0] == arr[j - 1][0]){
                maxi = Math.max(maxi, arr[j][1] + arr[j - 1][1]);
            }
        }
        return maxi;
    }
}
