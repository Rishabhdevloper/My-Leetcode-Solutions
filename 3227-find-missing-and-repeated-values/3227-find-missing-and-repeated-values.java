class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       Map<Integer,Integer>map=new TreeMap<>();
       int arr[]=new int[2];
       int n=grid.length;
       int sum=0;
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
            map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            sum+=grid[i][j];
           
        }
       }
       int ans=0;
         for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==2){
               ans=e.getKey(); 
            }
         }
         int real=(((n*n)*(n*n+1))/2)-(sum-ans);
         arr[0]=ans;
         arr[1]=real;
         return arr;
         


    }
}