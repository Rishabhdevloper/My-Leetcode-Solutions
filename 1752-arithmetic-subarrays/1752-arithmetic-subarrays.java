class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        ArrayList<Integer>list=new ArrayList<>();
        List<Boolean>answer=new ArrayList<>();
        
        for(int i=0;i<l.length;i++){
            for(int j=l[i];j<=r[i];j++){
                list.add(nums[j]);
            }

            boolean flag=true;
            Collections.sort(list);
            int key=list.get(1)-list.get(0);
            
            for(int k=1;k<list.size();k++){
                if(list.get(k)-list.get(k-1)!=key){
                    flag=false;
                    break;
                }
            }
            
            list.clear();
            if(flag){
               answer.add(true);
            }
            else{
                answer.add(false);
            }
        }
       return answer; 
    }
}