public class Double {
    public static void main(String[] args) {
        DoubleApp D = new DoubleApp();
        int d = D.doubleTheNumber(15);
        System.out.println(d);
    }
}

class DoubleApp {
    public static int doubleTheNumber(int num) {
        int n = num + num;
        return n;
    }
}
