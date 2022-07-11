package JavaTutorial;

public class MainContinue {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            if(i==4) {
                continue;  // 한번의 반복을 중단하고 루프에서 다음 반복을 계속함
            }
            System.out.println(i); // 출력: 0~10까지 i가4일때 제외하고 반복
        }
    }
}
