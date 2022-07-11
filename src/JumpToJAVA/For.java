package JumpToJAVA;

//배열길이 구하기 -> arr.length사용
/*
public class MainFor {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three"};
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
*/

// 배열길이만큼 반복문 돌리기
// 배열안의 점수가 60이상일때 합격 출력 60미만이면 불합격 출력
/*
public class MainFor {
    public static void main(String[] args) {
        int[] marks = {90, 25, 67, 45, 80};
        for(int i=0; i<marks.length; i++){
            if(marks[i] >= 60){
                System.out.println((i+1)+"번 학생 합격입니다.");
            }else{
                System.out.println((i+1)+"번 학생 불합격입니다.");
            }
        }
    }
}*/

// foreach 문
public class For {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three"};
        for(String number: numbers) {
            System.out.println(number);
        }
    }
}