package SelfStudy.OOP.polimorfizm.car;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }
    public String startEngine(){
        return "Car Engine started";
    }
    public String accelerate(){
        return"Car Ziuuuuu przyspieszył";
    }
    public String stop (){
        return " Car STOP";
    }


    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

