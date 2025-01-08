class Solution {
    public List<String> stringMatching(String[] words) {
        List<String>list=new ArrayList<>();
        int n=words.length;
        for(int i=0;i<n;i++){
            String ans=words[i];
            for(int j=0;j<n;j++){
                if(j!=i){
                   if(words[j].contains(ans)){
                    list.add(ans);
                    break;
                   } 
                }
            }
        }
        return list;
    }
}