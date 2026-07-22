package grid;

import java.util.ArrayList;
import java.util.List;

public class grid_dfs {
    public static void main(String[] args) {
        int[][] grid = new int[][]{};
        grid = new int[][]{
                {1, 1, 1, 1},
                {0, 1, 0, 1},
                {0, 1, 0, 1},
                {1, 0, 1, 1}
        };
        System.out.println(solution(grid));
    }

    static boolean solution(int[][] grid){

        int n = grid.length;
        int m = grid[0].length;
        int[] start = new int[]{0,0};
        int[] target = new int[]{3,3};
        int[] r = new int[]{0, -1, 0, 1};
        int[] c = new int[]{-1, 0, 1, 0};
        boolean[][] visited = new boolean[n][m];

        return dfs(grid,start,target,visited,n,m,r,c);
    }

    static boolean dfs (int[][]grid,int[]now,int[]target,boolean[][]visited,int n,int m,int[]r,int[]c){
        int dr = now[0];
        int dc = now[1];
        if(target[0] == dr && target[1] == dc ){
            return true;
        }
        visited[dr][dc] = true;
        for(int i=0; i<4; i++){
            int nr = dr + r[i];
            int nc = dc + c[i];
            if(nr >= 0 && nr < n && nc >= 0 && nc < m){
                if(!visited[nr][nc] && grid[nr][nc] == 1){
                    visited[nr][nc] = true;
                    int[] next = new int[]{nr, nc};
                    if(dfs(grid,next,target,visited,n,m,r,c)){
                        return true;
                    };
                }
            }
        }
        return false;
    }
}
