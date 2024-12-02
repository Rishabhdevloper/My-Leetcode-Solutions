class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        StringBuilder str=new StringBuilder();
        boolean flag=false;
        int n=sentence.length();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(sentence.charAt(i)!=' '){
                str.append(sentence.charAt(i));
            }
            else if(sentence.charAt(i)==' '){
                cnt++;
                flag=true;
                if(str.length()>=searchWord.length()){
                for(int j=0;j<searchWord.length();j++){
                    if(str.charAt(j)!=searchWord.charAt(j)){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    return cnt;
                }
            }
                str.setLength(0);
            }
        }
        boolean flag1=true;
        if(str.length()>=searchWord.length()){
             for(int j=0;j<searchWord.length();j++){
                    if(str.charAt(j)!=searchWord.charAt(j)){
                        flag1=false;
                        break;
                    }
                }
                if(flag1){
                    return cnt+1;
                }

        }

        
    return -1;
    }
}