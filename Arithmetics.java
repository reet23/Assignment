public class Arithmetics {
    public static void main(String[] args) {
        Additions A = new Additions();
        long sum = A.galacticAddition(125678, 9876543210L);
        System.out.println(sum);

    }
}

class Additions {
    public static long galacticAddition(long num1, long num2) {
        long add = num1 + num2;
        return add;
    }
}