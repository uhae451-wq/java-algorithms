import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BruteForce_Q2 {
    public static void main(String[] args) {
        /*
        * 배열이 주어질때 각 배열의 값보다 큰값이 몇번 인덱스 뒤에 존재하는지 확인
        * [ 45, 42, 50, 48, 46, 49, 51 ]
        * */
        System.out.println(solution(new ArrayList<>(Arrays.asList(45, 42, 50, 48, 46, 49, 51))));
    }

    public static ArrayList<Integer> solution(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            int count = 0;
            for(int j = i+1; j <list.size(); j++){
                count++;
                if( list.get(i) < list.get(j)){
                    break;
                }
            }
            result.add(i, count);
        }
        return result;
    }
}
