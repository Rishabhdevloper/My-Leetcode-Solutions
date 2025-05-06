class Solution {
    static int M = 1000000007;

    public static long f(long a, long b) {
        if (b == 0) return 1;
        long half = f(a, b / 2) % M;
        long r = (half * half) % M;
        if (b % 2 == 1) {
            r = (r * a) % M;
        }
        return r;
    }

    public int countGoodNumbers(long n) {
        long x = f(5, (n + 1) / 2) % M;
        long y = f(4, n / 2) % M;
        return (int)((x * y) % M);
    }
}
