package recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
    public static void main(String[] args) {
        /*
         * 배열이 주어지고 배열의 m개의 합이 target이 되는 인덱스를 구하시오
         * */
        int[] arr = {2, 4, 6, 8, 10};
        int m = 3;
        int target = 18;

        // 메인에서 결과를 받아서 사용
        List<List<Integer>> result = combination(arr, m, target, 0, 0, new ArrayList<>(), 0);
        for (List<Integer> combo : result) {
            System.out.println(combo);
        }
    }

    static List<List<Integer>> combination(int[] arr, int m, int target, int start, int depth,List<Integer> selected, int sum) {
        List<List<Integer>> result = new ArrayList<>(); // 이 depth에서 찾은 조합들을 모아둘 리스트
        // m개를 모두 선택한 경우
        if (depth == m) {
            if (sum == target) {
                result.add(new ArrayList<>(selected)); // 지금 selected를 복사해서 담아둠
            }
            return result;
        }
        // 조합 생성
        for (int i = start; i < arr.length; i++) {
            selected.add(arr[i]);
            List<List<Integer>> subResult = combination(arr, m, target, i + 1, depth + 1, selected, sum + arr[i]);
            result.addAll(subResult); // 재귀 호출에서 찾아온 결과들을 합침
            // 백트래킹
            selected.remove(selected.size() - 1);
        }
        return result;
    }
}