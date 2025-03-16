import java.util.Arrays;

class Solution {
    public static boolean f(int ranks[], int cars, long mid) {
        long cntcar = 0;
        for (int i = 0; i < ranks.length; i++) {
            if (cntcar >= cars) {
                break;
            }
            cntcar += fn(ranks[i], mid);
        }
        return cntcar >= cars;
    }

    public static long fn(int r, long mid) {
        int low = 1;
        int high = (int) Math.sqrt(mid / r); // Fix overflow issue
        long bhej = 0;

        while (low <= high) {
            int mi = (low + high) / 2;
            if ((long) r * mi * mi <= mid) { // Fix integer overflow
                bhej = mi;
                low = mi + 1;
            } else {
                high = mi - 1;
            }
        }
        return bhej;
    }

    public long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks);
        long low = 0;
        long high = (long) ranks[0] * cars * cars; // Adjusted upper bound
        long ans = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            if (f(ranks, cars, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
