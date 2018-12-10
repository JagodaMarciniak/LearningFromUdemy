package SelfStudy.OOP.hamburger;

public class Hamburger {
    String name;
    String roolType;
    String meat;
    double price;
    String add1;
    double add1Price;
    String add2;
    double add2Price;
    String add3;
    double add3Price;
    String add4;
    double add4Price;


    public Hamburger(String name, String roolType, String meat, double price) {
        this.name = name;
        this.roolType = roolType;
        this.meat = meat;
        this.price = price;
    }
    public void addHamburgerAddition1(String name,double price){
        this.add1 = name;
        this.add1Price = price;
    }
    public void addHamburgerAddition2(String name,double price){
        this.add2 = name;
        this.add2Price = price;
    }
    public void addHamburgerAddition3(String name,double price){
        this.add3 = name;
        this.add3Price = price;
    }
    public void addHamburgerAddition4(String name,double price){
        this.add4 = name;
        this.add4Price = price;
    }


    public double finalPrice() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + "on a " + this.roolType + " roll " + "with " + this.meat + " price is " + this.price);
        if(this.add1 != null){
            hamburgerPrice+=this.add1Price;
            System.out.println("Added " + this.add1 + " for an ekstra " + this.add1Price);
        }
        if(this.add2 != null){
            hamburgerPrice+=this.add2Price;
            System.out.println("Added " + this.add2 + " for an ekstra " + this.add2Price);
        }
        if(this.add3 != null){
            hamburgerPrice+=this.add3Price;
            System.out.println("Added " + this.add3 + " for an ekstra " + this.add3Price);
        }
        if(this.add4 != null){
            hamburgerPrice+=this.add4Price;
            System.out.println("Added " + this.add4 + " for an ekstra " + this.add4Price);
        }
        return hamburgerPrice;
    }

}