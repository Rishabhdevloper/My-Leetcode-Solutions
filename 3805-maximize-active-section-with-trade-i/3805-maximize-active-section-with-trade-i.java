class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int currz=0;
        int prevz=0;
        int onecnt=0;
        int maxone=0;
        int zeroseg=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                currz++;
            }
            else{
                onecnt++;
                maxone=Math.max(maxone,prevz+currz);
                if(currz!=0){
                    zeroseg++;
                    prevz=currz;
                   
                }
                 currz=0;
            }
        }
        if(currz!=0){
            zeroseg++;
        }
        maxone=Math.max(maxone,prevz+currz);
        if(zeroseg>1){
            return onecnt+maxone;
        }
     return onecnt;
    }
}