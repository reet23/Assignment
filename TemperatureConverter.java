public class TemperatureConverter {
    public static void main(String[] args) {
        Converter c = new Converter();
        double d = c.ConvertFahrenheitToCelsius(68.0);
        System.out.println(d);
    }
}

class Converter {
    public double ConvertFahrenheitToCelsius(double fahrenheit) {
        double c = (fahrenheit - 32) * 5 / 9;
        return c;
    }
}