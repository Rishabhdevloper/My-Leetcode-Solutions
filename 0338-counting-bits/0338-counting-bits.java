class Solution {
    public static int f(int n){
        int count=0;
        while(n!=1){
            if(n%2==1){
                count++;
            }
            n=n/2;
        }
        return count+1;
    }



    public int[] countBits(int n) {
        int arr[]=new int[n+1];
       for(int i=0;i<=n;i++){
           if(i>1){
             arr[i]=f(i);
           }
           else{
            arr[i]=i;
           }
       }
       return arr;
    }
}