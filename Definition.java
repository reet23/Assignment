public class Definition {
    public static void main(String[] args) {
        PlanetExplorer P = new PlanetExplorer();
        double Sa = P.calculateSurfaceArea(3.0);
        System.out.println(Sa);

    }
}

class PlanetExplorer {
    public double calculateSurfaceArea(double radius) {
        double A = 4 * 3.142 * radius * radius;
        return A;
    }
}