import java.util.Map;
import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        Map<String,String> hashmap = new HashMap<>();

        // 데이터 넣기
        hashmap.put("first","FIRST");
        hashmap.put("second","SECOND");
        hashmap.put("third","THIRD");

        // key에 대한 value값 추출
        String firstValue = hashmap.get("first");
        String secondValue = hashmap.get("second");
        String thirdValue = hashmap.get("third");

        // key로 유무 확인
        if(hashmap.containsKey("first")) {
            System.out.println("first is true");
        }
        if(hashmap.containsKey("no_number")){
            System.out.println("no number");
        }

        // value로 유무 확인
        if(hashmap.containsValue("FIRST")){
            System.out.println("first key true");
        }

        //hashMap 데이터 순회 추출 > 처음 넣은 순서랑 다름 : 방법 1
        for(Map.Entry<String,String> entry : hashmap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        //hashMap 데이터 순회 추출 : 방법 2 // key만 필요할 때
        for(String key : hashmap.keySet()){
            System.out.println(key);
        }

        // hashMap 데이터 순회 추출 : 방법 3 : 람다식
        hashmap.forEach((key,value) ->{
            System.out.println(key + " : " + value);
        });
    }
}
