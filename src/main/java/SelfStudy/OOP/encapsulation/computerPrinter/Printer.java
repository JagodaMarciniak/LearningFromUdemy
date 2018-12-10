package SelfStudy.OOP.encapsulation.computerPrinter;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted = 0;
    private boolean isDuplex;

    public Printer(int numberOfPagesPrinted, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel=-1;
        }
            this.numberOfPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int fillUpToner(int supplement) {
        if (supplement > 0 && supplement<=100) {
            if (this.tonerLevel + tonerLevel > 100) {
                return -1;
            }
            this.tonerLevel += supplement;
            System.out.println("Toner filling up ");
            return this.tonerLevel;
        }else{
            return -1;
        }

    }
        public int getNumberOfPagesPrinted () {
            System.out.println("Toner level is " + tonerLevel + "now");
            return numberOfPagesPrinted;
        }

        public int printPages(int numberOfPages){
        int pagesToPrint = numberOfPages;
        if(this.isDuplex) {
               pagesToPrint=(numberOfPages/2)+ (numberOfPages%2);
            System.out.println("Printing in duplex mode");
            }
            this.numberOfPagesPrinted+=pagesToPrint;
        return pagesToPrint;
        }
    }
