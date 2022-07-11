package JavaTutorial;

public class MainArray {
    public static void main(String[] args){
        // 문자열 배열, 배열길이
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]); // 출력값: Volvo
        System.out.println(cars.length); // 출력값: 4

        // 정수 배열
        int myNum[] = {10, 20, 30, 40};
        System.out.println(myNum[2]); // 출력값: 30

        // 배열 요소 변경
        String[] car={"Benz", "hyundai", "kia"};
        car[0] = "Opel";    // car배열의 0번째 배열을 Opel로 바꾼다.
        System.out.println(car[0]);  // 출력값: opel

        // 다차원 배열
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            System.out.println(myNumbers.length);
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
