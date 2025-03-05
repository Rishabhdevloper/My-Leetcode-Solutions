class Solution {
    public long coloredCells(int n) {
        long ans=1;
        long i=1;
         while(i<n){
            ans+=(4*i);
            i++;
         }
         return ans;
    }
}