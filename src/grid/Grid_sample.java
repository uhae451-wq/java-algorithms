package grid;

import java.util.*;

public class grid_sample {
    public static void main(String[] args) {
        int[][] grid = new int[][]{};
        grid = new int[][]{
                {1, 1, 1, 1},
                {0, 1, 0, 1},
                {0, 1, 0, 1},
                {1, 0, 1, 1}
        };
        int[] target = new int[]{3,3};
        int[][] parent = new int[grid.length][grid[0].length];
        List<int[]> sum = solution(grid,target,parent);
        for(int[]i : sum){
            System.out.print("("+i[0]+ ", "+ i[1]+")");
        }
    }

    static List<int[]> solution(int[][]grid,int[] target, int[][]parent){
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        List<int[]> sum = new ArrayList<>();
        sum = bfs(2,1,grid,visited,target,parent);
        return sum;
    }

    static List<int[]> bfs(int sr, int sc, int[][]grid, boolean[][] visited, int[]target, int[][]parent){
        int n = grid.length;
        int m = grid[0].length;
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int[][] dist = new int[n][m];
        for(int[] i : dist){
            java.util.Arrays.fill(i, -1); // 미방문 = -1
        }

        Queue<int[]> que = new ArrayDeque<>();
        que.offer(new int[]{sr,sc});
        visited[sr][sc] = true;
        dist[sr][sc] = 0;

        while(!que.isEmpty()){
            int[] cur = que.poll();
            int r = cur[0];
            int c = cur[1];
            if(r == target[0] && c == target[1]){
                return buildPath(parent,sr,sc,target,m);
            }

            for(int i=0; i<4; i++){
                // 오른쪽으로 한칸, 아래로 한칸, 왼쪽으로 한칸, 위로 한칸
                int nr = r + dr[i];
                int nc = c + dc[i];
                // 다음 이동공간에 0이거나 넘어가는지 확인
                if(nr >= 0 && nr < n && nc >= 0 && nc < m){
                    if(grid[nr][nc] == 1 && !visited[nr][nc]){
                        que.offer(new int[]{nr,nc});
                        visited[nr][nc] = true;
                        dist[nr][nc] = dist[r][c] + 1;
                        parent[nr][nc] = r * m + c;
                    }
                }
            }
        }
        return null;
    }

    static List<int[]> buildPath(int[][] parent, int sr, int sc, int[] target, int m){
        List<int[]> path = new ArrayList<>();
        int r = target[0], c = target[1];
        while (!(r == sr && c == sc)) {
            path.add(new int[]{r, c});
            int encoded = parent[r][c];
            r = encoded / m;
            c = encoded % m;
        }
        path.add(new int[]{sr, sc});
        java.util.Collections.reverse(path);
        return path;
    }


}
