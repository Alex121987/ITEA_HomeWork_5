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
        Car mostExpCar = carList.get(0);
        for (Car car: carList) {
            if (car.getPrice() > mostExpCar.getPrice()) {
                mostExpCar = car;
            }
        }
        return mostExpCar;
    }

    public Car getFastestCar() {
        Car fastestCar = carList.get(0);
        for (Car car: carList) {
            if (car.getSpeed() > fastestCar.getSpeed()) {
                fastestCar = car;
            }
        }
        return fastestCar;
    }

    public Car getMostPowerfulCar() {
        Car mostPowerfulCar = carList.get(0);
        for (Car car: carList) {
            if (car.getPower() > mostPowerfulCar.getPower()) {
                mostPowerfulCar = car;
            }
        }
        return mostPowerfulCar;
    }
}

/*
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

*/