import java.util.Scanner;

class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter attended classes ");
        int att = sc.nextInt();
        System.out.println("please enter held classes");
        int hld = sc.nextInt();
        double perc = (double) att / hld;
        System.out.println(perc);
        if (perc > 80) {
            System.out.println("able to attend exam");
        } else {
            System.out.println("not able to attend exam");
        }
    }
}
