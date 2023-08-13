import java.util.Scanner;

public class Student {
    String name;
    int roll;
    String branch;
    int yop;
    float cgpa;

    public void giveIntro() {
        System.out.println("Name:" + name);
        System.out.println("Roll:" + roll);
        System.out.println("Branch:" + branch);
        System.out.println("YOP:" + yop);
        System.out.println("CGPA:" + cgpa);
    }
}

class StudentApp {
    public static void main(String[] args) {
        /*
         * Student s = new Student();
         * s.name = "Reetal";
         * s.roll = 26;
         * s.branch = "CSE";
         * s.yop = 2023;
         * s.cgpa = 8.10f;
         * s.giveIntro();
         * Student s1 = new Student();
         * s1.name = "Reet";
         * s1.roll = 27;
         * s1.branch = "CSE";
         * s1.yop = 2023;
         * s1.cgpa = 8.12f;
         * s1.giveIntro();
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the student");
        String name = sc.nextLine();
        System.out.println("Enter roll number of the student");
        int roll = sc.nextInt();
        System.out.println("Enter branch of the student");
        String branch = sc.next();
        System.out.println("Enter yop of the student");
        int yop = sc.nextInt();
        System.out.println("Enter cgpa of the student");
        float cgpa = sc.nextFloat();
        Student s = new Student();
        s.giveIntro();

    }
}
