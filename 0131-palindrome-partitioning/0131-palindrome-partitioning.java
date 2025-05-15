class Solution {
     public static boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }

        }
        return true;
    }

    public static void f(int indx,String s, List<List<String>>res, List<String>li){
           if(indx>=s.length()){
            res.add(new ArrayList<>(li));
            return;
           }
           for(int i=indx;i<s.length();i++){
             if(isPalindrome(s,indx,i)){
                li.add(s.substring(indx,i+1));
                f(i+1,s,res,li);
                li.remove(li.size()-1);
             }
           }
    }
    public List<List<String>> partition(String s) {
       List<List<String>>res=new ArrayList<>();
       List<String>li=new ArrayList<>();
       int indx=0;
       f(indx,s,res,li);
       return res;
    }
}