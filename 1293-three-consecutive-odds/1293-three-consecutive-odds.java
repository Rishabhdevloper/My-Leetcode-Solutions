class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n=arr.length;
        if(n==1||n==2)return false;
        // n=4..i=0,1
        for(int i=0;i<n-2;i++){
           int a=arr[i]%2;
           int b=arr[i+1]%2;
           int c=arr[i+2]%2;
           if(a==1&&b==1&&c==1){
            return true;
           }

        }
        return false;
    }
}