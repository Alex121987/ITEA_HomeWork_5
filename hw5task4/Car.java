package hw5task4;

public class Car {
    private String model;
    private double power;
    private int speed;
    private double price;
    private final int yearOfManufacture = 1967;

    public Car(String model, double power, int speed, double price) {
        this.model = model;
        this.power = power;
        this.speed = speed;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if(power >= 0 && power <= 200)
            this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed >= 0 && speed <= 320)
            this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 0 && price <= 50_000)
            this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public String toString() {
        return  "Brand: " + model  + "\n"+
                "Power: " + power + "\n"+
                "Speed: " + speed + "\n"+
                "Price: " + price + "\n"+
                "Year: " + yearOfManufacture;
    }
}
