class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            list.add(nums[i]);
        }
         int cnt=0;
        while(true){
            boolean flag=false;
              for(int i=0;i<list.size();i++){
                  if(map.get(list.get(i))>1){
                    flag=true;
                    break;
                  }
              }
              if(flag){
                cnt++;
                int k=0;
                  while(list.size()>0&&k!=3){
                    if(map.get(list.get(0))==1){
                        map.remove(list.get(0));
                    }
                    else{
                    map.put(list.get(0),map.get(list.get(0))-1);
                    }
                    list.remove(0);
                    k++;
                    
                    
                  }
              }
              else{
                break;
              }
        }
        return cnt;

       
    }
}