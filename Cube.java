/**
 * InnerCube
 */
public class Cube {
    public static void main(String[] args) {
        Cubes c = new Cubes();
        int cu = c.CubeNumber(3);
        System.out.println(cu);
    }

}

class Cubes {
    public static int CubeNumber(int num) {
        int c = num * num * num;
        return c;
    }
}