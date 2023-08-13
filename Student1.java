
class Student1 {
    String name;
    int roll;
    String branch;
    int yop;
    float cgpa;

    public void giveIntro() {
        System.out.println("name=" + name);
        System.out.println("roll=" + roll);
        System.out.println("branch=" + branch);
        System.out.println("yop=" + yop);
        System.out.println("cgpa=" + cgpa);

    }

    public Student1(String n, int r, String b, int y, float c) {
        name = n;
        roll = r;
        branch = b;
        yop = y;
        cgpa = c;

    }
}

class Student1App {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Deep", 1, "CSE", 2017, 7.9f);
        s1.giveIntro();
        Student1 s2 = new Student1("Aalia", 2, "CSE", 2018, 8.9f);
        s2.giveIntro();

    }
}
