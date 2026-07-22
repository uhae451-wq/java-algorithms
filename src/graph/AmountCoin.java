package graph;

import java.util.*;

public class AmountCoin {
    public static void main(String[] args) {
        int[] coin = new int[]{9,4,1};
        int amount = 12;

        List<Integer> list = new ArrayList<>();
        int aa = bfs(coin,amount);
        System.out.println(aa);

    }

    static int bfs(int[] coins, int amount){
        Queue<int[]> que = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        set.add(amount);
        que.add(new int[]{amount, 0});

        while(!que.isEmpty()){
            int[] now = que.poll();
            int i = now[0];
            int j = now[1];
            if(i == 0){
                return j;
            }
            for(int n : coins){
                int needCoin = i - n ;
                if(needCoin < 0)continue;
                if(!set.contains(i-n)){
                    que.add(new int[]{needCoin,j+1});
                    set.add(n-i);
                }
            }

        }



        return -1;
    }



//    // BFS
//    static List<Integer> bfs(int[] coin, int mount){
//        List<Integer> list = new ArrayList<>();
//        Queue<Integer> que = new ArrayDeque<>();
//        que.offer(coin[0]);
//        while(!que.isEmpty()){
//            int i = que.poll();
//            if(mount - i > 0){
//                mount =  mount - i;
//                list.add(i);
//                System.out.println(i);
//                for(int j:coin){
//                    que.offer(j);
//                }
//            }else if(mount - i == 0){
//                System.out.println(i);
//                list.add(i);
//                return list;
//            }else if(mount - i < 0){
//                continue;
//            }
//        }
//
//        return new ArrayList<>(){};
//    }
}
