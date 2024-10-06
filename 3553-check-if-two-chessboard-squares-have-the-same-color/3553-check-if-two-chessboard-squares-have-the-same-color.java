class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char x=coordinate1.charAt(0);
        char y=coordinate2.charAt(0);
        int diff=Math.abs(y-x);
        char k=coordinate1.charAt(1);
        char l=coordinate2.charAt(1);
        int ans=Math.abs(l-k);
        if(ans%2==0&&diff%2==0){
            return true;
        }
       else if(ans%2==1&&diff%2==1){
            return true;
        }
        return false;
        


        
    }
}