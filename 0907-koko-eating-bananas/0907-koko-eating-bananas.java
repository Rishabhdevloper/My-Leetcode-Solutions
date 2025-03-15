class Solution {
    public static boolean f(int[] piles, int h,int mid){
        double cnt=0;
        for(int i=0;i<piles.length;i++){
            cnt+=Math.ceil((double)piles[i]/mid);
        }
        return (int)cnt<=h;



    }
    public int minEatingSpeed(int[] piles, int h) {
       int n=piles.length;
       int low=0;
       int high=(int)1e9;
       int ans=0;
       while(low<=high){
        int mid=(low+high)/2;
        if(f(piles,h,mid)){
              ans=mid;
              high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       return ans;
    }
}