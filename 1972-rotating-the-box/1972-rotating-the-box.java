class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int n=box.length;
        int m=box[0].length;
        char ans[][]=new char[m][n];
      
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=box[j][i];
            }
        }
        //Now swapping each row then it will be 90 degree rotated
        for(int i=0;i<m;i++){
            int start=0;
            int end=n-1;
            while(start<end){
                char temp=ans[i][start];
                ans[i][start]=ans[i][end];
                ans[i][end]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<n;i++){
             for(int j=m-1;j>=1;j--){
                if(ans[j][i]=='.'&&ans[j-1][i]=='#'){
                    char temp=ans[j][i];
                    ans[j][i]=ans[j-1][i];
                    ans[j-1][i]=temp;
                    }
                 
                 else if(ans[j][i]=='.'&&ans[j-1][i]=='.'){
                    int x=j-2;
                    while(x>=0){
                        if(ans[x][i]=='#'){
                          char temp=ans[x][i];
                          ans[x][i]=ans[j][i];
                          ans[j][i]=temp;
                        }
                        else if(ans[x][i]=='*'){
                            break;
                        }
                        x--;
                    }
                 }

                }
             }
             return ans;
        
        
        

    }
}