import java.util.Scanner;

public class Task2 {

public static void subString(){
    int start=3;
    int end=7;
    String substr = "";

    String s ="Helloworld";
    if(s.length()>1&& s.length()<=100){
        if (start > 0 && start <= end) {
            substr = s.substring(start, end);
            System.out.println("substring = " + substr);
        }
        else System.out.println("Not the required length");
    }
    else
        System.out.println("Not a string");

}

    public static void main(String[] args) {
        subString();
    }

}
