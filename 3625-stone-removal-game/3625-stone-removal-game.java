class Solution {
    public boolean canAliceWin(int n) {
        int i=0;
        int ans=10;
        while(n>=0){
           if(i%2==0){//Alice ki chance
              if(n<ans){
                return false;
           }
           else{
            n-=ans;
            ans--;
            i++;
           }
        }
           else{
           if(n<ans){
            return true;
           }
           else{
            n-=ans;
            ans--;
            i++;
           }
           }
        }
        return false;
        
    }
}