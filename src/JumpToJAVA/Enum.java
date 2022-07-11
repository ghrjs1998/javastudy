package JumpToJAVA;

/*public class MainEnum {
    // eum 만들기
    enum CoffeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };
    public static void main(String[] args) {
        System.out.println(CoffeType.AMERICANO);
        System.out.println(CoffeType.ICE_AMERICANO);
        System.out.println(CoffeType.CAFE_LATTE);
    }
}*/


public class Enum {
    // enum 만들기
    enum CoffeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };
    public static void main(String[] args) {
        // 반복문
        for(CoffeType type: CoffeType.values()){
            System.out.println(type);
        }
    }
}
