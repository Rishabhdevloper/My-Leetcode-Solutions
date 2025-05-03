class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n=tops.length;
        int arr[]=new int[7];
        int brr[]=new int[7];
        for(int i=0;i<n;i++){
           arr[tops[i]]++;
           brr[bottoms[i]]++;
        }
        int maxA=Integer.MIN_VALUE;
        int maxB=Integer.MIN_VALUE;
        int indxA=-1;
        int indxB=-1;
        for(int i=1;i<7;i++){
           if(arr[i]>maxA){
            maxA=arr[i];
            indxA=i;
           }
           if(brr[i]>maxB){
            maxB=brr[i];
            indxB=i;
           }
        }
       
        int swaps=0;
        if(arr[indxA]>brr[indxB]){
             for(int i=0;i<n;i++){
                if(tops[i]!=indxA){
                    if(bottoms[i]==indxA){
                        swaps++;
                    }
                    else{
                        return -1;
                    }
                }
             }
        }
        else{
            for(int i=0;i<n;i++){
                if(bottoms[i]!=indxB){
                    if(tops[i]==indxB){
                        swaps++;
                    }
                    else{
                        return -1;
                    }
                }
            }
        }
        return swaps;

    }
}