class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxi=Integer.MIN_VALUE;
        int left=0;
        int right=0;
        if(s.length()==0)return 0;
        HashMap<Character,Integer>map=new HashMap<>();
        while(right<n){
            if(map.containsKey(s.charAt(right))){
               left=Math.max(left,map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right),right);
            maxi=Math.max(right-left+1,maxi);
            right++;
        }
        return maxi;
    }
}