class Vehicle {
    String brand;

    void start() {
        System.out.println(brand + " กำลังสตาร์ท...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println(brand + " กำลังขับเคลื่อนบนถนน");
    }
}

public class MyInfo {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";

        car.start();
        car.drive();
    }
}