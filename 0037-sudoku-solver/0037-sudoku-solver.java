class Solution {
    public static boolean valid(char[][]board,int a,int b,char c){
        for(int i=0;i<9;i++){
            if(board[a][i]==c)return false;
            if(board[i][b]==c)return false;
             int startRow = 3 * (a / 3);
             int startCol = 3 * (b / 3);
        for (int k = startRow; k < startRow + 3; k++) {
            for (int l = startCol; l < startCol + 3; l++) {
                // Skip checking the same cell in the subgrid
                if (( board[k][l]==c)) return false;
            }
        }

        }
        return true;
    }





    public static  boolean solve(char[][]board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        
                        if(valid(board,i,j,c)){
                            board[i][j]=c;
                            if(solve(board)==true){
                                return true;
                            }
                            else{
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
            
        }
        return true;
    }



   
    public void solveSudoku(char[][] board) {
        solve(board);
    }

}
