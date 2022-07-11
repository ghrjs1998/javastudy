package JavaTutorial;

public class MainSwitch {
    public static void main(String[] args){
        int day = 9;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;    // break 쓰는 이유: 특별한 제어가 없다면 무한으로 반복되기때문
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking forward to the weekend");    // 아무 조건도 맞지 않을때 실행
        }
    }
}
