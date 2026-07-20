package graph;

import java.util.ArrayList;
import java.util.List;

public class DFS_sample {
    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>(List.of(
                List.of(),        // 0번 (사용 안 함)
                List.of(2, 3),    // 1
                List.of(1, 4, 5), // 2
                List.of(1, 6, 7), // 3
                List.of(2),       // 4
                List.of(2),       // 5
                List.of(3),       // 6
                List.of(3)        // 7
        ));
        solution(graph,new boolean[graph.size()],1);
    }

    static void solution(List<List<Integer>> graph, boolean[] visited, int cur){
        visited[cur] = true;
        System.out.println(cur + " : ");
        List<Integer> newList = graph.get(cur);
        for(int i=0; i<newList.size();i++){
            if(!visited[newList.get(i)]){
                solution(graph,visited,newList.get(i));
            }
        }
    }
}
