class Solution {
    public int[] closestPrimes(int left, int right) {
        
        int prime[]=new int[right+1];
        Arrays.fill(prime,1);
        prime[1]=0;
        for(int i=2;i<=right;i++){
            if(prime[i]==1){
                for(int j=2*i;j<=right;j+=i){
                  prime[j]=0;
                }
            } 
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(prime[i]==1){
                list.add(i);
            }
        }
        int arr[]=new int[2];
        
        Arrays.fill(arr,-1);
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
             if((list.get(i+1)-list.get(i))<mini){
                arr[0]=list.get(i);
                arr[1]=list.get(i+1);
                mini=list.get(i+1)-list.get(i);
             }
        }

       return arr;
    }
}