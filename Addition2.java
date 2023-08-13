class Addition2 {
    public static void add() {
        System.out.println("Sum=" + (5 + 10));
    }

    public static void add(int a, int b) {
        System.out.println("Sum=" + (a + b));
    }

    public static void add(int a, double b) {
        System.out.println("Sum=" + (a + b));
    }

    public static void add(double a, int b) {
        System.out.println("Sum=" + (a + b));
    }

    public static void main(String[] args) {
        add(7.5, 20);
    }
}
