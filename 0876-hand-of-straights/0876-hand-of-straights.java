class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
       int n=hand.length;
       if((n%groupSize)!=0)return false;
       TreeMap<Integer,Integer>map=new TreeMap<>();
        for(int i=0;i<hand.length;i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        while(map.size()>0){
            int first=map.firstKey();
            for(int i=0;i<groupSize;i++){
                int num=first+i;
                if(!map.containsKey(num)){
                   return false;
                }
                map.put(num,map.get(num)-1);
                if(map.get(num)==0){
                    map.remove(num);
                }
            }
        }
        return true;

    }
}
