package JumpToJAVA;


// 조건식 money가 true면 택시 false면 걸어가라
/*
public class MainIf {
    public static void main(String[] args) {
        boolean money = true;
        if(money){
            System.out.println("택시타고 가라");
        }else{
            System.out.println("걸어가라");
        }
    }
}
*/

// 변수 money 선언
// 변수 hasCard 선언
// money or hasCard가 있으면 택시 아니면 걷기 조건식 만들기
/*
public class MainIf {
    public static void main(String[] args) {
        int money = 2000;
        boolean hasCard = true;

        if(money >= 3000 || hasCard){
            System.out.println("택시타고 가라");
        }else{
            System.out.println("걸어가라");
        }
    }
}
*/

import java.util.ArrayList;
// 만약 주머니에 돈이 있으면 택시를 타고. 없으면 걸어가라.
// ArrayList로 pocket만들기
// pocket에 변수 추가
// 조건식에 contain안에 변수 넣어서 맞으면 taxi 아니면 walk
public class If {
    public static void main(String[] args) {
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("paper");
        pocket.add("handphone");
        pocket.add("money");

        if(pocket.contains("money")){
            System.out.println("taxi");
        }else{
            System.out.println("walk");
        }
    }
}