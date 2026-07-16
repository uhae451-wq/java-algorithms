import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTable_Q1 {
    public static void main(String[] args) {
        /*
         * 배열이 주어지고 두 합이 target과 일치하는 경우의 수 구하기
         * 조건 : 배열길이는 10^5 미만 , 각 배열의 값은 1이상 10^9이하 , target은 2이상 10^9이하, 같은 배열값 중복없음. 중복값 선택 X
         * */
        int count01 = solution(new int[]{2, 7, 11, 15},9);
        int count02 = solution(new int[]{3, 8, 12, 17, 20},25);
        int count03 = solution(new int[]{4, 6, 10, 15, 21},1);
        int count04 = solution(new int[]{24, 7, 31, 14, 9, 2, 18},40);
        int count05 = solution(new int[]{1, 3, 5, 7, 9},10); // 2
        int count06 = solution(new int[]{1, 3, 5, 6, 7, 9, 13},12); // 2

        System.out.println("count1 : "+count01);
        System.out.println("count2 : "+count02);
        System.out.println("count3 : "+count03);
        System.out.println("count4 : "+count04);
        System.out.println("count5 : "+count05);
        System.out.println("count6 : "+count06);
    }

    public static int solution(int[]prices, int target){
        int count = 0;
        Set<Integer> map = new HashSet<>();
        for (int price : prices) {
            if (map.contains(target-price)) {
                count++;
            }
            map.add(price);

        }
        return count;
    }
}
