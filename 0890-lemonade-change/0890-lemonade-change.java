class Solution {
    public boolean lemonadeChange(int[] bills) {
        int cntfive=0;
        int cntten=0;
        int n=bills.length;
        
        for(int i=0;i<n;i++){
            if(bills[i]==5){
                cntfive++;
            }
            else if(bills[i]==10){
                if(cntfive<1)return false;
                cntfive--;
                cntten++;
            }
            else if(bills[i]==20){
                 if(cntfive>=1&&cntten>=1){
                    cntfive--;
                    cntten--;
                }
                else if(cntfive>=3){
                    cntfive=cntfive-3;
                }
                else{
                    return false;
                }
            }
        }


        return true;
    }
}