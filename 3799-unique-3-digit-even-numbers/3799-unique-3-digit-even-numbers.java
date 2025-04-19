class Solution {
    public int totalNumbers(int[] digits) {
       int n=digits.length;
       HashSet<Integer>set=new HashSet<>();
       for(int i=0;i<n;i++){
        if(digits[i]==0)continue;
          for(int j=0;j<n;j++){
             for(int k=0;k<n;k++){
                if(i!=j&&j!=k&&i!=k){
                    int a=digits[i]*100+digits[j]*10+digits[k]*1;
                    if(a%2==0){
                        set.add(a);
                    }
                    

                }
             }
          }
       }

    return set.size();
}
}