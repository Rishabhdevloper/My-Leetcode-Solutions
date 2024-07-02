class Pair{
    int row;
    int col;
    int time;
    Pair(int _row,int _col,int _time){
        this.row=_row;
        this.col=_col;
        this.time=_time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int visited[][]=new int[n][m];
        Queue<Pair>pq=new LinkedList<>();
        int cntfresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    visited[i][j]=2;
                     pq.add(new Pair(i,j,0));
                }
                else{
                    visited[i][j]=0;
                }
                if(grid[i][j]==1)cntfresh++;
            }

        }
        int time=0;
        int delr[]={-1,0,+1,0};
        int delc[]={0,+1,0,-1};
        int cnt=0;
        while(!pq.isEmpty()){
            int r=pq.peek().row;
            int c=pq.peek().col;
            int tm=pq.peek().time;
            pq.remove();
            time=Math.max(tm,time);
           
            for(int k=0;k<4;k++){
                int numr=r+delr[k];
                int numc=c+delc[k];
                if(numr>=0 &&numr<n&&numc>=0&&numc<m&&visited[numr][numc]==0&&grid[numr][numc]==1){
                    pq.add(new Pair(numr,numc,tm+1));
                    visited[numr][numc]=2;
                     cnt++;
                }
            }


        }
        if(cntfresh!=cnt)return -1;
        return time;


           






    }
}