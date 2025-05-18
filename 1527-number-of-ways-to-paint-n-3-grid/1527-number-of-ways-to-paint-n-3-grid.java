class Solution {
    private List<String> rowStates = new ArrayList<>();
    private int[][] t;
    private final int MOD = 1_000_000_007;

     private void generaterowStates(String currentrow, int colsRemaning, char prevColor) {
        if (colsRemaning == 0) {
            rowStates.add(currentrow);
            return;
        }


        // Colors: 'R' = Red, 'G' = Green, 'B' = Blue
        for (char color : new char[]{'R', 'G', 'B'}) {
            if (color == prevColor) continue;
            generaterowStates(currentrow + color, colsRemaning - 1, color);
        }
    }

     private int solve(int remainingrows, int prevColumnIdx, int m) {
        if (remainingrows == 0) return 1;
        if (t[remainingrows][prevColumnIdx] != -1) return t[remainingrows][prevColumnIdx];

        int totalWays = 0;
        String prevColumn =  rowStates.get(prevColumnIdx);

        for (int nextColumnIdx = 0; nextColumnIdx < rowStates.size(); nextColumnIdx++) {
            String nextColumn = rowStates.get(nextColumnIdx);
            boolean valid = true;

            // Check horizontal adjacency (no same color in same row across adjacent columns)
            for (int r = 0; r < m; r++) {
                if (prevColumn.charAt(r) == nextColumn.charAt(r)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                totalWays = (totalWays + solve(remainingrows - 1, nextColumnIdx, m)) % MOD;
            }
        }

        return t[remainingrows][prevColumnIdx] = totalWays;
    }




    public int numOfWays(int n) {
        rowStates.clear();
        generaterowStates("", 3, '#');

        int numrowPatterns = rowStates.size();
        t = new int[n][numrowPatterns];
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        int result = 0;
        for (int i = 0; i < numrowPatterns; i++) {
            result = (result + solve(n - 1, i, 3)) % MOD;
        }

        return result;
        
    }
}