import java.util.ArrayList;
import java.util.List;

public class Recursion_Q2 {
    public static void main(String[] args) {
        /*
        * 배열이 주어졌을때 m개의 조합으로 배열 값이 중복이 되지 않는 조합을 구하시오.
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

         if(hop.size() == m ){
             answer.add(new ArrayList<>(hop));
             return answer;
         }

         for(int i = start; i < list.length; i++){
            hop.add(list[i]);
            answer.addAll(solution(list,i+1, m, hop));
            hop.remove(hop.size()-1);
         }

        return answer;
    }
}
