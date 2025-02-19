class Solution {
    public int equalPairs(int[][] grid) {
       int n=grid.length;
       int m=grid[0].length;
        HashMap<ArrayList<Integer>,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer>li=new ArrayList<>();
            for(int j=0;j<m;j++){
                li.add(grid[i][j]); 
            }
            map.put(li,map.getOrDefault(li,0)+1);
        }
        int cnt=0;

        for(int i=0;i<m;i++){
            ArrayList<Integer>li=new ArrayList<>();
            for(int j=0;j<n;j++){
                li.add(grid[j][i]); 
            }
           if(map.containsKey(li)){
            cnt+=map.get(li);
           }
        }
        return cnt;
    }
}