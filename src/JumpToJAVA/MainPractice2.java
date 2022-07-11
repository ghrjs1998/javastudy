package JumpToJAVA;

//Calculator 클래스를 상속하는 UpgradeCalculator를 만들고 값을 뺄 수 있는 minus 메서드를 추가해 보자.
// calculator 클래스에 상속하는 upgradecalculator를 만듬
// minus 메서드 추가
/*
class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}

class UpgradeCalculator extends Calculator{
    void minus(int val){
        this.value -= val;
    }
}

public class MainPractice2 {
    public static void main(String[] args) {
       UpgradeCalculator cal = new UpgradeCalculator();
       cal.add(10);
       cal.minus(3);
       System.out.println(cal.getValue());
    }
}*/

// 객체변수 value가 100이상의 값은 가질 수 없도록 제한하는 MaxLimitCalculator 클래스를 만들기
/*
class Calculator {
    int value;

    Calculator(){
        this.value = 0;
    }

    void add(int val){
        this.value += val;
    }

    int getValue(){
        return this.value;
    }
}

class MaxLimitCalculator extends Calculator{
    void add(int val){
        if(this.value < 100) {
            this.value = 100;
        }
    }
}

public class MainPractice2{
    public static void main(String[] args) {
        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);
        cal.add(60);
        System.out.println(cal.getValue());       // 100 출력
    }
}*/

// 다음 클래스에 주어진 정수가 홀수인지 짝수인지 판별해 주는 메서드(isOdd)를 추가(홀수면 true, 짝수면 false)
class Calculator {
    int value;

    Calculator(){
        this.value = 0;
    }

    void add(int val){
        this.value += val;
    }

    int getValue(){
        return this.value;
    }

    boolean isOdd(int num){
        return num%2==1;
    }
}

public class MainPractice2{
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.isOdd(4));
        System.out.println(cal.isOdd(3));
    }
}