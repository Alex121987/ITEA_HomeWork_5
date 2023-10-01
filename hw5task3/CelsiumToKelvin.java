package hw5task3;

public class CelsiumToKelvin implements ConverterTemperature {
    @Override
    public double convert(double t) {
        return t + 273.15;
    }
}
