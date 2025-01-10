class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int n=words2.length;
        ArrayList<String>list=new ArrayList<>();

        
        int maxfreq[]=new int[26];
        for(int i=0;i<words2.length;i++){
            String ans=words2[i];
            int arr[]=new int[26];
             for(int j=0;j<ans.length();j++){
                arr[ans.charAt(j)-'a']++;
             }
             for(int j=0;j<26;j++){
                maxfreq[j]=Math.max(maxfreq[j],arr[j]);
             }

        }
        for(int i=0;i<words1.length;i++){
            String bns=words1[i];
            int brr[]=new int[26];
            for(int k=0;k<bns.length();k++){
                 brr[bns.charAt(k)-'a']++;
            }
            boolean fl=true;
            for(int l=0;l<26;l++){
                if(brr[l]<maxfreq[l]){
                    fl=false;
                }
            }
            if(fl){
              list.add(bns);
            }

        }


      return list;
    }
}