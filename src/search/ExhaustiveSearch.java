package search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExhaustiveSearch {
    public static void main(String[] args) {
        /*
        *  리스트 [4,9,7,5,1]에서 주어진 target값과 일치하는 요소의 인덱스를 찾으세요.
        * 제약 조검 : 1 <= 배열 길이 n <= 10^5
        * */
        int index_n = findNumber(new ArrayList<>(Arrays.asList(4, 9, 7, 5, 1)),5);
        System.out.println(index_n);

        /*
        *  리스트 [4,9,7,5,1]에서 두 요소의 합이 target이 되는 인덱스를 반환하시오 (중복x)
        * */
        int [] sumNum = sumNumber(new ArrayList<>(Arrays.asList(4, 9, 7, 5, 1)),14);
        System.out.println(Arrays.toString(sumNum));

        /*
        * 주어진 격자 그리드에서 가장 큰 값을 반환하시오
        * */
        int gridNum = gridNumber(new int[][]{{3, 7, 2}, {8, 1, 5},{4, 9, 6}});
        System.out.println(gridNum);

    }
    public static int findNumber(List<Integer> numbers, int target){
        for(int i =0; i < numbers.toArray().length; i++ ){
            if(numbers.get(i) == target ){
                return i;
            }
        }
        return 0;
    }

    public static int[] sumNumber(List<Integer> numbers, int target){
        List<Integer> indexes = new ArrayList<>();
        for(int i=0; i<numbers.toArray().length; i++){
            for(int j=i+1; j<numbers.toArray().length; j++ ){
                if(numbers.get(i)+numbers.get(j) == target){
                    indexes.add(i);
                    indexes.add(j);
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static int gridNumber(int[][]gridNum){
        int maxVal = -1;
        int outN = gridNum.length;
        int inN = gridNum[0].length;

        for(int i=0; i<outN; i++){
            for(int j=0; j<inN; j++){
                if(gridNum[i][j] > maxVal){
                    maxVal = gridNum[i][j];
                }
            }
        }
        return maxVal;
    }
}



