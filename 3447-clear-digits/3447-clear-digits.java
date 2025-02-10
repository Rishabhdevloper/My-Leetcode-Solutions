class Solution {
    public String clearDigits(String s) {
        Stack<Character>st=new Stack<>();
        StringBuilder str=new StringBuilder();
        int n=s.length();
       for(int i=0;i<n;i++){
        int a=(int)s.charAt(i);
        if(a>=97&&a<=123){
            st.push(s.charAt(i));
        }
        else if(st.isEmpty()&&a>=0&&a<=9){
            continue;
        }
        else{
            st.pop();
        }
       }
       while(!st.isEmpty()){
        str.append(st.pop());
       }
       return str.reverse().toString();
       

    }
}