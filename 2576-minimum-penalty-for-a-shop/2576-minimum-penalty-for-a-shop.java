class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        
        int cnt=0;
        for(int i=0;i<n;i++){
           if(customers.charAt(i)=='N')cnt++;
        }
        int ans=n;
        int mpenality=cnt;
        for(int i=n-1;i>=0;i--){
            if(customers.charAt(i)=='Y'){
                cnt++;
                if(mpenality>=cnt){
                    ans=i;
                    mpenality=cnt;

                }
            }
            else{
                cnt--;
                if(mpenality>=cnt){
                    ans=i;
                    mpenality=cnt;

                }
            }
        }
        return ans;
    }
}