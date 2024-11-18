class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int arr[]=new int[(2*n)];
        for(int i=0;i<2*n;i++){
            arr[i]=code[i%n];
        }
        int sum=0;
       if(k>0){
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i+1;j<=i+k;j++){
                sum+=arr[j];
            }
            code[i]=sum;
        }
       }
      else if(k<0){
        k=k*-1;
        for(int i=n;i<2*n;i++){
            sum=0;
            for(int j=i-1;j>=i-k;j--){
                sum+=arr[j];
            }
            code[i%n]=sum;
        }
      }
      else{
        for(int i=0;i<n;i++){
            code[i]=0;
        }
      }

      return code;
    }
}