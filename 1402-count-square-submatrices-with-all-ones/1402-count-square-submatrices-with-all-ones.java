class Solution {
    public int countSquares(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int arr[][]=new int[n][m];
        for(int i=0;i<m;i++){
            arr[0][i]=matrix[0][i];
        }
        for(int i=0;i<n;i++){
            arr[i][0]=matrix[i][0];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0)arr[i][j]=0;
                else{
                    arr[i][j]=Math.min(arr[i][j-1],Math.min(arr[i-1][j],arr[i-1][j-1]))+1;
                }
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
        
    }
}