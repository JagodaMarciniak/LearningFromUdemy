package SelfStudy.OOP.hamburger;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","wheat","beef",4.20);
        double price = hamburger.finalPrice();
        hamburger.addHamburgerAddition1("onion",0.43);
        hamburger.addHamburgerAddition2("cucumber",0.3);
        hamburger.addHamburgerAddition3("cheese",0.51);
        System.out.println("Total burger price " + hamburger.finalPrice());
        System.out.println("...................");
        HealthyBurger healhlyBurger = new HealthyBurger("beef",5.20);

        healhlyBurger.addHamburgerAddition1("Egg",0.6);
        System.out.println("Total healthy burger price is " + healhlyBurger.finalPrice());
        System.out.println(".......................");

        DeLux burger = new DeLux();
        burger.addHamburgerAddition1("onion",7);
        burger.finalPrice();
    }
}
