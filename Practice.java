public class Practice {
    int id;
    String name;
    int roll;
    String section;

    public void introduce() {
        System.out.println("Id:" + id);
        System.out.println("Name:" + name);
        System.out.println("Roll:" + roll);
        System.out.println("Section:" + section);
    }

    public Practice(int id, String name, int roll, String section) {
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.section = section;
        this.introduce();
    }

    public static void main(String[] args) {
        Practice p = new Practice(1, "Reet", 26, "A");
    }
}