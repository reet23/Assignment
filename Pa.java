import java.util.Scanner;

public class Pa {
    public static void main(String[] args) {
        PaApp P = new PaApp();
        P.intro();
    }
}

class PaApp {
    int usn;
    String name;
    int roll;
    String village;

    public void intro() {
        System.out.println("USN:" + usn);
        System.out.println("Name:" + name);
        System.out.println("Roll:" + roll);
        System.out.println("Village" + village);
    }

    public PaApp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the usn");
        int usn = sc.nextInt();
        System.out.println("Enter th name");
        String name = sc.next();
        System.out.println("Enter the roll");
        int roll = sc.nextInt();
        System.out.println("Enter the village");
        String village = sc.next();
    }
}