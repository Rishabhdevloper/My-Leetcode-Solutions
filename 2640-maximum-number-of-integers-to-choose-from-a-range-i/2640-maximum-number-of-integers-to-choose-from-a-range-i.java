class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer>set=new HashSet<>();
        for(int nums:banned){
            set.add(nums);
        }
        int count=0;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(sum>=maxSum){
               break;
            }
            else{
                if(!set.contains(i)){
                    sum+=i;
                if(sum>maxSum){
                    break;
                }
                else{
                    count++;
                }
                
                }
            }
        }
        return count;
    }
}