import java.util.ArrayDeque;
import java.util.Deque;

public class Stack_Q2 {
    public static void main(String[] args) {
        /*
         * 문자열 s는 '(',')','[',']','{','}'로 이루어져있고 올바르게 묶인 쌍의 갯수를 반환한다.
         * 이때 올바르지 않으면 -1을 반환한다.
         * 조건 : s길이는 10^5 이하
         * */
        System.out.println("\"()[]{}\" : "+solution("()[]{}"));
        System.out.println("\"{(([]))}[]}\" : "+solution("{(([]))[]}"));
        System.out.println("\"([)]\" : "+solution("([)]"));
        System.out.println("\"(\" : "+solution("("));
    }

    public static int solution(String s){
        int count = 0;
        Deque<Character> listS = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            char nowS = s.charAt(i);
            if(nowS == '[' || nowS == '(' || nowS == '{' ){
                listS.push(nowS);
            }else{
                if(listS.isEmpty()){
                    return -1;
                }
                char peek = listS.peek();
                if((peek == '(' && nowS == ')')||(peek == '[' && nowS == ']')||(peek == '{' && nowS == '}'))   {
                    listS.pop();
                    count++;
                }else{
                    return -1;
                }
            }
        }

        return listS.isEmpty() ? count : -1 ;
    }
}
