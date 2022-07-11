package JumpToJAVA;

/*public class MainPractice1 {
    public static void main(String[] args) {
        String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        }
    }
}*/

// while문을 사용해 1~1000까지의 자연수 중 3의 배수의 합

/*
public class MainPractice1{
    public static void main(String[] args) {
        int result = 0;
        int i = 1;
        while(i<=1000){
            if(i%3==0){
                result += i;
            }
            i+=1;
        }
        System.out.println(result);
    }
}*/

// while문 또는 for문을 사용해 다음과 같이 (*)을 표시하는 프로그램
/*
public class MainPractice1{
    public static void main(String[] args) {
        int i = 0;
        while (true){
            i += 1;
            if(i > 5){
                break;
            }
            for(int j = 0; j < i; j++){
                System.out.print('*');
            }
            System.out.println("");
        }
    }
}*/

// for문을 사용해 1~100까지 숫자를 출력
/*
public class MainPractice1{
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            System.out.println(i);
        }
    }
}*/

// A학급에 총 10명의 학생이 있다. 이 학생들의 중간고사 점수는 다음과 같다.
public class MainPractice1 {
    public static void main(String[] args) {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int total = 0;
        for (int mark: marks) {  // for each 문
            total += mark;  // A학급의 점수를 모두 더한다.
        }
        float average = (float) total / marks.length;  // 평균을 구하기 위해 총 점수를 총 학생수로 나눈다.
        System.out.println(average);  // 평균 79.0이 출력된다.
    }
}