class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        int ans=Integer.MAX_VALUE;
        int mini=Integer.MIN_VALUE;
        //Checking for the rows
        for(int i=0;i<n;i++){
             mini=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
              mini=Math.max(mini,map.get(mat[i][j]));
            }
            ans=Math.min(mini,ans);
        }
        //Checking for the Columns
        for(int i=0;i<m;i++){
             mini=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
              mini=Math.max(mini,map.get(mat[j][i]));
            }
            ans=Math.min(mini,ans);
        }
      return ans;
    }
}