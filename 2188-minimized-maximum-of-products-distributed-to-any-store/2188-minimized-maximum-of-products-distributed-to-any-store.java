class Solution {
    public static boolean f(int[] quantities, int mid, int n) {
    int count = 0;
    for (int quantity : quantities) {
        count += (quantity + mid - 1) / mid; // this rounds up without needing Math.ceil
       
    }
    return count <= n;
}

    public int minimizedMaximum(int n, int[] quantities) {
       int m=quantities.length;
       int sum=0;
      Arrays.sort(quantities);
       for(int i=0;i<m;i++){
         sum+=quantities[i];
       }
       int start=1;
       int end=quantities[m-1];
        int ans=Integer.MAX_VALUE;
       while(start<=end){
        int mid=(start+end)/2;
       
        if(f(quantities,mid,n)){
            ans=Math.min(ans,mid);
            end=mid-1;
        }
        else{
            start=mid+1;
        }
       }
       return ans;

    }
}