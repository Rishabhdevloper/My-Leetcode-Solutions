class Solution {
    static void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans,int k, List < Integer > ds) {
        if (target == 0) {
            if(ds.size()==k){
                ans.add(new ArrayList < > (ds));
            }
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

            ds.add(arr[i]);
            findCombinations(i + 1, arr, target - arr[i], ans,k, ds);
            ds.remove(ds.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int candidates[]={1,2,3,4,5,6,7,8,9};
        List < List < Integer >> ans = new ArrayList < > ();
        Arrays.sort(candidates);
        findCombinations(0, candidates, n, ans,k, new ArrayList < > ());
        return ans;

    }
}