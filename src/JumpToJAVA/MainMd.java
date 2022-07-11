package JumpToJAVA;

// return값 없는 메소드
/*public class MainMethod {
    int sum(int a, int b){       // a, b는 매개변수
        return a + b;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        MainMethod method = new MainMethod();
        int c = method.sum(3,4);      // 3, 4는 인수

        System.out.println(c);      // 7출력
    }
}*/

// 입력값 x 출력값 x 없는 메소드
/*public class MainMd{
    void say(){
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        MainMd x = new MainMd();
        x.say();
    }
}*/

// return의 또 다른 쓰임새
/*public class MainMd{
    void sayNick(String nick){
        if("fool".equals(nick)){
            return;
        }
        System.out.println("나의 별명은 " +nick+" 입니다.");
    }

    public static void main(String[] args) {
        MainMd x = new MainMd();
        x.sayNick("angel");
        x.sayNick("fool");        // 출력되지 x
    }
}*/

// this 활용하기
public class MainMd {
    int a; // 매개변수 a

    void varTest() {
        this.a++;
    }

    public static void main(String[] args){
        MainMd method = new MainMd();
        method.a = 1;
        method.varTest();
        System.out.println(method.a);  // 2 출력
    }
}
