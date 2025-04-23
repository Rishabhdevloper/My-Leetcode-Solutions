class Solution {
    public int countLargestGroup(int n) {
       int arr[]=new int[10001];
       for(int i=1;i<=n;i++){
        int cnt=0;
        int x=i;
          while(x>0){
             cnt+=(x%10);
             x=x/10;
          }
          arr[cnt]++;
       }
       int maxi=1;
       int cn=0;
       for(int i=1;i<=n;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
                cn=1;
            }
            else if(maxi==arr[i]){
                cn++;
            }
            
       }
       return cn;
    }
}