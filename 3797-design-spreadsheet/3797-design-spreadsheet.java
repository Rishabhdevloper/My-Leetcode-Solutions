class Spreadsheet {
    boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    int[][] grid ;
    public Spreadsheet(int rows) {
        grid = new int[rows+1][26];
    }
    
    public void setCell(String cell, int value) {
        char col = cell.charAt(0);
        int row = Integer.parseInt(cell.substring(1));
        grid[row][col-'A'] = value;
    }
    
    public void resetCell(String cell) {
        char col = cell.charAt(0);
        int row = Integer.parseInt(cell.substring(1));
        grid[row][col-'A'] = 0;
    }
    
    public int getValue(String formula) {
        formula = formula.substring(1);
        String[] s = formula.split("\\+");
        int ans = 0;
        if(isInteger(s[0]))
            ans += Integer.parseInt(s[0]);
        else {
            int row = Integer.parseInt(s[0].substring(1));
            ans += grid[row][s[0].charAt(0)-'A'];
        }
        if(isInteger(s[1]))
            ans += Integer.parseInt(s[1]);
        else {
            int row = Integer.parseInt(s[1].substring(1));
            ans += grid[row][s[1].charAt(0)-'A'];
        }
        return ans;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */