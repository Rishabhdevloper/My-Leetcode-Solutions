class Solution {
    public static ArrayList<String> f(ArrayList<String>list,String st, StringBuilder str,int n){
        if(str.length()==n){
            list.add(str.toString());
            return list ;
        }
        for(int i=0;i<3;i++){
            if(str.length()==0||st.charAt(i)!=str.charAt(str.length()-1)){
                str.append(st.charAt(i));
                f(list,st,str,n);
                str.deleteCharAt(str.length() - 1);  //Backtrack
            }
            
        }
        return list;
    }
    public String getHappyString(int n, int k) {
        ArrayList<String>list=new ArrayList<>();
        String st="abc";
        StringBuilder str=new StringBuilder();
       ArrayList<String>s= f(list,st,str,n);
       Collections.sort(s);
       if(k<=s.size()){
       String ans=list.get(k-1);
       return ans;
       }
       return "";
    }
}