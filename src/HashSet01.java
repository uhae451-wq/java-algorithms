import java.util.HashSet;
import java.util.Set;

public class HashSet01 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("사과");
        set.add("바나나");
        set.add("포도");

        System.out.println(set.contains("사과"));
        set.remove("포도");
        System.out.println(set.size()); // 2

        for (String fruit : set) {
            System.out.println(fruit); // 사과, 바나나
        }

        Set<String> set1 = new HashSet<>();
        String[] names = {"kim", "lee", "park", "kim"};
        for (String name : names) {
            if (set.contains(name)) {
                System.out.println(name + "은(는) 중복입니다.");
            } else {
                set1.add(name);
            }
        }
        System.out.println(set1); // [lee, kim, park]
    }
}
