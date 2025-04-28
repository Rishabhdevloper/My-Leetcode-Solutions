class Solution {
    public int findPermutationDifference(String s, String t) {
        int n= s.length();
        int cnt=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
          map.put(t.charAt(i),i);
        }
        for(int i=0;i<n;i++){
         int a=map.get(s.charAt(i));
         cnt+=Math.abs(a-i);
        }
        return cnt;
    }
}