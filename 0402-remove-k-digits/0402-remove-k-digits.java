class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>st=new Stack<>();
        int n=num.length();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&st.peek()-'0'>num.charAt(i)-'0'&&k>0){
                st.pop();
                k--;
            }
            
            st.push(num.charAt(i));
        }
        while(k>0){
               st.pop();
               k--;
        }
        if(st.isEmpty())return "0";
       
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.peek());
            st.pop();
        }
        while(str.length()!=0&&str.charAt(str.length()-1)=='0'){
            str = str.deleteCharAt(str.length()-1);
         }
        str.reverse();
        if(str.isEmpty())return "0";
        return str.toString();

}
}