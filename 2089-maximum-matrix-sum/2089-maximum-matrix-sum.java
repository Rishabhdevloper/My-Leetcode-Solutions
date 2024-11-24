class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long min=Long.MAX_VALUE;
        long sum=0;
        long cnt=0;
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=Math.abs(matrix[i][j]);
                if(matrix[i][j]<0)cnt++;
                min=Math.min(Math.abs(matrix[i][j]),min);
                
            }
        }
        if(cnt%2==1){
            return sum-(2*min);
        }

        return sum;
    }
}