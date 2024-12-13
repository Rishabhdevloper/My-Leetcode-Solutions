class Solution {
    public static void f(int mat[][],int ans[][],int i,int j){
        ArrayList<Integer>list=new ArrayList<>();
        int x=mat.length;
        int y=mat[0].length;
        int a=i;
        int b=j;
        while((a>=0&&a<x)&&(b>=0&&b<y)){
            list.add(mat[a][b]);
            a++;
            b++;
        }
        a=i;
        b=j;
        Collections.sort(list);
        for(int k=0;k<list.size();k++){
            ans[a][b]=list.get(k);
            a++;
            b++;
        }

    }
    public int[][] diagonalSort(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int ans[][]=new int[n][m];
        for(int j=0;j<m;j++){
             f(mat,ans,0,j);
        }
        for(int j=0;j<n;j++){
             f(mat,ans,j,0);
        }
        return ans;
    }
}