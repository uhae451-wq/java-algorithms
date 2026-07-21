package graph;

import java.util.ArrayList;
import java.util.List;

public class EdgeListToAdjList  {
    public static void main(String[] args) {

        // 간선리스트 > 단항뱡 인접리스트로 만들기
        int n = 5;
        int[][] list = {
                {0,1},
                {0,2},
                {2,0},
                {2,4},
                {3,1},
                {4,0},
                {4,2},
                {4,3}
        };
        List<List<Integer>> arrayList = new ArrayList<>();
        for(int i=0; i<n; i++){
            arrayList.add(new ArrayList<>());
        }
        for(int[] i : list){
            arrayList.get(i[0]).add(i[1]);
        }
        for(List<Integer> i : arrayList){
            System.out.println(i);
            /*
            [1, 2]
            []
            [0, 4]
            [1]
            [0, 2, 3]
            * */
        }
        System.out.println("*********************************************");

        // 간선리스트 > 양방향 인접리스트로 변환
        int n1 = 5;
        int[][] list1 = {
                {0,1},
                {0,2},
                {0,4},
                {1,3},
                {2,4},
                {3,4}
        };
        List<List<Integer>> graph1 = new ArrayList<>();
        for(int i=0; i<5; i++){
            graph1.add(new ArrayList<>());
        }
        for(int [] i : list1){
            graph1.get(i[0]).add(i[1]);
            graph1.get(i[1]).add(i[0]);
        }

        for(List<Integer> i : graph1){
            System.out.println(i);
            /*
            * [1, 2, 4]
              [0, 3]
              [0, 4]
              [1, 4]
              [0, 2, 3]
            * */
        }
    }
}
