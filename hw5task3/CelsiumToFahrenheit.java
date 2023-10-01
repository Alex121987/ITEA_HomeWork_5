package hw5task3;

public class CelsiumToFahrenheit implements ConverterTemperature {

    @Override
    public double convert(double t) {
        return t * 1.8 + 32;
    }
}
