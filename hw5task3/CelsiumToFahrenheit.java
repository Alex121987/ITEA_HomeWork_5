package hw5task3;

public class CelsiumToFahrenheit extends ConverterTemperature {

    @Override
    public double convert(double t) {
        return t * fahrenheitConstant1 + fahrenheitConstant2;
    }
}
