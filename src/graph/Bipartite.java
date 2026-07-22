package graph;

import java.util.*;

public class Bipartite {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2},
                {0, 3},
                {0},
                {1}
        };
        int[] team = new int[arr1.length];
        boolean result1 = true;
        for(int i=0; i<arr1.length; i++){
            if(team[i] ==0){
                team[i] = 1;
                if(!dfs(arr1,i,team)){
                    result1 = false;
                    break;
                }
            }
        }
        System.out.println(result1);

        int[] team2 = new int[arr1.length];
        boolean result2 = true;

        for(int i=0; i<arr1.length; i++){
            if(team2[i] == 0){
                team2[i] = 1;
                if(!bfs(arr1,i,team2)){
                    result2 = false;
                    break;
                }
            }
        }
        System.out.println(result2);
    }

    //DFS
    static boolean dfs(int[][] arr,int now,int[] teams){
        for (int next : arr[now]){
            if(teams[next] == 0){
                teams[next] = -teams[now];
                if (!dfs(arr, next, teams)) {
                    return false;
                }
            }else if(teams[now] == teams[next]){
                return false;
            }
        }
        return true;
    }

    // BFS
    static boolean bfs(int[][] arr, int now, int[] teams){
        Deque<Integer> list = new ArrayDeque<>();
        list.offer(now);
        while(!list.isEmpty()){
            int i = list.poll();
            for(int next: arr[i]){
                if(teams[next] == 0){
                    teams[next] = -teams[i];
                    list.offer(next);
                }else if(teams[i] == teams[next]){
                    return false;

                }

            }
        }
        return true;
    }

}
