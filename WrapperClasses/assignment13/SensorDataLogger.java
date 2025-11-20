package assignment13;

import java.util.ArrayList;
import java.util.List;

public class SensorDataLogger {
    private final List<Double> readings = new ArrayList<>();

    public void add(double value) {
        readings.add(value);
    }

    public void add(Double value) {
        if (value != null) {
            readings.add(value);
        }
    }

    public double average() {
        if (readings.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double value : readings) {
            sum += value;
        }
        return sum / readings.size();
    }

    public void printReadings() {
        for (Double value : readings) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        SensorDataLogger logger = new SensorDataLogger();
        logger.add(24.5);
        logger.add(Double.valueOf(26.0));
        logger.add(25.0);
        logger.printReadings();
        System.out.println(logger.average());
    }
}
