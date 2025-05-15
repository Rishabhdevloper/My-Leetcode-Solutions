class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
      List<String>list=new ArrayList<>();
     int n=words.length;
     int prev=-1;
     int curr=-1;
     for(int i=0;i<n;i++){
          curr=groups[i];
          if(curr!=prev){
            list.add(words[i]);
            prev=curr;
          }
     }
     return list;    
    }
}