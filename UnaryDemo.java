
public class UnaryDemo {

    public static void main(String[] args) {
        int x = 10;
        int y = x++ + x++ + ++x + x + x++;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}