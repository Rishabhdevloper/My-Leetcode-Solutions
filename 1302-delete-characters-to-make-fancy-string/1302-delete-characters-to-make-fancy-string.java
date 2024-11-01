class Solution {
    public String makeFancyString(String s) {
        StringBuilder str=new StringBuilder();

        str.append(s.charAt(0));
        if(s.length()>1){
        str.append(s.charAt(1));
    }


        int n=s.length();
        for(int i=2;i<n;i++){
             if(s.charAt(i)==s.charAt(i-1)&&s.charAt(i)==s.charAt(i-2)){

             }
             else{
                str.append(s.charAt(i));
             }
        }
        return str.toString();
    }
}