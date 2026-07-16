import java.util.ArrayDeque;
import java.util.Deque;

public class Stack01 {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        int top = stack.peek();
        System.out.println(top);
        while (!stack.isEmpty()){
            int item = stack.pop();
            System.out.println(item);
        }


        String str = "(()())";
        Deque<Character> stack02 = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack02.push(c);
            } else {
                stack02.pop();
            }
        }
        System.out.println(stack.isEmpty());
    }
}
