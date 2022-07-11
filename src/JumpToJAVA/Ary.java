package JumpToJAVA;

// arr[i]를 활용
/*
public class MainArray {
    public static void main(String[] args){
        String[] weeks = {"월","화","수","목","금","토","일"};
        System.out.println(weeks[2]);     // 수 출력
    }
}
*/
// 배열의 길이 구하기 -> arr.length 활용
public class Ary {
    public static void main(String[] args){
        String[] weeks = {"월","화","수","목","금","토","일"};
        for(int i=0; i<weeks.length; i++){
            System.out.println(weeks[i]); // 배열의 길이
        }
    }
}