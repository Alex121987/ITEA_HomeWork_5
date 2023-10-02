package hw5task4;

import java.util.ArrayList;
import java.util.Comparator;

public class CarInfo {
    ArrayList<Car> carList = new ArrayList<>();

    public void addCar(Car car) {
        if (!carList.contains(car)) {
            carList.add(car);
        }
    }

    public Car getMostExpensiveCar() {
        PriceComparator comparator = new PriceComparator();
        carList.sort(comparator);
        return carList.get(carList.size()-1);
    }

    public Car getFastestCar() {
        SpeedComparator comparator = new SpeedComparator();
        carList.sort(comparator);
        return carList.get(carList.size()-1);
    }

    public Car getMostPowerfulCar() {
        PowerComparator comparator = new PowerComparator();
        carList.sort(comparator);
        return carList.get(carList.size()-1);
    }
}

class SpeedComparator implements Comparator<Car> {
    public int compare(Car car1, Car car2) {
        if (car1.getSpeed() == car2.getSpeed()) {
            return 0;
        }
        if (car1.getSpeed() > car2.getSpeed()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}

class PriceComparator implements Comparator<Car> {
    public int compare(Car car1, Car car2) {
        if (car1.getPrice() == car2.getPrice()) {
            return 0;
        }
        if (car1.getPrice() > car2.getPrice()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}

class PowerComparator implements Comparator<Car> {
    public int compare(Car car1, Car car2) {
        if (car1.getPower() == car2.getPower()) {
            return 0;
        }
        if (car1.getPower() > car2.getPower()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}