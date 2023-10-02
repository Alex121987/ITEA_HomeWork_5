package hw5task3;

abstract class ConverterTemperature {
    public final double fahrenheitConstant1 = 1.8;
    public final double fahrenheitConstant2 = 32;
    public final double kelvinConstant = 273.15;
    abstract double convert(double temperature);
}
