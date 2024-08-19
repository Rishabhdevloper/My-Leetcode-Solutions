class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int total=0;
        int leftmax=0;
        int rightmax=0;
        int premax[]=new int[n];
        int suffmax[]=new int[n];
        premax[0]=height[0];
        suffmax[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            premax[i]=Math.max(premax[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            suffmax[i]=Math.max(suffmax[i+1],height[i]);
        }
       for(int i=0;i<n;i++){
        leftmax=premax[i];
        rightmax=suffmax[i];
        if(height[i]<leftmax && height[i]<rightmax){
             total+=Math.min(leftmax,rightmax)-height[i];
        }
       }
        return total;
    }
}