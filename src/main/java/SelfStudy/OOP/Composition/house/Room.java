package SelfStudy.OOP.Composition.house;

public class Room {
    private String name;
    private int numberOfWindows;
    private boolean isTable;
    private int numberOfPlants;

    public Room(String name, int numberOfWindows, boolean isTable, int numberOfPlants) {
        this.name = name;
        this.numberOfWindows = numberOfWindows;
        this.isTable = isTable;
        this.numberOfPlants = numberOfPlants;
    }
    public void putPlantsOnTable(){
        if(isTable){
            System.out.println("Put " + numberOfPlants + " plants on a table");
        } else System.out.println("There is no table in the " + name);
    }
}
