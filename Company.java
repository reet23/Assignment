import java.time.Year;
import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a salary");
        int sal = sc.nextInt();
        System.out.println("enter year of experiance");
        short year = sc.nextShort();
        CompanyApp Ca = new CompanyApp();
        Ca.intro(sal, year);

    }
}

class CompanyApp {
    public void intro(int salary, short yoe) {
        if (yoe > 5) {
            System.out.println("Bonus:" + (salary * 0.75));
        } else {
            System.out.println("no bonus");
        }
    }
}
