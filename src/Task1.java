import java.util.Scanner;

public class Task1 {
    Scanner n=new Scanner(System.in);

    public  void checkNumber() {
        System.out.println("enter number");
        int num = n.nextInt();

      if(num<100) {
          if ((num >= 2 && num <= 5) && (num % 2 == 0) || (num > 20) && (num % 2 == 0)) {
              System.out.println("No weird");


          } else if ((num >= 6 && num <= 20) && (num % 2 == 1)) {
              System.out.println("weird");
          } else {
              System.out.println("number out of range");
          }

      }

    }
    public static void main(String[] args) {
      Task1 t=new Task1();
      t.checkNumber();
    }
}
