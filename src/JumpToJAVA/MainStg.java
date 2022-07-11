package JumpToJAVA;

public class MainStg {

    public static void main(String[] args){
        String a = "Happy Java";
        String b = "a";
        String c = "123";


        System.out.println(a);  // Happy Java
        System.out.println(b);  // a
        System.out.println(c);  // 123
        System.out.println(a.indexOf("Java"));  // 6             indexOf=> 문자열에서 특정 문자가 시작되는 위치
        System.out.println(a.contains("Java"));  // true         contains=> 문자열에서 특정 문자열이 포함되어있는지 여부 리턴
        System.out.println(a.charAt(6)); // J                    charAt=> 문자열에서 특정 위치의 문자를 리턴
        System.out.println(a.replaceAll("Java", "World"));  // Happy World           replaceAll => 문자열중 특정 문자열을 다른 문자열로 바꾸고자할때 사용
        System.out.println(a.substring(0,4));     // Happ         substring => 문자열중 특정 부분을 뽑아낼 경우 사용

    }
}


// String.format 과 System.out.println 의 차이점: 전자는 문자열 리턴, 후자는 문자열 출력력