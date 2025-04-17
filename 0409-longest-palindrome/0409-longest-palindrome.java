class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        if(s.length()==0)return 0;
       HashMap<Character,Integer>map=new HashMap<>();
       for(int i=0;i<n;i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       }
       int cnt=0;
       boolean flag=false;
       for(Map.Entry<Character,Integer> e:map.entrySet()){
           if(e.getValue()%2==0){
            cnt+=e.getValue();
           }
           else{
            flag=true;
            cnt+=(e.getValue()-1);
           }
       }
        if(flag)return cnt+1;
        return cnt;
    }
}