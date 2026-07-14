public class runtime {

    public static void main(String[] args) {

        // 입력갑 n에 대한 상수함수
        // 1) runtime(n) = C  => O(1)
        System.out.println("hi");
        // 2) runtime(n) = 100 x C1 = C     => O(1)
        for(int i = 0; i < 100; i++ ){
            System.out.println("hi");
        }
        // 3) runtime(n) = 100 x 100 x C1 + C2 = C => O(1)
        for (int i = 0; i < 100; i++ ){
            for(int j = 0; j < 100; j++ ){
                System.out.println("hi");
            }
        }
        System.out.println("bye");

        // 입력값 n에 대한 일차함수
        // 1) runtime(n) = n x C1 + C2 = An + B => O(n)
        int n = 10; // 입력받을 값
        for(int i = 0; i < n; i++ ){
            System.out.println("hi");
        }
        System.out.println("bye");

        // 2) runtime(n) = n x 1000 x C1 + C2 = An + B => O(n)
        for (int i = 0; i < n; i++ ){
            for (int j = 0; j < 1000; j++ ){
                System.out.println("hi");
            }
        }
        System.out.println("bye");

        // 입력값 n에 대한 이차함수
        // runtime(n) = n x n x C1 + n x C2 + C3 = An^2 + Bn + C  => O(n^2)
        for (int i = 0; i < n; i++ ){
            for (int j = 0; j < n; j++ ){
                System.out.println("hi");
            }
            System.out.println("hi2");
        }
        System.out.println("bye");
    }
}
