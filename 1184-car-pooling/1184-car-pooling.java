class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n=trips.length;
        int arr[]=new int[1001];
        for(int i=0;i<n;i++){
            int x=trips[i][1];
            int y=trips[i][2];
            int z=trips[i][0];
            arr[x]+=z;
            arr[y]-=z;
        }
        int current=0;
        for(int i=0;i<1001;i++){
              current+=arr[i];
              if(current>capacity){
                return false;
              }
        }
        return true;
        
    }
}