import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class Stack_Q3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{45, 42, 50, 48, 46, 49, 51})));
    }

    public static int[] solution(int[]list){
        int[] answer = new int[list.length];
        Deque<int []> stack = new ArrayDeque<>();
        for(int i=0; i<list.length; i++){

            while(!stack.isEmpty() && stack.peek()[1] < list[i]){
                int [] stackPop = stack.pop();
                int stackN = stackPop[0];
                answer[stackN] = i - stackN;
            }
            stack.push(new int[]{i,list[i]});
        }
        return answer;
    }
}
