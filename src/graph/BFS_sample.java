package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BFS_sample {
    public static void main(String[] args) {
        int n = 8; // 0번은 안 쓰고 1~7번 노드만 사용
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(2).add(1);
        graph.get(2).add(4);
        graph.get(2).add(5);
        graph.get(3).add(1);
        graph.get(3).add(6);
        graph.get(3).add(7);
        graph.get(4).add(2);
        graph.get(5).add(2);
        graph.get(6).add(3);
        graph.get(7).add(3);

        boolean[] visited = new boolean[n];
        bfs(1, graph, visited);
        // 출력: 1 2 3 4 5 6 7
    }

    public static void bfs(int start, List<List<Integer>> graph, boolean[] visited) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int next : graph.get(current)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }
}