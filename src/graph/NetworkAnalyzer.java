package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class NetworkAnalyzer {
    public static void main(String[] args) {
        int n = 12;
        int[][] edges = {
                {0, 1},
                {0, 2},
                {1, 6},
                {1, 7},
                {2, 3},
                {3, 7},
                {4, 5},
                {8, 9},
                {9, 10},
                {9, 11}
        };
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] i : edges) {
            list.get(i[0]).add(i[1]);
            list.get(i[1]).add(i[0]);
        }
        List<List<Integer>> network = new ArrayList<>();
        boolean[] visited = new boolean[list.size()];

        for(int i=0; i<n; i++){
            if(!visited[i]){
                List<Integer> comp = new ArrayList<>();
                dfs(visited,i,comp,list);
                network.add(comp);
            }
        }
        System.out.println(network.size());
        for(List<Integer>i:network) {
            System.out.println(i);
        }
    }

    static void dfs(boolean[] visited, int cur,List<Integer> comp,List<List<Integer>> list){
        visited[cur] = true;
        comp.add(cur);
        for(int i : list.get(cur)){
            if(!visited[i]){
                dfs(visited,i,comp,list);
            }
        }
    }
}
