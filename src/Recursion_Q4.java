import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion_Q4 {
    public static void main(String[] args) {
        int money = 600;
        List<List<Integer>> conf = new ArrayList<>(Arrays.asList(
                Arrays.asList(500, 300),   // {차감비용, 필요최소금액}
                Arrays.asList(500, 550),
                Arrays.asList(150, 400)
        ));

        List<List<Integer>> best = solution(conf, money, new boolean[conf.size()], new ArrayList<>());

        System.out.println("최대 방문 가능 국가 수: " + best.size());
        System.out.println("그때의 방문 순서: " + best);
    }

    public static List<List<Integer>> solution(List<List<Integer>> list, int money, boolean[] used, List<List<Integer>> path) {
        List<List<Integer>> best = new ArrayList<>(path);

        for(int i=0; i<list.size(); i++){
            if(used[i]) continue;
            int feel = list.get(i).get(0);
            int need = list.get(i).get(1);
            if(money >= need) {
                used[i] = true;
                path.add(list.get(i));
                List<List<Integer>> now = solution(list,money-feel,used,path);
                if(now.size() > best.size()){
                    best = now;
                }
                path.remove(path.size()-1);
                used[i] = false;
            }

        }

        return best;
    }
}