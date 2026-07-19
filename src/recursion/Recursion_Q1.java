package recursion;

import java.util.*;

public class Recursion_Q1   {
    public static void main(String[] args) {
        /*
         * 배열이 주어졋을때 n개의 조합으로 새 배열을 만들어 반환하기.
         * */
        int[] arr = {1,1,2, 4, 6, 8, 10};
        int m = 5;
        List<List<Integer>> qwe = new ArrayList<>(solution(arr,m,new ArrayList<>(),new ArrayList<>()));
        for (List<Integer> integers : qwe) {
            System.out.println(integers);

        }
    }

    public static List<List<Integer>> solution (int[] list, int m, List<Integer>hop, List<Integer> idx){
        List<List<Integer>> answer = new ArrayList<>();
        if(m == hop.size()){
            answer.add(new ArrayList<>(hop));
            return answer;
        }
        for(int i=0; i<list.length; i++){
            if(idx.contains(i)){
                continue;
            }
            hop.add(list[i]);
            idx.add(i);
            List<List<Integer>> newList =  solution(list,m,hop,idx);

            answer.addAll(newList);
            hop.remove(hop.size()-1);
            idx.remove(idx.size()-1);
        }
        return answer;
    }
}
