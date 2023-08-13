import java.util.Scanner;

/**
 * LuckyNumber
 */
public class LuckyNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your lucky number");
        int luckyNum = scan.nextInt();

        // int luckyNum = 21;
        System.out.println("Lucky number=" + luckyNum);

    }
}