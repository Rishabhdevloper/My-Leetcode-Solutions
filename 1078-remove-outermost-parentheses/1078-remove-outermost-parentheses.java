class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int balance=0;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++){
              if(s.charAt(i)=='('){
                balance++;
                if(balance>1){
                   str.append(s.charAt(i));
                }
              }
              else{
                if(balance>1){
                   str.append(s.charAt(i)); 
                }
                 balance--;
              }                                    
        }
        return str.toString();
    }
}