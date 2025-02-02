class Solution {
    public String findValidPair(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        StringBuilder str=new StringBuilder();
        for(int i=1;i<n;i++){
         if(s.charAt(i)!=s.charAt(i-1)){
            int ss=s.charAt(i)-'0';
            int y=s.charAt(i-1)-'0';
            int a=map.get(s.charAt(i));
            int b=map.get(s.charAt(i-1));
            if(a==ss&&b==y){
                str.append(s.charAt(i-1));
                str.append(s.charAt(i));
                break;
            }

         }
        }
        return str.toString();
    }
}