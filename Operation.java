public class Operation {
    public static void main(String[] args) {
        Arithmetic A = new Arithmetic();
        int b = A.substractNumbers(30, 20);
        System.out.println(b);
        int c = A.multiplyNumbers(2, 3);
        System.out.println(c);
        int d = A.divideNumbers(4, 2);
        System.out.println(d);
        int e = A.findRemainder(6, 3);
        System.out.println(e);
    }
}

class Arithmetic {
    public static int substractNumbers(int num1, int num2) {
        int sub = num1 - num2;
        return sub;
    }

    public static int multiplyNumbers(int num1, int num2) {
        int mul = num1 * num2;
        return mul;
    }

    public static int divideNumbers(int num1, int num2) {
        int div = num1 / num2;
        return div;
    }

    public static int findRemainder(int num1, int num2) {
        int rem = num1 % num2;
        return rem;
    }
}
