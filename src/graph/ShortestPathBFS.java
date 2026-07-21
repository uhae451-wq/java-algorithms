package graph;

import java.util.*;

public class ShortestPathBFS {
    public static void main(String[] args) {
        int n = 8; // 정점 0~7
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 추가 (양방향)
        addEdge(graph, 3, 5);
        addEdge(graph, 5, 7);
        addEdge(graph, 5, 1);
        addEdge(graph, 7, 0);
        addEdge(graph, 7, 4);
        addEdge(graph, 7, 6);
        addEdge(graph, 7, 1);
        addEdge(graph, 0, 1);
        addEdge(graph, 4, 6);
        addEdge(graph, 6, 2);

        int start = 3;
        int target = 6;

        boolean[] visited = new boolean[n];
        int[] parent = new int[n];
        Arrays.fill(parent, -1);

        int dist = bfs(graph, start, target, visited, parent);
        System.out.println(Arrays.toString(parent));
        List<Integer> path = getPath(parent, target);

        System.out.println("최단거리: " + dist);
        System.out.println("경로: " + path);
    }

    static void addEdge(List<List<Integer>> graph, int a, int b) {
        graph.get(a).add(b);
        graph.get(b).add(a);
    }

    static int bfs(List<List<Integer>> graph, int cur, int target, boolean[] visited, int[] parent) {
        Queue<int[]> arr = new ArrayDeque<>();
        visited[cur] = true;
        arr.offer(new int[]{cur, 0}); // {현재 정점, 거리}

        while (!arr.isEmpty()) {
            int[] now = arr.poll();
            int node = now[0];
            int dist = now[1];

            if (node == target) {
                return dist;
            }

            for (int next : graph.get(node)) {
                if (!visited[next]) {
                    visited[next] = true;
                    parent[next] = node; // next로 올 때 node를 거쳐왔다고 기록
                    arr.offer(new int[]{next, dist + 1});
                }
            }
        }
        return -1; // 도달 못하면 -1
    }

    static List<Integer> getPath(int[] parent, int target) {
        List<Integer> path = new ArrayList<>();
        int node = target;
        while (node != -1) {
            path.add(node);
            node = parent[node];
        }
        Collections.reverse(path);
        return path;
    }
}