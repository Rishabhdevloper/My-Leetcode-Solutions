class Solution {

    public int countSymmetricIntegers(int low, int high) {
         int cnt=0;
         int sum=0;
         int mum=0;
        for(int i=low;i<=high;i++){
            int num=i;
            if(num>=11&&num<=99){
                if(num%11==0)cnt++;
            }
            else if(num>=1000&&num<=9999){
                sum=(num%10);
               num=num/10;
               sum+=(num%10);
               num=num/10;
                mum=(num%10);
               num=num/10;
               mum+=(num%10);
               num=num/10;
               if(sum==mum)cnt++;
               

            

            }

        }



        
        return cnt;
    }
}