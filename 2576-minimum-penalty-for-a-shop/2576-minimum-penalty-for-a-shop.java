class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int arr[]=new int[n+1];
        int cnt=0;
        for(int i=0;i<n;i++){
           if(customers.charAt(i)=='N')cnt++;
        }
        arr[n]=cnt;
        for(int i=n-1;i>=0;i--){
            if(customers.charAt(i)=='Y'){
                cnt++;
                arr[i]=cnt;
            }
            else{
                cnt--;
                arr[i]=cnt;
            }
        }
        int ans=0;//hours
        int minpenality=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(minpenality>arr[i]){
                minpenality=arr[i];
                ans=i;
            }
        }

     return ans;
    }
}