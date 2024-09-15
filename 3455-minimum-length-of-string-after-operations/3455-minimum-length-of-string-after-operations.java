class Solution {
    public int minimumLength(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
       for(int i=0;i<s.length();i++){
        if(!map.containsKey(s.charAt(i))){
            map.put(s.charAt(i),1);
        }
        else{
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
       }
       int count=0;
       int ans=0;
       for(Map.Entry<Character,Integer> e:map.entrySet()){
            int b=e.getValue();
            while(b>=3){
              b=b-2;
            }
            ans+=b;
       }
       return ans;
 
}
}