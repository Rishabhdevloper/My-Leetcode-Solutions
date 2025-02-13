class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>>list=new ArrayList<>();
        Set<Integer>set1=new TreeSet<>();
        Set<Integer>set2=new TreeSet<>();
        int n=matches.length;
        for(int i=0;i<n;i++){
            set1.add(matches[i][1]);
        }
        for(int i=0;i<n;i++){
            set2.add(matches[i][0]);
        }
        ArrayList<Integer>list1=new ArrayList<>();
        for(int val:set2){
            if(!set1.contains(val)){
                list1.add(val);
            }
        }
        Collections.sort(list1);
        list.add(list1);
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<n;i++){
            map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==1){
               list2.add(e.getKey());
            }
        }
        Collections.sort(list2);
        list.add(list2);





       return list; 
    }
}