package recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursiont_Q3 {
    public static void main(String[] args) {
        /*
        * 주어진 배열에서 만들수있는 모든 조합을 구하시오.
        * */
        int[] arr = {1, 2, 4, 6, 8, 10};
        int m = 2;
        List<List<Integer>> qwe = new ArrayList<>(solution(arr,0,m,new ArrayList<>()));
        for (List<Integer> integers : qwe) {
            System.out.println(integers);
        }
    }

    public static List<List<Integer>> solution (int[] list, int start, int m,List<Integer>hop){
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>(hop));
        for(int i = start; i < list.length; i++){
            hop.add(list[i]);
            answer.addAll(solution(list,i+1, m, hop));
            hop.remove(hop.size()-1);
        }
        return answer;
    }
}
