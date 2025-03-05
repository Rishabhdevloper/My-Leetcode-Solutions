class Solution {
     public static boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }
    public int numberOfCuts(int n) {
        if(isPowerOfTwo(n)){
            return (n/2);
        }
        else if(n%2!=0){
            return n;
        }
        //6 //12
        else{
            return n/2;
        }
        
    }
}