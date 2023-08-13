public class Calculator {
    public static void add() {
        int a = 10, b = 20;
        int c = a + b;
        System.out.println("sum=" + c);
    }
}

class CalculatorApp {
    public static void main(String[] args) {
        Calculator.add();
    }
}
