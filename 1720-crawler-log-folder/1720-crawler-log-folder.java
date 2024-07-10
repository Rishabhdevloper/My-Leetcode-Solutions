class Solution {
    public int minOperations(String[] logs) {
       int n=logs.length;
       int cnt=0;
       for(int i=0;i<n;i++){
        String ans=logs[i];
        if(ans.equals("../")){
            if(cnt>0)cnt--;
        }
        else if(ans.equals("x/")){
            cnt++;
        }
        else if(ans.equals("./")){
            cnt+=0;
        }
        else{
            cnt++;
        }

       }

       if(cnt<0){
        return 0;
       }
          
        
     return cnt;
    }
}