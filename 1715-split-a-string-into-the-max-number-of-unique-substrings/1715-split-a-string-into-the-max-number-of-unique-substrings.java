class Solution {
    int max = 0;

    private void solveBacktracking(Set<String> set, String s, int idx) {
        if (idx >= s.length()) {
            max = Math.max(max, set.size());
            return;
        }
        for (int i = idx + 1; i <= s.length(); i++) {
            String sub_str = s.substring(idx, i);
            if (set.add(sub_str)) {
                solveBacktracking(set, s, i);
                set.remove(sub_str);
            }
        }
    }

    public int maxUniqueSplit(String s) {
        solveBacktracking(new HashSet<>(), s, 0);
        return max;
    }
}