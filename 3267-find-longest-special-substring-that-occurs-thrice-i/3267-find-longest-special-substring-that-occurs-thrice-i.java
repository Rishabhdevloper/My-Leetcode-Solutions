class Solution {
    public static boolean chk(String ans){
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<ans.length();i++){
            set.add(ans.charAt(i));
        }
        if(set.size()==1)return true;
        return false;
    }
    public int maximumLength(String s) {
        HashMap<String,Integer>map=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
               if(chk(s.substring(i,j))){
                String a=s.substring(i,j);
                if(!map.containsKey(a)){
                    map.put(a,1);
                }
                else{
                    map.put(a,map.get(a)+1);
                }
                      
               }
            }
        }
        int maxi=-1;
        for(Map.Entry<String,Integer> e:map.entrySet()){
            if(e.getValue()>=3){
                String answer=e.getKey();
                maxi=Math.max(answer.length(),maxi);

            }
        }


      return maxi;
    }
}