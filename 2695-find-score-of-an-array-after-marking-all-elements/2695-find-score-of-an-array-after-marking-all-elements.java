class Solution {
    public long findScore(int[] nums) {
        int n=nums.length;
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));

         long sum=0;
         int chk[]=new int[n];
         for(int i=0;i<n;i++){
              int x=arr[i][0];
              int y=arr[i][1];
              if(chk[y]!=-1){
                sum+=x;
                for(int k=y-1;k>=0;k--){
                    if(chk[k]==0){
                        chk[k]=-1;
                        break;
                    }
                }
                for(int k=y+1;k<n;k++){
                     if(chk[k]==0){
                        chk[k]=-1;
                        break;
                    }
                }
              }
         }
         return sum;
    }
}