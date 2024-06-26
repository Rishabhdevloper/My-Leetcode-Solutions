class Solution {
    public static boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }

        }
        return true;
    }
    public static void partition(int indx,String s,List<List<String>>res,List<String>path){
        if(indx==s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=indx;i<s.length();i++){
            if(isPalindrome(s,indx,i)){
                path.add(s.substring(indx,i+1));
                partition(i+1,s,res,path);
                path.remove(path.size()-1);//backtrack
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>>res=new ArrayList<>();
        List<String>path=new ArrayList<>();
        partition(0,s,res,path);
        return res;
    }
}