package SelfStudy.OOP.polimorfizm.car;

class Opel extends Car{
        public Opel(String name, int cylinders){
            super("Ford",70);
        }
    @Override
    public String startEngine() {
       return "Opel Engine started";
    }

    @Override
    public String accelerate() {
            return"Opel Ziuuuuu przyspieszył";
    }

    @Override
    public String stop() {
        return  " Opel STOP";
    }
}

