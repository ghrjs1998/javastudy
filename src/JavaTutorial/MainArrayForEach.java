package JavaTutorial;

public class MainArrayForEach {
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String i : cars){
            System.out.println(i);
        }

        int [][] myNumbers = { {1,2,3,4}, {5,6,7}}; //myNumbers는 2개의 배열을 요소로 포함하는 배열
        int x = myNumbers[1][2];  // 출력값:7 1번째 배열에있는 2번째 요소
        System.out.println(x);

    }
}
