package JavaTutorial;

public class MainString {
    public static void main(String[] args){
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is :" + txt.length());

        String text = "Hello World";
        System.out.println(text.toUpperCase());   // 대문자
        System.out.println(text.toLowerCase());   // 소문자

        String txt1 = "Plaease locate where 'locate' occurs!";
        System.out.println(txt1.indexOf("locate"));

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        String txt2 = "We are the so-called \"Vikings\" from the north";
        System.out.println(txt2);

        String txt3 = "It\'s alright";
        System.out.println(txt3);

        String txt4 = "The character \\ is called backslash";
        System.out.println(txt4);
    }
}
