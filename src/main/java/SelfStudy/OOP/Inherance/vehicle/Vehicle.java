package SelfStudy.OOP.Inherance.vehicle;

public class Vehicle {
    private String name;
    private int size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }
    public void steer (int direction){
        this.currentDirection+=direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + "degrees.");
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void move (int velocity, int direction){
        this.currentDirection = direction;
        this.currentVelocity = velocity;
        System.out.println("Vehicle.move(): Moving at" + currentVelocity + " in direction " + currentDirection);
    }
    public void stop (){
        this.currentVelocity = 0;
    }
}