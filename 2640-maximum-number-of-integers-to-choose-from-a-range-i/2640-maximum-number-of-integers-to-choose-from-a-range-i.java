class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int bann[]=new int[100001];
        for(int nums:banned){
            bann[nums]=1;
        }
        int cnt=0;
        int sum=0;
        for(int i=1;i<=n;i++){
             if(sum+i>maxSum){
                break;
             }
             else{
               if(bann[i]!=1){
                 sum+=i;
                cnt++;
               }
             }
        }
        return cnt;
    }
}