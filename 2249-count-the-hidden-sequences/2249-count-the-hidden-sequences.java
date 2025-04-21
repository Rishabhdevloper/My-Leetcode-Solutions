class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        
        int maxi=0;
        int mini=0;
        int n=differences.length;
        int first=0;
        for(int i=0;i<n;i++){
            first=first+differences[i];
            maxi=Math.max(maxi,first);
            mini=Math.min(mini,first);
            if((upper-maxi)-(lower-mini)+1<=0){
                return 0;
            }
        }
     return (upper-maxi)-(lower-mini)+1;
    }
}