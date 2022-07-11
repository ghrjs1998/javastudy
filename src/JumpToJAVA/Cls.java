package JumpToJAVA;

/*class Animal {
    String name;

    public void setName(String name){
        this.name=name;
    }
}

public class MainCs {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("body");   // 메소드 호출

        Animal dog = new Animal();
        dog.setName("happy");  // 메소드 호출

        System.out.println(cat.name);
        System.out.println(dog.name);

    }
}*/

// 부모 클래스의 기능을 확장
/*
class Animal{
    String name;

    void setName(String name){
        this.name = name;
    }
}

class Dog extends Animal{
    void sleep(){
        System.out.println(this.name+" zzz");
    }
}
public class MainClass{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);   // poppy 출력
        dog.sleep();  // poppy zzz 출력

    }
}*/

// 메소드 오버라이딩

/*
class Animal{
    String name;

    void setName(String name){
        this.name = name;
    }
}

class Dog extends Animal{
    void sleep(){
        System.out.println(this.name +" zzz in house ");
    }
    void sleep(int hour){
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}


class HouseDog extends Dog{
}

public class MainCs{
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("Happy");
        houseDog.sleep();       // happy zzz in house 출력
        houseDog.sleep(3);   // happy zzz in house for 3 hours 출력
    }
}*/

// 생성자 오버로딩
/*
class Animal{
    String name;

    void setName(String name){
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep(){
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog{
    HouseDog(String name){
        this.setName(name);
    }
    HouseDog(int type){
        if(type==1){
            this.setName("yorkshire");
        }else if(type ==2){
            this.setName("bulldog");
        }
    }

    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour){
        System.out.println(this.name + " zzz in house for" + hour + "hours");
    }
}

public class MainCs{
    public static void main(String[] args) {
        HouseDog happy = new HouseDog("happy");
        HouseDog yorkshire = new HouseDog(1);

        System.out.println(happy.name);              // hapyy 출력
        System.out.println(yorkshire.name);         // yorkshire 출력
    }
}*/

class Animal{
    String name;

    void setName(String name){
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep(){
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog{
    HouseDog(String name){
        this.setName(name);
    }
    HouseDog(int type){
        if(type==1){
            this.setName("yorkshire");
        }else if(type ==2){
            this.setName("bulldog");
        }
    }

    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour){
        System.out.println(this.name + " zzz in house for" + hour + "hours");
    }
}

public class Cls{
    public static void main(String[] args) {
        HouseDog happy = new HouseDog("happy");    // 인스턴스 생성
        HouseDog yorkshire = new HouseDog(1);     // 인스턴스 생성

        System.out.println(happy.name);              // hapyy 출력
        System.out.println(yorkshire.name);         // yorkshire 출력
    }
}