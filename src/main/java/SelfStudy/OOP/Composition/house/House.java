package SelfStudy.OOP.Composition.house;

public class House {
    private Room room;
    private Plants plants;
    private Table table;

    public House(Room room, Plants plants, Table table) {
        this.room = room;
        this.plants = plants;
        this.table = table;
    }
    public void clean(){
        System.out.println("House --> Putting plants on table");
        table.cleanTable();

    }
    public void careOfPlants(){
        System.out.println("Start to care of plants ");
        plants.waterPlants();
    }
    public Room getRoom(){
        return this.room;
    }
}
