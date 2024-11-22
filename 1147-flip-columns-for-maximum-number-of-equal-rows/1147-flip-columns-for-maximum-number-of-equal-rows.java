class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int cnt=0;
        int maxi=Integer.MIN_VALUE;
        for(int arr[]:matrix){
            cnt=0;
            int inverted[]=new int[m];
            for(int i=0;i<m;i++){
                inverted[i]=1-arr[i];
            }
            for(int rows[]:matrix){
                if(Arrays.equals(arr,rows)||Arrays.equals(inverted,rows))cnt++;
            }
            maxi=Math.max(cnt,maxi);
        }
        return maxi;
    }
}