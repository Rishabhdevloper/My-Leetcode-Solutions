class Solution {
    public long minSum(int[] nums1, int[] nums2) {
       
        long sum1=0;
        long sum2=0;
        int zero1=0;
        int zero2=0;
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++){
            if(nums1[i]==0){
                zero1++;
            }
            sum1+=nums1[i];
        }
        for(int i=0;i<m;i++){
            if(nums2[i]==0){
                
                zero2++;
            }
            sum2+=nums2[i];
        }
        long min1=sum1+zero1;
        long min2=sum2+zero2;
         if(zero1==0&&zero2==0){
            if(min1!=min2)return -1;
        }

      else if(zero2==0){
            if(min1>min2)return -1;
        }
        else if(zero1==0){
            if(min2>min1)return -1;
        }


        return (long)Math.max(min1,min2);
    }
}