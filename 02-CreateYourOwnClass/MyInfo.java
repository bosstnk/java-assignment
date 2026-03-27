class Car {
    private String brand;
    private int speed;

    public void setBrand(String newBrand) {
        brand = newBrand;
    }
    public void setSpeed(int newSpeed) {
        if (newSpeed >= 0) {
            speed = newSpeed; 
        } else {
            System.out.println( "Speed must be positive");
        }
    }
    public String getBrand() {
        return brand;
    }
    public int getSpeed() {
        return speed;
    }
    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

class Main {
    public static void run() {
        Car car = new Car();
        car.setBrand("Porsche");
        car.setSpeed(322);
        car.displayInfo();
    }
}

public class MyInfo {
    public static void main(String[] args) {
        Main.run();
    }
}