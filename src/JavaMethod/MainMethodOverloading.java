package JavaMethod;

// 다른 유형의 숫자를 더하는 방법1
/*
public class MainMethodOverloading {
    static int plusMethodInt(int x, int y){
        return x + y;                  // 정수 리턴값
    }
    static double plusMethodDouble(double x, double y){
        return x + y;                  // 실수 리턴값
    }
    public static void main(String[] args){
        int myNum1 = plusMethodInt(8,5);
        double mynum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + mynum2);
    }
}
*/

// 다른 유형의 숫자를 더하는 방법 (plusMethod 모두에 대해 작동하도록 메소드를 오버로드)
public class MainMethodOverloading{
    static int plusMethod(int x, int y){
        return x + y;
    }
    static double plusMethod(double x, double y){
        return x + y;
    }
    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double mynum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + mynum2);
    }
}
