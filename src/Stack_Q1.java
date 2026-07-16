import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class Stack_Q1 {
    public static void main(String[] args) {

        /*
        * 문자열 s는 "(" 와 ")"로 이루어져있고 올바르게 묶인 쌍의 갯수를 반환한다.
        * 이때 올바르지 않으면 -1을 반환한다.
        * 조건 : s길이는 10^5 이하 , s는 오직 "(" , ")"로만 구성되어 있음.
        * */
        System.out.println("\"(()())()))\" : "+solution("(()())()"));
        System.out.println("\"((())()\" : "+solution("((())()"));
        System.out.println("\"())()\" : "+solution("())()"));



    }

    public static int solution(String s){
        int count = 0;
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }else if(s.charAt(i) == ')'){
                if(stack.isEmpty()){
                    return -1;
                }
                stack.pop();
                count++;
            }
        }
        if(stack.isEmpty()){
            return count;
        }else{
            return -1;
        }

    }
}
