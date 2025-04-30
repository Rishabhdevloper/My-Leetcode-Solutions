class Solution {
    public String reverseWords(String s) {
       int n=s.length();
       StringBuilder str=new StringBuilder();
       StringBuilder ans=new StringBuilder();
       for(int i=n-1;i>=0;i--){
         if(s.charAt(i)!=' '){
            str.append(s.charAt(i));

         }
         else if(s.charAt(i)==' '&&str.length()>0){
            str.reverse();
            ans.append(str).append(" ");
            str.setLength(0);
         }
       }
       if(str.length()>0){
         str.reverse();
         ans.append(str);
       }
       return ans.toString().trim();
    }

}
