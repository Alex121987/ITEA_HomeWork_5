package hw5task3;

public class CelsiumToKelvin extends ConverterTemperature {
    @Override
    public double convert(double t) {
        return t + kelvinConstant;
    }
}
