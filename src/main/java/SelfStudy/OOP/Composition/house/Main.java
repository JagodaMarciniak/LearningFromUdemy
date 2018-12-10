package SelfStudy.OOP.Composition.house;

public class Main {
    public static void main(String[] args) {
      Room livingroom = new Room("Livingroom",4,true,10);
      Plants redRoses = new Plants("Roses","red",3);
      Table woodenTable = new Table("wood",200,4);

      House casa = new House(livingroom,redRoses,woodenTable);
      casa.clean();
      casa.careOfPlants();
        System.out.println();
      casa.getRoom().putPlantsOnTable();
    }
}
