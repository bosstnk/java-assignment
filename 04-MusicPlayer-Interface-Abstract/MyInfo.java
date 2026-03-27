// Interface
interface Playable {
    void play();
}

// Abstract class
abstract class MusicDevice {
    String brand;

    // method ปกติ
    public void info() {
        System.out.println("เครื่องเล่นเพลงยี่ห้อ " + brand);
    }

    // abstract method
    abstract void connect();
}

// CDPlayer class
class CDPlayer extends MusicDevice implements Playable {


    void connect() {
        System.out.println("เชื่อมต่อแผ่น CD...");
    }

    public void play() {
        System.out.println("กำลังเล่นเพลงจาก CD");
    }
}

// Smartphone class
class Smartphone extends MusicDevice implements Playable {

    void connect() {
        System.out.println("เชื่อมต่อผ่าน Bluetooth...");
    }

    public void play() {
        System.out.println("กำลังเล่นเพลงจาก Spotify");
    }
}

// Main class
public class MyInfo {
    public static void main(String[] args) {

        CDPlayer cd = new CDPlayer();
        cd.brand = "Sony";
        Smartphone phone = new Smartphone();
        phone.brand = "Apple";

        // CD Player
        cd.connect();
        cd.info();
        cd.play();

        System.out.println("----------------");

        // Smartphone
        phone.connect();
        phone.info();
        phone.play();
    }
}