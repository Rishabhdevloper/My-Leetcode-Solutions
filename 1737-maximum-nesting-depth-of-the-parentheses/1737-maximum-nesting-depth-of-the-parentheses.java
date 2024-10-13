class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int open=0;
        int close=0;
        int maxopen=0;
        int maxclose=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                open++;
                maxopen=Math.max(maxopen,open);
            }
            else if(s.charAt(i)==')'&&open>0){
                open--;
            }
            else if(s.charAt(i)==')'){
                close++;
                maxclose=Math.max(maxclose,close);
            }
            

        }
        return Math.max(maxopen,maxclose);
        
    }
}