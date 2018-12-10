package SelfStudy.OOP.polimorfizm.car;

class Main{
    public static void main(String[] args) {
       Car car = new Car("Base car",8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.stop());

        Fords ford = new Fords("Fiesta",10);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.stop());

        Opel opel = new Opel("Laguna",10);
        System.out.println(opel.startEngine());
        System.out.println(opel.accelerate());
        System.out.println(opel.stop());

    }
}
