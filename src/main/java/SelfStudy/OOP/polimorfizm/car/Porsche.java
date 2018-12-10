package SelfStudy.OOP.polimorfizm.car;

class Porsche extends Car {
    @Override
    public String accelerate() {
        return "Porsche przyspieszył";
    }

    public Porsche() {
        super("porscha", 40);

    }
}
