package grid;

import java.util.ArrayDeque;
import java.util.Deque;

public class CloudCount {
    public static void main(String[] args) {

        /*
        * 그리가 주어졌을때 1이 구름이고 상,하,좌,우 연결된 구름은 하나의 구름으로 볼때 구름의 총 갯수 구하기
        * */
        int[][] grid = new int[][]{};
        grid = new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };
        System.out.println(bfs(grid));
    }

    static int solution(int[][]grid){
        int n = grid.length;
        int m = grid[0].length;
        int[] dr = {-1, 0 ,1, 0};
        int[] dc = {0, 1, 0, -1};
        boolean[][] visited = new boolean[n][m];
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    count++;
                }
            }
        }
        return 0;
    }

    static int dfs(int[][]grid, int n, int m, int[] dr, int[] dc,int[][] visited){

        return 0;
    }






    static int bfs(int[][] grid){
        Deque<int[]> que = new ArrayDeque<>();
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        int[] dr = {1,0,-1,0};
        int[] dc = {0,1,0,-1};
        boolean[][] visited = new boolean[n][m];
        que.offer(new int[]{0,0});
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(!visited[i][j] && grid[i][j] == 1){
                    visited[i][j] = true;
                    que.offer(new int[]{i,j});
                    while (!que.isEmpty()) {
                        int[] now = que.poll();
                        int r = now[0];
                        int c = now[1];
                        for(int q=0; q<4; q++){
                            int nr = r + dr[q];
                            int nc = c + dc[q];
                            if(nr >= 0 && nr < n && nc >=0 && nc < m){
                                if(!visited[nr][nc] && grid[nr][nc] == 1 ){
                                    visited[nr][nc] = true;
                                    que.offer(new int[]{nr,nc});
                                }
                            }
                        }
                    }
                    count++;
                }
            }
        }
        return count;
    }




}
