package JumpToJAVA;

// Map 특징: key, value값 얻음
// HashMap -> put
import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();    // String형 map선언, HashMap 사용
        map.put("people", "사람");
        map.put("baseball", "야구");

        System.out.println(map.get("baseball"));       // 야구       get메소드는 value값을 얻을수 있음, value가 없을 경우 null 반환
        System.out.println(map.getOrDefault("java", "자바"));   // 자바        null대신 default값을 얻고 싶은 경우 getOrDefault메소드 사용
        System.out.println(map.containsKey("people"));  // true     containsKey => map에 키가 있는지 조사해 결과 값 리턴
        System.out.println(map.remove("people"));  // 사람     remove => 항목을 삭제 key값에 해당되는 key,value를 삭제한 후 value값을 리턴
        System.out.println(map.size()); // 1  size=> map의 개수 리턴
        System.out.println(map.keySet());   // baseball      keyset => map의 모든 키를 모아 set자료형으로 리턴
   }
}

