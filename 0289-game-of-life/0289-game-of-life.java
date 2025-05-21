class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        int vis[][]=new int[n][m];
        int cnt1=0; 
        int cnt0=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                cnt1=0;
                cnt0=0;
                int curr=board[i][j];
                int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
                int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
                for (int dir = 0; dir < 8; dir++) {
                int newX = i + dx[dir];
                int newY = j + dy[dir];
            // Check bounds
            if (newX >= 0 && newX < n && newY >= 0 && newY < m) {
                if(board[newX][newY]==0){
                cnt0++;
                }
                else{
                    cnt1++;
                }
            }

        }
        if(curr==0){
            if(cnt1==3){
                vis[i][j]=1;
            }
        }
        else{
            if(cnt1<2){
                vis[i][j]=0;
            }
            else if(cnt1==2||cnt1==3){
                vis[i][j]=1;
            }
            else if(cnt1>3){
                vis[i][j]=0;
            }


        }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j]=vis[i][j];
            }
        }
    }
}