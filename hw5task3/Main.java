package hw5task3;

/**
 * Створіть проєкт з класом Main.java.
 * Створіть ConverterTemperature з методом convert.
 * Реалізуйте для ConverterTemperature класи для конвертації з градусів за Цельсієм в Кельвіни, Фаренгейти.
 * У класу має бути метод convert, який робить конвертацію.
 * Інстанс ConverterTemperature створити неможливо.
 */
public class Main {
    public static void main(String[] args) {
        ConverterTemperature converterCF = new CelsiumToFahrenheit();
        ConverterTemperature converterCK = new CelsiumToKelvin();

        System.out.println(converterCF.convert(30));
        System.out.println(converterCK.convert(30));
    }
}
