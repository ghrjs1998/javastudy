package JavaTutorial;
/*public class Main{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}*/
// 출력
/*public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("I am learning Java.");
        System.out.println("It is awesome!");
        System.out.println(3 + 3);                // println은 줄바꿈을 해줌
        System.out.print("Hello World");          // print는 줄바꿈 x
        System.out.print("I will print on the same line");
    }
}*/
// 변수
/*public class Main{
    public static void main(String[] args){
        String name = "John";
        System.out.println(name);
        *//*int myNum = 15;
        System.out.println(myNum);*//*
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
}*/
// 변수 인쇄
/*public class Main{
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
public class Main{
    public static void main(String[] args){
        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);
    }
}

/*public class Main {
    public static void main(String[] args) {

        int result = sum(5, 10);
        System.out.println(result);
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}*/

/*
public class Main {
    public static void main(String[] args) {
        System.out.println("1부터 5까지의 합은 :" + Function(5));
    }
    public static int Function(int num){
        if(num == 1){
            return 1;
        }else{
            return num + Function(num -1);
        }
    }
}*/
