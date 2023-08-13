
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name");
        String a = sc.nextLine();
        System.out.println("please enter your age");
        int b = sc.nextInt();
        System.out.println("age of " + a + " is : " + b);
    }
}