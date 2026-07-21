package graph;

import java.util.*;

public class Rocker {
    public static void main(String[] args) {
        /*
        * n개의 잠긴 락커가 존재하며 락커를 열면 다른 락커를 열수 있는 열쇠가 존재한다.
        * 0번 락커만 열려있을때 최종적으로 열리지 못한 락커의 갯수를 구하시오.
        * */
        int[][] edges1 = {
                {1, 3},
                {2, 4},
                {0},
                {4},
                {},
                {3, 4}
        }; // 1

        int[][] edges2 = {
                {1,2},
                {3},
                {},
                {0}
        }; // 0

        int[][] edges3 = {
                {0, 1},
                {0, 1},
                {2, 3},
                {2, 3}
        };  // 2
        int suu = bfs(edges1,new boolean[edges1.length], 0);
        System.out.println("열지못하는 락커 수 : "+suu);
        int suu1 = bfs(edges2,new boolean[edges2.length], 0);
        System.out.println("열지못하는 락커 수 : "+suu1);
        int suu2 = bfs(edges3,new boolean[edges3.length], 0);
        System.out.println("열지못하는 락커 수 : "+suu2);

        int juu = dfs(edges1,new boolean[edges1.length], 0);
        System.out.println("열지못하는 락커 수 : "+juu);
        int juu1 = dfs(edges2,new boolean[edges2.length], 0);
        System.out.println("열지못하는 락커 수 : "+juu1);
        int juu2 = dfs(edges3,new boolean[edges3.length], 0);
        System.out.println("열지못하는 락커 수 : "+juu2);

    }

    // BFS
    static int bfs(int[][]arr,boolean[] visited,int cur){
        visited[cur] = true;
        List<Integer> list = new ArrayList<>();
        Queue<Integer> que = new ArrayDeque<>();
        que.offer(cur);
        while (!que.isEmpty()){
            int in = que.poll();
            list.add(in);
            for(int i=0; i<arr[in].length; i++){
                int next = arr[in][i];
                if(!visited[next]){
                    visited[next] = true;
                    que.offer(next);
                }
            }
        }

        return arr.length - list.size();
    }

    //DFS
    static int dfs(int[][] arr, boolean[] visited, int cur){
        if(!visited[cur]){
            visited[cur] = true;
            for(int i=0; i<arr[cur].length; i++){
                dfs(arr,visited,arr[cur][i]);
            }
        }

        int falseCount = 0;
        for (boolean b : visited) {
            if (!b) falseCount++;
        }
        return falseCount;
    }


}
