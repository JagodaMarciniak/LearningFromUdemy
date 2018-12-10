package SelfStudy.OOP.Composition.house;

public class Table {
    private String madeOf;
    private int size;
    private int numberOflegs;

    public Table(String madeOf, int size, int numberOflegs) {
        this.madeOf = madeOf;
        this.size = size;
        this.numberOflegs = numberOflegs;
    }
    public void cleanTable(){
        System.out.println("Table --> Table cleaned");
            }
}
