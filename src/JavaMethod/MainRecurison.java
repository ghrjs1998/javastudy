package JavaMethod;

/*
public class MainRecurison {
    public static void main(String[] args){
        Function(5);
    }
    static void Function(int num){
        if(num == 0){
            return;
        }else{
            System.out.println("반갑습니다");
            Function(num-1);
        }
    }
}
*/

public class MainRecurison{
    public static void main(String[] args){
        System.out.println("factorial : " + factorial(5));
    }
    public static int factorial(int i){
        if(i==1){
            return 1;
        }else{
            return i * factorial(i-1);
        }
    }
}
