package JavaTutorial;

/*public class MainForEach {
    public static void main(String[] args){
        String[] cars = {"Volvo", "Ford", "BMW","Mazda"};
        for(String i : cars)
            System.out.println(i);
    }
}*/
public class MainForEach {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int sum = 0;  // 초기값 설정
        for(int i : arr)
            sum += i;
        System.out.println("합계: " +sum);
    }
}

