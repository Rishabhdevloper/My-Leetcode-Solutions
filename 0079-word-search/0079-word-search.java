class Solution {
    public static boolean f(int indx,int vis[][],char board[][],String word,int row,int col){
        int n=board.length;
        int m=board[0].length;
        if(indx==word.length())return true;
        int delr[] = {-1, 0, +1, 0};
        int delc[] = {0, -1, 0, +1};
        for(int i=0;i<4;i++){
                int r=row+delr[i];
                int c=col+delc[i];
                if(r>=0&&r<n&&c>=0&&c<m&&vis[r][c]==0&&word.charAt(indx)==board[r][c]){
                    vis[r][c]=1;
                     if(f(indx+1,vis,board,word,r,c)){
                        return true;
                     }
                      vis[r][c]=0;
                }

            
        }
        return false;

    }

    
    public boolean exist(char[][] board, String word) {
          int indx=0;
          int n=board.length;
          int m=board[0].length;

          int vis[][]=new int[n][m];
          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(board[i][j]==word.charAt(indx)&&vis[i][j]==0){
                vis[i][j]=1;
               if(f(indx+1,vis,board,word,i,j)){
                  return true;
               }
               vis[i][j]=0;
               }
            }
          }
          return false;
         
    }
}