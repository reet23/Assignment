public class JourneyCalculator {
    public static void main(String[] args) {
        Journey j = new Journey();
        double d = j.calculateDistance(60.0, 1.5);
        System.out.println(d);
    }

}

class Journey {
    public double calculateDistance(double speed, double time) {
        double d = speed * time;
        return d;
    }
}
