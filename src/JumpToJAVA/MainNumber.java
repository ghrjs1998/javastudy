package JumpToJAVA;

/*
public class MainNumber {
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        System.out.println(a+b); // 15
        System.out.println(a*b); // 50
        System.out.println(a/b); // 2
        System.out.println(a-b); // 5
    }
}
*/

// 증감 연산
public class MainNumber {
    public static void main(String[] args){
        int i = 0;     // i 초기화
        int j = 10;    // j 초기화

        i++;  // i가 1씩 증가
        j++;  // j가 1씩 증가

        System.out.println(i); // 1
        System.out.println(j); // 11
    }
}

// i++: 값이 참조된 후 증가
// j++: 값이 참조되기 전에 증가