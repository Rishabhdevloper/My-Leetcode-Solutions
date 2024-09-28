class Solution {

    public static boolean valid(char[][]board,int a,int b){
        for (int i = 0; i < 9; i++) {
            // Skip checking the same cell in the row and column
            if (i != b && board[a][i] == board[a][b]) return false;
            if (i != a && board[i][b] == board[a][b]) return false;
        }

        // Check the 3x3 subgrid
        int startRow = 3 * (a / 3);
        int startCol = 3 * (b / 3);
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                // Skip checking the same cell in the subgrid
                if ((i != a || j != b) && board[i][j] == board[a][b]) return false;
            }
        }

        return true;
    }
       public static  boolean solve(char board[][]){
        int n=board.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]!='.'){
                    if(valid(board,i,j)==false){
                        return false;
                    }
                }
            }
        }
        return true;
       }



    public boolean isValidSudoku(char[][] board) {
       return solve(board);
    }
}