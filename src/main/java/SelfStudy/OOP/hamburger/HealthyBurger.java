package SelfStudy.OOP.hamburger;

public class HealthyBurger extends Hamburger {
    String healthyExtra1;
    double healthyExtraPrice1;
    String healthyExtra2;
    double healthyExtraPrice2;

    public HealthyBurger(String meat, double price) {
        super("healthy", "brown rye", meat, price);

    }
    public void addHealthyAdd1(String name, double price){
        this.healthyExtra1 = name;
        this.healthyExtraPrice1 = price;
    }
    public void addHealthyAdd2(String name, double price){
        this.healthyExtra2 = name;
        this.healthyExtraPrice2 = price;
    }

    @Override
    public double finalPrice() {
        double hamburgerPrice = super.finalPrice();
        if(this.healthyExtra1 != null){
            hamburgerPrice=+this.healthyExtraPrice1;
            System.out.println("Added " + this.healthyExtra1 + " for an extra " + this.healthyExtraPrice1);
        }
        if(this.healthyExtra2 != null){
            hamburgerPrice=+this.healthyExtraPrice2;
            System.out.println("Added " + this.healthyExtra2 + " for an extra " + this.healthyExtraPrice2);
        }
        return hamburgerPrice;
    }
}
