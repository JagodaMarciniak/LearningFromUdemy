package SelfStudy.OOP.hamburger;

public class DeLux extends Hamburger{
    String chips;
    String drinks;
    double chipsPrice;
    double drinksPrice;

    public DeLux() {
        super("De Lux", "white", "bacon", 14.54);
        super.addHamburgerAddition1("Chips",3.4);
        super.addHamburgerAddition1("Drinks",5.5);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can not add anything to De Lux burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can not add anything to De Lux burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can not add anything to De Lux burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can not add anything to De Lux burger");
    }
}

