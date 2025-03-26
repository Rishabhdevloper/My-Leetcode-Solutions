class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer>list=new ArrayList<>();
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
              for(int j=0;j<m;j++){
                 list.add(grid[i][j]);
              }
        }
        Collections.sort(list);
        int mid=list.size()/2;
        int cnt=0;
        for(int i=0;i<list.size();i++){
            int mi=Math.abs(list.get(mid)-list.get(i));
            if(mi%x!=0){
                return -1;
            }
            else{
              cnt+=(mi/x);
            }
        }
          return cnt;
    }
}