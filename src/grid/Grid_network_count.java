package grid;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Grid_network_count {
    public static void main(String[] args) {
        /*
        * 그리그에서 서로 연결된 네트워크 수 + 연결된 노드 리스트 구하기
        * */
        int[][] grid = new int[][]{};
        grid = new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };

        List<List<Integer>> result = new ArrayList<>(solution(grid));
        System.out.println(result);


    }
    static List<List<Integer>> solution(int[][] grid){
        List<List<Integer>> nodes = new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int[] start = new int[]{};
        Queue<int[]> que = new ArrayDeque<>();
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(!visited[i][j] && grid[i][j] == 1){
                    List<Integer> group = new ArrayList<>();
                    visited[i][j] = true;
                    que.offer(new int[]{i,j});
                    while(!que.isEmpty()){
                        int[] now = que.poll();
                        int r = now[0];
                        int c = now[1];
                        group.add(r*m+c);
                        for(int q =0; q<4; q++){
                            int nr = r+dr[q];
                            int nc = c+dc[q];
                            if(nr >= 0 && nr < n && nc >= 0 && nc < m){
                                if(!visited[nr][nc] && grid[nr][nc] == 1){
                                    que.offer(new int[]{nr,nc});
                                    visited[nr][nc] = true;
                                }
                            }
                        }
                    }
                    nodes.add(group);
                }
            }
        }
        return nodes;
    }
}
