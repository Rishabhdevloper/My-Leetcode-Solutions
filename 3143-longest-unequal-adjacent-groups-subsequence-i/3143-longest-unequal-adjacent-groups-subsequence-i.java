class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
       List<List<String>>list=new ArrayList<>();
       int n=words.length;
       int curr=-1;
       int prev=-1;
       int maxi=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
             List<String>li=new ArrayList<>();
             prev=groups[i];
             li.add(words[i]);
           for(int j=i+1;j<n;j++){
             curr=groups[j];
             if(curr!=prev){
                li.add(words[j]);
                prev=curr;
             }
         }
         if(li.size()>maxi){
            maxi=li.size();
             list.add(new ArrayList<>(li));
         }
        
       }
       return list.get(list.size()-1);
         
    }
}