package JumpToJAVA;

// set 자료형
/*import java.util.Arrays;
import java.util.HashSet;

public class MainSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);        // [e, H, l, o]
    }
}*/
// set자료형 특징: 중복 허용 x 순서 x

// 값 추가하기
/*
import java.util.HashSet;

public class MainSet{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);
    }
}*/

// 값 여러 개 추가하기
/*
import java.util.HashSet;
import java.util.Arrays;

public class MainSet{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.addAll(Arrays.asList("To", "Java"));
        System.out.println(set);
    }
}*/

// 특정 값 제거
import java.util.HashSet;
import java.util.Arrays;

public class MainSet{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
        set.remove("To");
        System.out.println(set);  // [Java, Jump]
    }
}
// treeSet = 오름차순으로 값 정렬해 저장       LinkedHashset = 입력한 순서대로 값 정렬해 저장장