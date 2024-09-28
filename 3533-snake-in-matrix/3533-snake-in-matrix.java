class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int arr[][]=new int[n][n];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=count;
                count++;
            }
        }
        int k=0;
        int j=0;
        for(int i=0;i<commands.size();i++){
            if(commands.get(i).equals("RIGHT")){
                j++;
            }
            if(commands.get(i).equals("LEFT")){
                j--;
            }
            if(commands.get(i).equals("UP")){
                k--;
            }
            if(commands.get(i).equals("DOWN")){
                k++;
            }
        }
        return arr[k][j];
    }
}