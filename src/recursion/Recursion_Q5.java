package recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion_Q5 {
    public static void main(String[] args) {
        /*
        * 계단이 총 n칸 있을때, 한번에 1칸 또는 2칸 오를수 있을때 정상 N까지 오르는 모든 경로를 구하시오
        * */
        int target = 4;
        List<List<Integer>> ans = new ArrayList<>(solution(target,new ArrayList<>(),0));
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }

    static List<List<Integer>>solution(int target, List<Integer>path,int sum){
        List<List<Integer>> answer = new ArrayList<>();
        if(sum == target){
            answer.add(new ArrayList<>(path));
            return answer;
        }
        if(sum > target){
            return answer;
        }
        for(int i=1; i<=2; i++){
            path.add(i);
            answer.addAll(solution(target,path,sum+i));
            path.remove(path.size()-1);
        }
        return answer;
    }
}
