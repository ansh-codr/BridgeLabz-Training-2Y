package assignment8;

public class TemperatureConverter {
    public void convert(double temp, char unit) throws InvalidTemperatureException {
        if (unit == 'C' && temp < -273.15) {
            throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");
        }
        if (unit == 'F' && temp < -459.67) {
            throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");
        }
        if (unit == 'C') {
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println(temp + "°C = " + fahrenheit + "°F");
        } else {
            double celsius = (temp - 32) * 5 / 9;
            System.out.println(temp + "°F = " + celsius + "°C");
        }
    }
}
