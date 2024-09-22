class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<bannedWords.length;i++){
            set.add(bannedWords[i]);
        }
        int k=0;
        for(int i=0;i<message.length;i++){
            if(set.contains(message[i])){
                k++;
            }
        }
        if(k>=2)return true;
        return false;
    }
}