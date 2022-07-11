package JumpToJAVA;

// add, get, size, contains, remove
/*import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("158");
        pitches.add("142");
        pitches.add("150");
        pitches.add(0,"133"); // 첫번째 위치에 133 삽입

        System.out.println(pitches);    // [133, 158, 142, 150]
        System.out.println(pitches.get(1));      // get메소드를 이용하면 특정 인덱스의 값을 추출가능
        System.out.println(pitches.size());      // size메소드를 이용하면 ArrayList의 갯수를 리턴
        System.out.println(pitches.contains("142"));  // contains메소드는 리스트 안에 해당 항목이 있는지 판별해 boolean으로리턴
        // remove(객체)
        System.out.println(pitches.remove("142"));  // true  142라는 항목이 삭제되고 true리턴
        // remove(index)
        System.out.println(pitches.remove(0));  // 138  138이 삭제된 후 138 리턴
    }
}*/

// 제네릭스
// 사용x : ArrayList pitches = new ArrayList();
// 사용o : ArrayList<String> pitches = new ArrayList<>();

// String.join
/*
import java.util.ArrayList;
import java.util.Arrays;

public class MainList{
    public static void main(String[] args) {
        // String형 pitches 선언 ArrayList에("138","129""142")초기값 사용
        // ArrayList = 모든 값을 한번에 출력하는 방법
        // Arrays.asList()는 Arrays의 private 정적 클래스인 ArrayList를 리턴
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = "";
        for (int i = 0; i < pitches.size(); i++) {
            result += pitches.get(i);
            result += ",";  // 콤마를 추가한다.
        }
        result = result.substring(0, result.length() - 1);  // 마지막 콤마는 제거한다.
        System.out.println(result);  // 138,129,142 출력
    }
}*/

// 리스트 정렬
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

public class List {
    public static void main(String[] args) {
        // String형 pitches 선언 ArrayList에("138","129""142")초기값 사용
        // ArrayList = 모든 값을 한번에 출력하는 방법
        // Arrays.asList()는 Arrays의 private 정적 클래스인 ArrayList를 리턴
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches.sort(Comparator.naturalOrder());  // 오름차순 정렬
        // pitches.sort(Comparator.reverseOrder());  내림차순 정렬
        System.out.println(pitches);
    }
}
