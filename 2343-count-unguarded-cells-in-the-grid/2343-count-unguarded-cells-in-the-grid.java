class Solution {

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int arr[][]=new int[m][n];
        for(int i=0;i<guards.length;i++){
            int x=guards[i][0];
            int y=guards[i][1];
            arr[x][y]=1;//G
        }
        for(int i=0;i<walls.length;i++){
            int x=walls[i][0];
            int y=walls[i][1];
            arr[x][y]=2;//W
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    for(int k=i-1;k>=0;k--){
            if(arr[k][j]==2||arr[k][j]==1)break;
            else{
                arr[k][j]=-1;
            }
        }
        //Downwards
        for(int k=i+1;k<m;k++){
            if(arr[k][j]==2||arr[k][j]==1)break;
            else{
                arr[k][j]=-1;
            }
        }
        //east
        for(int k=j-1;k>=0;k--){
            if(arr[i][k]==1||arr[i][k]==2){
                break;
            }
            else{
                arr[i][k]=-1;
            }
        }
        //west
        for(int k=j+1;k<n;k++){
            if(arr[i][k]==1||arr[i][k]==2)break;
            else{
                arr[i][k]=-1;
            }
        }
                }
            }
        }
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0)cnt++;
            }

        }
        return cnt;
        
    }
}