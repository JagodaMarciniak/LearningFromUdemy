package SelfStudy.OOP.encapsulation.computerPrinter;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println(printer.getNumberOfPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println(pagesPrinted + "total print" + printer.getNumberOfPagesPrinted());

    }
}
