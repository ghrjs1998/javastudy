package JavaTutorial;

/*public class MainWhileLoop {
    public static void main(String[] args){
        int i = 0; // 초기값 설정
        while (i < 5){  // 조건식
            System.out.println(i);  // 실행문
            i++;  // 증감식
        }
    }
}*/
// i가 5보다 작은 한 계속해서 실행

/*
public class MainWhileLoop {
    public static void main(String[] args){
        int i = 1; // 초기값 설정
        while(i<=10){
            System.out.println(i);
            i+=2;
        }
    }
}*/

public class MainWhileLoop {
    public static void main(String[] args){
        int sum = 0, odd = 0, even = 0;  // 합계 게산을 위한 초기값 할당
        int i = 1; // 반복문 초기값 할당
        while(i<=100){  // 반복문 조건식
            sum += i; // sum = sum + i;
            if(i%2==0){
                even += i; // even = even + i;  짝수합
            }else{
                odd +=i; // odd = odd + i;  홀수합
            }
            i++; // 증감식
        }
        System.out.println("1~100 합 = " + sum);  // 결과 = 5050
        System.out.println("1~100까지 짝수 합 = " + even); // 결과 = 2550
        System.out.println("1~100까지 홀수 합 = " + odd); // 결과 = 2500
    }
}