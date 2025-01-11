class Solution {
    public boolean canConstruct(String s, int k) {
        int n=s.length();
        if(k>n){
            return false;
        }
        else if(k>=n){
            return true;
        }
        else{
            HashMap<Character,Integer>map=new HashMap<>();
            for(int i=0;i<n;i++){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
            boolean flag=false;
            int cntodd=0;
             for(Map.Entry<Character,Integer> e:map.entrySet()){
                if(e.getValue()%2==1){
                    cntodd++;
                }
             }
             if(cntodd>k){
                return false;
             }
             else {
                return true;
             }
            





        }
      
    }
}