package JavaTutorial;

public class MainIF {
    public static void main(String[] args){
        int time = 22;
        if(time < 10){
            System.out.println("Good morning.");
        }else if(time < 20){
            System.out.println("Good day.");
        }else{
            System.out.println("Good evening");
        }

        // 3항 연산자
        int hour = 4;
        String result = (hour > 3) ? "WoW" : "WaW";
        System.out.println(result);
    }
}
