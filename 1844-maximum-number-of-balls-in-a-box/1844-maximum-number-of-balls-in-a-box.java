class Solution {
    public int countBalls(int lowLimit, int highLimit) {
    int maxi=Integer.MIN_VALUE;
    int arr[]=new int[99];
    for(int i=lowLimit;i<=highLimit;i++){
        int n=i;
        int sum=0;
        while(n>0){
            sum+=(n%10);
            n=n/10;
        }
        arr[sum]+=1;
        maxi=Math.max(arr[sum],maxi);
    }
       return maxi; 
    }
}