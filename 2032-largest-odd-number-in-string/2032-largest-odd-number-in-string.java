class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        StringBuilder str=new StringBuilder();
        boolean flag=true;
        for(int i=n-1;i>=0;i--){
            if((num.charAt(i)-'0')%2==1&&flag==true){
                str.append(num.charAt(i));
                flag=false;
            }
            else if(flag==false){
                str.append(num.charAt(i));
        }
            


        }
        return str.reverse().toString();
    }
}