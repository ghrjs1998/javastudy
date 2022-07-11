package JavaTutorial;

public class MainBreak {
    public static void main(String[] args){
        for(int i= 0; i < 10; i++){  // 조건식
            if(i==4){
                break;   // 0~3까지 반복후 종료
            }
            System.out.println(i); // 출력값
        }
    }
}
