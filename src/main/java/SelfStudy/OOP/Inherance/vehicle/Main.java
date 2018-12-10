package SelfStudy.OOP.Inherance.vehicle;

public class Main {
    public static void main(String[] args) {

        Ford ford = new Ford(36);
        ford.accelerate(30);
        ford.steer(45);
        System.out.println();
        ford.accelerate(20);
    }
}
