import java.util.*;

class Pair {
    int first;
    int second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public static void bfs(int[][] vis, char[][] grid, int i, int j) {
        vis[i][j] = 1;
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> pq = new LinkedList<>();
        pq.add(new Pair(i, j));
        
        int dx[] = {0, 0, 1, -1};
        int dy[] = {1, -1, 0, 0};

        while (!pq.isEmpty()) {
            int ro = pq.peek().first;
            int co = pq.peek().second;
            pq.remove();

            for (int l = 0; l < 4; l++) {
                int nrow = ro + dx[l];
                int ncol = co + dy[l];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0) {
                    vis[nrow][ncol] = 1;
                    pq.add(new Pair(nrow, ncol));
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] == 0 && grid[i][j] == '1') {
                    cnt++;
                    bfs(vis, grid, i, j);
                }
            }
        }
        return cnt;
    }
}
