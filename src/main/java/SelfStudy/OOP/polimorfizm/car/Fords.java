package SelfStudy.OOP.polimorfizm.car;

class Fords extends Car{
        public Fords(String name, int cylinders){
            super("Ford",70);
        }
    @Override
    public String startEngine() {
       return "Fords Engine started";
    }

    @Override
    public String accelerate() {
            return"Ford Ziuuuuu przyspieszył";
    }

    @Override
    public String stop() {
        return  " Ford STOP";
    }
}
