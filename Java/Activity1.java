package Activity;
class Car{
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    Car() {
        tyres = 4;
        doors = 4;
    }
    void displayChar(){
        System.out.println("Color " + "= "+color);
        System.out.println("transmission "+"= "+transmission);
        System.out.println("make " + "= " +make);
        System.out.println("tyres " + "= " +tyres);
        System.out.println("doors " + " = " +doors);
    }
    void accelerate() {
        System.out.println("Car is moving forward.");
    }
    void brake() {
        System.out.println("Car has Stopped.");
    }
}
public class Activity1 {
    public static void main(String[] args) {
        Car carName = new Car();
        carName.make = 2014;
        carName.color = "Black";
        carName.transmission = "Manual";
        carName.displayChar();
        carName.accelerate();
        carName.brake();
    }
}
