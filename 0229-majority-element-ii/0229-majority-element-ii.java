class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>n/3){
                list.add(e.getKey());
            }
        }
            return list;
    }
}