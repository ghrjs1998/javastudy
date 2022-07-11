package JavaTutorial;

/*public class MainForLoop {
    public static void main(String[] args){
        for (int i=0;*//* 변수 설정 *//* i<5; *//*조건식*//* i++ *//*증감식*//*){
            System.out.println(i); // 결과 1 2 3 4
        }
    }
}*/

public class MainForLoop {
    public static void main(String[] args){
        int i, j;
        for(i = 1; i <= 5; i++){
            for(j=1; j<=10; j++){
                System.out.print("*");  // 줄바꿈 x
            }
            System.out.println();  // 줄바꿈 o
        }
    }
}