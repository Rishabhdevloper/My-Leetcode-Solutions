class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        Map<Integer,Integer>map=new TreeMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums1[i][0])){
                map.put(nums1[i][0],nums1[i][1]);
            }
            else{
                map.put(nums1[i][0],map.get(nums1[i][0])+nums1[i][1]);
            }
        }
        for(int i=0;i<m;i++){
            if(!map.containsKey(nums2[i][0])){
                map.put(nums2[i][0],nums2[i][1]);
            }
            else{
                map.put(nums2[i][0],map.get(nums2[i][0])+nums2[i][1]);
            }
        }
        int ans[][]=new int[map.size()][2];
        int j=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            ans[j][0]=e.getKey();
            ans[j][1]=e.getValue();
            j++;
        }
        return ans;
    }
}