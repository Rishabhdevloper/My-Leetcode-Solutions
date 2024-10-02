class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        if(arr.length==0)return arr;
        int brr[]=Arrays.copyOf(arr,arr.length);
        int ans[]=new int[n];
        Arrays.sort(brr);
        int rank=1;
        ans[0]=1;
        for(int i=1;i<n;i++){
            if(brr[i]!=brr[i-1]){
                 rank++;
                 ans[i]=rank;
            }
            else{
                ans[i]=rank;
            }
        }
         HashMap<Integer,Integer>map=new HashMap<>();
         for(int i=0;i<n;i++){
            if(!map.containsKey(brr[i])){
                map.put(brr[i],ans[i]);
            }
         }
         for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                arr[i]=map.get(arr[i]);
            }
         }
         return arr;
    }
}