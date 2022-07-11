package JavaTutorial;

// 변수
public class MainVariable{
    public static void main(String[] args){
        String name = "John";
        System.out.println(name);
        /*int myNum = 15;
        System.out.println(myNum);*/
        // 변수 할당의 또다른 방법
        int myNum = 15;
        myNum = 20;
        System.out.println(myNum); // myNum이 15에서 20으로 변경
        // 다른 사람이 기존 값을 덮어쓰는 것을 원하지 않는 경우 final키워드를 사용
        // String: 텍스트
        // int: 정수
        // float :-19.99 ~ 19.99같은 소수를 저장
        // char: 단일 문자 저장
        // boolean: true or false두가지 상태로 값 저장
    }
}
// 변수 인쇄
/*public class MainVariable{
    public static void main(String[] args){
        String name = "John";
        System.out.println("Hello " + name);
        String firstName = "John ";
        String lastName = "Doe";
        String FullName = firstName + lastName;
        System.out.println(FullName);

        int x = 5;
        int y = 6;
        System.out.println(x + y);
    }
}*/

    // 여러 변수에 대한 하나의 값
/*    public class MainVariable{
        public static void main(String[] args){
            int x, y, z;
            x = y = z = 50;
            System.out.println(x + y + z);
        }
    }
}*/
