/**
 * Square
 */
public class Square {

    public static void main(String[] args) {
        Squares s = new Squares();
        int sq = s.squareNumber(7);
        System.out.println(sq);
    }
}

class Squares {
    public static int squareNumber(int num) {
        int n = num * num;
        return n;
    }
}
