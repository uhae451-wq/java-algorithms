package datastructure.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {
        Queue<Integer> queue01 = new ArrayDeque<>();

        queue01.offer(10);
        queue01.offer(20);
        queue01.offer(30);
        queue01.offer(40);

        int nextItem = queue01.peek(); // 첫 first 확인
        System.out.println(nextItem);  // 10
        while (!queue01.isEmpty()){
            int item = queue01.poll();  // 맨 앞부터 삭제
        }
        System.out.println(queue01.poll());  // null

        queue01.offer(50);
        queue01.offer(60);
        queue01.offer(70);
        queue01.offer(80);
    }
}
