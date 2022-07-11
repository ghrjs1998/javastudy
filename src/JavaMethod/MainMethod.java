package JavaMethod;

// 메소드 호출
/*public class MainMethod {
    static void myMethod(){
        System.out.println("I just got executed!");
    }
    public static void main(String[] args){
        myMethod();        // myMethod 메서드 호출
        myMethod();        // myMethod 메서드 호출
        myMethod();        // myMethod 메서드 호출
    }
}*/

// 매개변수 및 인수
/*public class MainMethod {
    static void myMethod(String fname){
        System.out.println(fname + " Refsnes");
    }
    public static void main(String[] args){
        myMethod("Kim");
        myMethod("Lee");
        myMethod("Park");
    }
}*/

// 여러 매개변수
/*public class MainMethod {
    static void myMethod(String fname, int age){
        System.out.println(fname + " is " + age);
    }
    public static void main(String[] args){
        myMethod("Kim", 14);
        myMethod("Lee", 20);
        myMethod("Park", 24);
    }
}*/

// 반환값
/*
public class MainMethod{
    static int myMethod(int x){
        return 5 + x;
    }
    public static void main(String[] args){
        System.out.println(myMethod(3));
    }
}*/

// 두 매개변수 반환
/*
public class MainMethod{
    static int myMethod(int x, int y){
        return x - y;
    }
    public static void main(String[] args){
        System.out.println(myMethod(5,3));
    }
}*/

// 결과를 두 변수에 저장
/*
public class MainMethod{
    static int myMethod(int x, int y){
        return x + y;
    }
    public static void main(String[] args){
        int z = myMethod(5,3);
        System.out.println(z);
    }
}*/

// if ... else가 있는 메서드
public class MainMethod{
    static void checkAge(int age){
        if(age < 18){          // 조건식
            System.out.println("Access denied - You are no old enough!");  // 조건식이 맞지않을때
        }else{
            System.out.println("Access granted - You are old enough!");  // 조건식이 맞을때
        }
    }
    public static void main(String[] args){
        checkAge(20);
    }
}
